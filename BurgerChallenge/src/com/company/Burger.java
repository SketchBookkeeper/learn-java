package com.company;

public class Burger {
    private String roll;
    private String meat;
    private String totalList;
    private double price;
    private int additionsCount = 0;
    private int maxAdditions = 4;

    public Burger(String roll, String meat, double price) {
        this.roll = roll;
        this.meat = meat;
        this.price = price;
        this.totalList = "Burger : " + price + "\n";
    }

    public String getTotalList() {
        return totalList;
    }

    public void setTotalList(String totalList) {
        this.totalList = totalList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAdditionsCount() {
        return additionsCount;
    }

    public void setAdditionsCount(int additionsCount) {
        this.additionsCount = additionsCount;
    }

    public int getMaxAdditions() {
        return maxAdditions;
    }

    public void setMaxAdditions(int maxAdditions) {
        this.maxAdditions = maxAdditions;
    }

    public void addAddition(BurgerAddition addition) {
        if (this.additionsCount < this.maxAdditions) {
            this.additionsCount++;

            double price = this.getPrice();
            double additionPrice = addition.getPrice();
            this.setPrice(price + additionPrice);

            this.totalList += addition.getName() + " : " + addition.getPrice() + "\n";
        } else {
            System.out.println("You may not add any more additions.");
        }
    }

    public void showTotal() {
        System.out.println(this.getTotalList() +
                "Total : " + this.getPrice());
    }
}
