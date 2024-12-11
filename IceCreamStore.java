package com.example.javafx.javaproject;

public class IceCreamStore {
    private String[][] login = {
            {"Fathima", "ice123"},
            //{"Oscar", "cream123"},
    };
    private String[] items = {"Figo", "Tiramasu", "Mango", "Vanilla"};
    private double[] itemPrice = {10.75, 13.75, 11.75, 12.75};
    private final double tax_Rate = 0.08;
    private int quantity = 1;


    public String getUsername()
    {
        return login[0][0];
    }
    //Methods to validate the password associated to the username
    public String getPassword()
    {
        return login[0][1];
    }
    public Double getPrice(String item)
    {
        for(int i = 0; i< items.length; i++)
        {
            if (items[i].equals(item))
            {
                return itemPrice[i];
            }
        }
        return null;
    }
    //Method to return all the items
    public  String [] getItemName()
    {
        return items;
    }

    //Method to calculate the cost with item name and quantity
    public  double calcCost(String item, int quantity)
    {
        double cost = getPrice(item);
        return quantity * cost;
    }
    //Method to calculate tax based on cost
    public double calcTaxes(double cost)
    {
        return cost * tax_Rate;
    }
    //Method to calculate total cost with tax
    public double calcTotalCost(double cost)
    {
        double taxes = calcTaxes(cost);
        return cost + taxes;
    }
}


