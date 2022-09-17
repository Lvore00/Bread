package Bread;

public class Ciabatta extends Bread{
    //Data

    private double sugar;
    private double bakingP;
    private String breadName;
    private String state;

    public Ciabatta(){
        super(4.0,3.0,1.25,1.0,2.0);
        setBakingP(2.0);
        setBreadName("Ciabatta");
        setState("Not done!");
        setSugar(2.0);

    }

    // Constructor

    public Ciabatta(double flour, double water, double salt, double yeast,
                    double starter, double sugar, double bakingP,
                    String breadName, String state) {
        super(flour, water, salt, yeast, starter);
        this.sugar = sugar;
        this.bakingP = bakingP;
        this.breadName = breadName;
        this.state = state;

    }

    //Getters and Setters


    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBakingP() {
        return bakingP;
    }

    public void setBakingP(double bakingP) {
        this.bakingP = bakingP;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    // Instance Method


    public void howtoCiabatta(){
        System.out.println("After dough mixture is made, let the dough sit and rise " +
                "for at least 15 to 20 hours, covered");
    }
@Override
    public String getRecipe(){
        return " 1. Bake bread in a bake-able pan at 475 degrees F" + "\n"
                + "2. Place into the oven, let bake until dark brown" +
                "\n" + "3. Bake for 35 - 45 minutes " + "\n" +
                "4. Let bread rest and cool overnight";

    }
    @Override
    public String getIngredients(){
        return super.Ingredients() + "\nSugar: " + getSugar() +
                "\nBaking Powder: " + getBakingP() +
                "\nBread Name: " + getBreadName() +
                "\nBread State: " + getState();
    }


    // String toString
@Override
    public String toString() {
        return getIngredients() + "\n" + getRecipe() +
                "\n" + getState();
    }
}
