package Bread;

public class Sourdough extends Bread{
    //Data

    private double flour;
    private double water;
    private double salt;
    private double yeast;
    private double starter;
    private String breadName;
    private String state;
    private String recipe;

    // Constructor

    public Sourdough(double flour, double water, double salt,
                     double yeast, double starter, String breadName,
                     String state, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.yeast = yeast;
        this.starter = starter;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }

    // Getters and Setters
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

    // Instance Methods

    public void howtoSourdough(){
        System.out.println("Before baking: Make sure to leave newly mixed dough" +
                " in a bowl and covered for 30 minutes to 1 hour to rest before kneading out");
    }
 //   public void recipe() {
  //      this(5.00, 1.50, 2.50,1.00,1.00,
  //              "'Sourdough Bread'", "Being Baked", "Mix, Rest, Knead, Bake!"); */
   // }




    // String toString

    public String toString(){

        return "Sourdough: " +
                flour + " cup(s) of flour" + "\n" +
                water + " cup(s) of water" + "\n" +
                salt + " tsp(s) of salt" + "\n" +
                yeast + " tsp(s) of yeast" + "\n" +
                starter + " cup(s) of ripe sourdough starter" + "\n" +
                "Bread Name: " + breadName + "\n" +
                "Bread State: " + state + "\n" +
                "Recipe: " + recipe;
    }
}
