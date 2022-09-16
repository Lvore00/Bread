package Bread;

public class Ciabatta extends Bread{
    //Data

    private double flour;
    private double water;
    private double salt;
    private double yeast;
    private double starter;
    private double sugar;
    private double bakingP;
    private String breadName;
    private String state;
    private String recipe;

    // Constructor

    public Ciabatta(double flour, double water, double salt, double yeast,
                    double starter, double sugar, double bakingP,
                    String breadName, String state, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.yeast = yeast;
        this.starter = starter;
        this.sugar = sugar;
        this.bakingP = bakingP;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }

    //Getters and Setters

    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public double getStarter() {
        return starter;
    }

    public void setStarter(double starter) {
        this.starter = starter;
    }

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

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    // Instance Method

    public void howtoCiabatta(){
        System.out.println("After dough mixture is made, let the dough sit and rise " +
                "for at least 15 to 20 hours, covered");
    }

    //public void recipe(){
    // return
//    }








    // String toString

    public String toString() {
        return "Ciabatta: " +
                flour + " cup(s) of flour" + "\n" +
                water + " cup(s) of water" + "\n" +
                salt + " tsp(s) of salt" + "\n" +
                yeast + " tsp(s) of yeast" + "\n" +
                sugar + " cup(s) of sugar" + "\n" +
                bakingP + " tsp(s) of baking powder" + "\n" +
                starter + " cup(s) of ripe ciabatta starter" + "\n" +
                "Bread Name: " + breadName + "\n" +
                "Bread State: " + state + "\n" +
                "Recipe: " + recipe;
    }
}
