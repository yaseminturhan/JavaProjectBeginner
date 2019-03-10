package services;


	import proje.Movie;
	import proje.Action;
	import proje.Comedy;
	import proje.Drama;
	import proje.Fantastic;
	import proje.Romance;
	import proje.Scifi;

	import java.io.*;
	import java.util.*;

	public class ProductServiceImpl implements ProductServices {

	    static int id = 1;

	    static File file = new File("movie.txt");
	    static File tempFile = new File("movietemp.txt");
	    static Scanner info = new Scanner(System.in);


	    public void deleteProduct(int id) {
	        Map<Integer,String> tempMap = new HashMap<>();
	        try {

	            BufferedReader buff = new BufferedReader(new FileReader(file));
	            while (buff.ready()) {
	                String read = buff.readLine();
	                String productArrays[] = read.split(":");
	                tempMap.put(Integer.parseInt(productArrays[0]), read);
	            }
	            tempMap.remove(id);
	            buff.close();

	            BufferedWriter buffw = new BufferedWriter(new FileWriter(tempFile, true));

	            for (Map.Entry<Integer, String> entry : tempMap.entrySet())
	            {
	                buffw.write(entry.getValue());
	                buffw.newLine();
	            }

	            tempFile.renameTo(file);
	            buffw.close();

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }


	    }

	    public void addProduct() {
	        try {
	            BufferedWriter buffw = new BufferedWriter(new FileWriter(file, true));

	            System.out.println("Product name");
	            String name = info.next();

	            System.out.println("Product quantity (Type integer)");
	            int quantity = info.nextInt();

	            System.out.println("Product price (Type integer)");
	            int price = info.nextInt();

	            System.out.println("Product Type (Action or Romance)");
	            String type = info.next();

	            Action Action = null;
	            Romance Romance = null;
	            if (type.equalsIgnoreCase("Action")) {
	                Action = new Action(id, quantity, name, price);
	            } else if (type.equalsIgnoreCase("Romance")) {
	                	Romance = new Romance(id, quantity, name, price);
	            }


	            if (Action != null) {
	                buffw.write(Action.toString());
	            } else {
	                buffw.write(Romance.toString());
	            }

	            buffw.newLine();
	            buffw.close();

	            id++;
	        } catch (IOException e) {
	            e.printStackTrace();

	        }

	    }

	    public List<String> listProduct() {
	        List<String> movie = new ArrayList<>();
	        try {
	            BufferedReader buff = new BufferedReader(new FileReader(file));
	            while (buff.ready()) {
	                String read = buff.readLine();
	                movie.add(read);
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return movie;
	    }
	}



