package com.bridgelabz.workshop2;
/*
Write a Java program to create a class called "Restaurant" with attributes for menu items,
 prices, and ratings, and methods to add and remove items, and to calculate average rating.
 */
import java.util.*;
class restaurantDetails {
    public List<String> menuItems;
    public List<Integer> ratings;
    public List<Double> prices;

    public restaurantDetails(){
        menuItems=new ArrayList<>();
        ratings=new ArrayList<>();
        prices= new ArrayList<>();
    }
    //Add details
    public void addDetails(String menuItem, double price, int rating){
        menuItems.add(menuItem);
        prices.add(price);
        ratings.add(rating);
    }
    //Remove details
    public void removeDetails(String menuItem){
        int i = menuItems.indexOf(menuItem);
        if(i >= 0){
            menuItems.remove(i);
            prices.remove(i);
            ratings.remove(i);
            System.out.println("Item removed successfully");
        }else{
            System.out.println("Item not present in the menu.");
        }
    }
    //Calculate average rating
    public double ratingAverage(){
        if(ratings.isEmpty()){
            double empty = 0.0;
            return empty;
        }
        int sum =0;
        for(int rating : ratings){
            sum +=rating;
        }
        double result = (double) sum/ratings.size();
        return result;

    }

}
public class Restaurant{
    public static void main(String[] args) {
        restaurantDetails rest = new restaurantDetails();
        rest.addDetails("Coke", 20,5);
        rest.addDetails("Pizza", 180,4);
        rest.addDetails("French Fries", 40,3);

        double averageRating=rest.ratingAverage();
        System.out.println("Average rating of the restaurant: "+ averageRating);

        //Remove an item
        rest.removeDetails("Coke");
        averageRating=rest.ratingAverage();
        System.out.println("Average rating of the restaurant after removing the above item: "+ averageRating);

    }
}
