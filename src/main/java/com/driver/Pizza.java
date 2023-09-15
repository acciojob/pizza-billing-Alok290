package com.driver;

public class Pizza {

    private int price;//total price
    private Boolean isVeg;
    private String bill; //total bill
    private int cheesePrice;
    private int toppingPrice;
    private int bagPrice;

    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isBagAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppingPrice = 70;
        }else{
            this.price = 400;
            this.toppingPrice = 120;

        }
        this.cheesePrice = 80;
        this.bagPrice = 20;
        this.bill ="Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            price = price+cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            price = price+toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isBagAdded==false)
        {
            price= price+bagPrice;
            isBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false)
        {
            if(isCheeseAdded){
                bill = bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingAdded){
                bill = bill+"Extra Topping Added: "+this.toppingPrice+"\n";
            }
            if(isBagAdded){
                bill = bill+"Paperbag Added: "+this.bagPrice+"\n";
            }
            bill = bill+"Total Price: "+price+"\n";

            isBillGenerated = true;

        }
        return this.bill;
    }
}
