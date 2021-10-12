/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.util.ArrayList;

public class Solution44 {

    private final String fileName;

    public Solution44(String fileName) {

        // Standard setting everything equal
        // Filled in code to get rid of an error I swear
        this.fileName = fileName;

    }

    public static void main(String[] args) {

        // Create new Solution44 with fileName attached

        String userInput;
        int indexOfProduct;

        ArrayList products = jsonToProduct();

        // do while( index is not -1 )
            // take userInput
            // find index of product

        getProductInfo(indexOfProduct);

    }

    public String takeNameInput() {

        // return nextLine

        return null;

    }

    public ArrayList<Product> jsonToProduct() {

        // Create collection = arrayList()
        // use gson.fromJson()

        // return that collection

        return null;

    }

    public String getProductInfo(int index, ArrayList<Product> products) {

        String output;

        // add the name of product at index
        // add the price of product at index
        // add the quantity of product at index

        return output;

    }

    public int checkName(String name, ArrayList<Product> products) {

        // for loop through the entire products arraylist
            // Search for a matching name
                // if found, return index
        return -1;

    }

}
