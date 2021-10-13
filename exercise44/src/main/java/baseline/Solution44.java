/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution44 {

    private final String fileName;
    private static final Scanner kb = new Scanner(System.in);

    public Solution44(String fileName) {

        // Standard initialization of private variables
        this.fileName = fileName;

    }

    public static void main(String[] args) throws IOException {

        // Create new Solution44 with fileName attached
        Solution44 app = new Solution44("exercise44_input.txt");

        String userInput;
        int indexOfProduct;

        ArrayList products = app.jsonToProduct();

        // do while( index is not -1 )
        do {
            // take userInput
            userInput = app.takeNameInput();
            // find index of product
            indexOfProduct = app.checkName(userInput, products);
        } while(indexOfProduct != -1);

        System.out.println(app.getProductInfo(indexOfProduct, products));

    }

    public String takeNameInput() {

        // return nextLine
        return kb.nextLine();

    }

    public ArrayList<Product> jsonToProduct() {

        System.out.println("1");

        ClassLoader classLoader = Solution44.class.getClassLoader();
        String pathToJson = classLoader.getResource(fileName).getPath();
        Scanner in = new Scanner(pathToJson);

        System.out.println("2");

//        String content = Files.readString(Path.of(System.getProperty("user.dir") + "/src/main/java/resources/" + fileName + "/"),
//                StandardCharsets.US_ASCII);

        Gson gson = new Gson();
        String jsonText = "{" +
                "'products' : [" +
                "{'name': 'Widget', 'price': 25.00, 'quantity': 5 }," +
                "{'name': 'Thing', 'price': 15.00, 'quantity': 5 }," +
                "{'name': 'Doodad', 'price': 5.00, 'quantity': 10 }" +
                "]" +
                "}";

        System.out.println("4");

        Product[] products = gson.fromJson(jsonText, Product[].class);

//        Product[] products = gson.fromJson("{\n\t\"products\" : [" +
//                "\n\t\t{\"name\": \"Widget\", \"price\": 25.00, \"quantity\": 5 }," +
//                "\n\t\t{\"name\": \"Thing\", \"price\": 15.00, \"quantity\": 5 }," +
//                "\n\t\t{\"name\": \"Doodad\", \"price\": 5.00, \"quantity\": 10 }\n\t]\n}", (Type) Product.class);

        System.out.println("5");

        System.out.println(products);

        System.out.println("6");

        /*
        TEST CODE
        */
        ArrayList<Product> names = new ArrayList<>();
        return names;

//
//        // Create arrayList
//        ArrayList<Product> products = new ArrayList();
//
//        // use gson.fromJson()
//        System.out.println(gson.fromJson(content, Product.class));
//        products.add(new Product("Widget",25.0, 5));
//
//        // Product product = gson.fromJson(in.nextLine(), Product.class);
//
//        // return that arrayList
//        return products;

    }

    public String getProductInfo(int index, ArrayList<Product> products) {

        String output = "";

        // add the name of product at index
        output += "Name: " + products.get(index).getName();
        // add the price of product at index
        output += "Price: " + products.get(index).getPrice();
        // add the quantity of product at index
        output += "Quantity: " + products.get(index).getQuantity();

        return output;

    }

    public int checkName(String name, ArrayList<Product> products) {

        // for loop through the entire products arraylist
        for(int i = 0; i < products.size(); i++)
            // Search for a matching name
            if(name.equals(products.get(i).getName()))
                // if found, return index
                return i;
        return -1;

    }

}

