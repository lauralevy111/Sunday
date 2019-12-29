package com.example.sunday;

public class Book {

    public String name;
    public double price;
    public String description;

    public int inventory;

    public Book(String name, double price, String description, int initialInventory){
        this.name=name;
        this.price=price;
        this.description=description;
        this.inventory=initialInventory;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public int getInventory(){
        return inventory;
    }

    public void sellItem(int quantity){
        inventory-=quantity;
    }

    @Override
    public String toString(){
        String itemProfile = "Item Profile: \n" +
                "Name- "+name+"\n" +
                "Price- "+price+"\n" +
                "Description- "+description+"\n" +
                "Inventory- "+inventory;
        return itemProfile;
    }
}
