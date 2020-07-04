package com.learningjava;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    public void addGroceryItem(String item) {
        groceryList.add(item); //how you add elements to the array list
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for (int i=0; i<groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));

        }
    }

    public void modifyGroceryItem(int position, String newItem) {

        groceryList.set(position, newItem);

        System.out.println("Grocery item " + (position+1) + "has been modified");

    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        //Milk
        //Cheese //Will automatically shift array elements when an item is removed
        //Bread

    }

    public String findItem(String searchItem) {   //Finds specific item in grocery list using built in java function

        //boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(position>=0) {

            return groceryList.get(position);
        }

        return null;
    }
}
