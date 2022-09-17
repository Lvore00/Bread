package Bread;

public class Muffins extends Bread {
    //Data


    private double sugar;
    private double bakingP;
    private String breadName;
    private String state;

    public Muffins(){
        super(7.5,3.5,2.5,1.5,1.25);
        setBakingP(2.25);
        setBreadName("Muffins");
        setState("Not done!");
        setSugar(4.0);

    }

    // Constructor

    public Muffins(double flour, double water, double salt, double yeast,
                   double starter, double sugar, double bakingP,
                   String breadName, String state) {
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



    // Instance Methods

    public void howtoMuffin() {
        System.out.println("Make sure to not fill the muffin cups all " +
                "the way to the top! Leave room for the muffins to raise in the " +
                "oven");
    }

    @Override
    public String getIngredients(){
        return super.Ingredients() + "\nSugar: " + getSugar() +
                "\nBaking Powder: " + getBakingP() +
                "\nBread Name: " + getBreadName() +
                "\nBread State: " + getState();
    }

    public String getRecipe(){
        return "1. Fill muffin cups half way in a muffin pan" + "\n" +
                "2. Place into oven at 400 degrees F" + "\n" +
                "3. Set timer to 18-24 minutes until cooked all the way through";
    }

    //String toString
    @Override
    public String toString() {
        return getIngredients() + "\n" + getRecipe() +
                "\n" + getState();
    }



}
