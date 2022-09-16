package Bread;


public class Bread {
    //Data

    private double flour;
    private double water;
    private double salt;
    private double yeast;
    private double starter;

    //Constructors
 public Bread (){
     this.flour = flour;
     this.water = water;
     this.salt = salt;
     this.yeast = yeast;
     this.starter = starter;
 }

    public Bread(double flour, double water, double salt, double yeast, double starter) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.yeast = yeast;
        this.starter = starter;
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

    //Instance Methods
   /** public void bake(){
     System.out.println("Bread is being baked! Not baked all the way" +
             " yet!");

    }

    **/
//   public String getIngredients(){
//       return "Flour: " + getFlour() + "\nSalt: " +  getSalt() + "\nStarter: " +  getStarter(), getWater(), getYeast();
//
//   }
//


    //String toString

    public String toString() {
        return "Bread: " +
                flour + " cup(s) of flour"+ "\n" +
                water + " cup(s) of water" + "\n" +
                salt + " tsp(s) of salt" + "\n" +
                yeast + " tsp(s) of yeast" + "\n" +
                starter + " cup(s) of starter" ;
    }
}
