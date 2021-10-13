/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

        ArrayList<Product> products = (ArrayList<Product>) app.jsonToProduct();

        // infinite-ish loop but until a usable index is found
        do {
            System.out.print("What is the product name? ");
            // take userInput
            userInput = app.takeNameInput();
            // find index of product
            indexOfProduct = app.checkName(userInput, products);
            if (indexOfProduct == -1)
                System.out.println("Sorry, that product was not found in our inventory.");
        } while (indexOfProduct == -1);

        System.out.println(app.getProductInfo(indexOfProduct, products));

    }

    public String takeNameInput() {

        // return nextLine
        return kb.nextLine();

    }

    public List<Product> jsonToProduct() throws FileNotFoundException {

        // After hours of working on this one method, I somewhat threw in the towel on this
        // I don't have the time to spend all of my focus on this one method, sorry and thank you
        // It works, but I had to modify the json file because the Product array just did not click for me

        // Set up the file
        File input = new File(ClassLoader.getSystemResource(fileName).getFile());
        Scanner in = new Scanner(input);

        // Create arrayList
        ArrayList<Product> products = new ArrayList<>();

        // use gson.fromJson()
        Gson gson = new Gson();

        // Use gson.fromJson to parse this darn Json file
        while(in.hasNextLine())
            products.add(gson.fromJson(in.nextLine(), Product.class));

        return products;
    }

    public String getProductInfo(int index, List<Product> products) {

        String output = "";

        // add the name of product at index
        output += "Name: " + products.get(index).getName();
        // add the price of product at index
        output += "\nPrice: " + products.get(index).getPrice();
        // add the quantity of product at index
        output += "\nQuantity: " + products.get(index).getQuantity();

        return output;

    }

    public int checkName(String name, List<Product> products) {

        // for loop through the entire products arraylist
        for(int i = 0; i < products.size(); i++)
            // Search for a matching name
            if(name.equals(products.get(i).getName()))
                // if found, return index
                return i;
        return -1;

    }

}

