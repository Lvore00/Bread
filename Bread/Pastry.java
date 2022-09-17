package Bread;

public class Pastry extends Bread{
    //Data

    private double sugar;
    private double bakingP;
    private String breadName;
    private String state;

    public Pastry(){
        super(4.5,2.5,1.0,0.5,0.5);
        setBakingP(1.5);
        setBreadName("Pastry");
        setState("Not done!");
        setSugar(3.0);

    }

    // Constructor

    public Pastry(double flour, double water, double salt,
                  double yeast, double starter, double sugar,
                  double bakingP, String breadName, String state) {
        super(flour, water, salt, yeast, starter);
        this.sugar = sugar;
        this.bakingP = bakingP;
        this.breadName = breadName;
        this.state = state;
    }

    // Getters and Setters

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


    //Instance Methods

 public void howtoPastry(){
        System.out.println("Before you knead the pastry dough, " +
                "make sure to let the dough set for 5-10 minutes before rolling");
 }

    public String getIngredients(){
        return super.Ingredients() + "\nSugar: " + getSugar() +
                "\nBaking Powder: " + getBakingP() +
                "\nBread Name: " + getBreadName() +
                "\nBread State: " + getState();
    }

    public String getRecipe(){
        return "1. Roll out dough onto a floured surface" + "\n" +
                "2. Fill dough with any filling of your desire" + "\n" +
                "3. Fold dough over filling and place on baking sheet" + "\n" +
                "4. With the oven at 420 degrees F, cook pastries for 18-20 min";
    }

    //String toString
    @Override
    public String toString() {
        return getIngredients() + "\n" + getRecipe() +
                "\n" + getState();
    }



}
