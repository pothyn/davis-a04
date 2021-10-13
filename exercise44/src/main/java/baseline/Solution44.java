/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import com.google.gson.Gson;

import java.io.IOException;
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
        Solution44 app = new Solution44("exercise44_input.json");

        String userInput;
        int indexOfProduct;

        ArrayList<Product> products = app.jsonToProduct();

        // do while( index is not -1 )
        do {
            System.out.print("What is the product name? ");
            // take userInput
            userInput = app.takeNameInput();
            // find index of product
            indexOfProduct = app.checkName(userInput, products);
            if(indexOfProduct == -1)
                System.out.println("Sorry, that product was not found in our inventory.");
        } while(indexOfProduct == -1);

        System.out.println(app.getProductInfo(indexOfProduct, products));

    }

    public String takeNameInput() {

        // return nextLine
        return kb.nextLine();

    }

    public ArrayList<Product> jsonToProduct() {

        // Set up the file
        ClassLoader classLoader = Solution44.class.getClassLoader();
        String pathToJson = classLoader.getResource(fileName).getPath();
        Scanner in = new Scanner(pathToJson);

//        File input = new File(ClassLoader.getSystemResource(fileInputName).getFile());
//        Scanner in = new Scanner(input);

//        String content = Files.readString(Path.of(System.getProperty("user.dir") + "/src/main/java/resources/" + fileName + "/"),
//                StandardCharsets.US_ASCII);

        // Create arrayList
        ArrayList<Product> products = new ArrayList<>();

        // use gson.fromJson()
        Gson gson = new Gson();
        String jsonText = "{'name': 'Widget', 'price': 25.00, 'quantity': 5 }";

        // Use gson.fromJson to parse the darn Json file
//        products.add(gson.fromJson(in.nextLine(), Product.class));
//
//        return products;

    }

    public String getProductInfo(int index, ArrayList<Product> products) {

        String output = "";

        // add the name of product at index
        output += "Name: " + products.get(index).getName();
        // add the price of product at index
        output += "\nPrice: " + products.get(index).getPrice();
        // add the quantity of product at index
        output += "\nQuantity: " + products.get(index).getQuantity();

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

