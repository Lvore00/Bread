package Bread;


public class Bread {
    //Data

    private double flour;
    private double water;
    private double salt;
    private double yeast;
    private double starter;

    public Bread(){
        setFlour(3.0);
        setWater(2.0);
        setSalt(1.0);
        setYeast(1.0);
        setStarter(0.5);
    }


    //Constructors
 public Bread (double flour, double water, double salt, double yeast, double starter){
     super(flour,water,salt,yeast,starter);
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
   public void bake(){
     boolean bake = false;
     if(bake)
         System.out.println("The bead is not done baking yet!");
     else
         System.out.println("The bread is baked and ready!");
   }

   @Override
   public String getRecipe(){
     return "1. Mix together the flour, salt and yeast, then add warm water and mix. The “dough” " +
             "will be very wet and sloppy, not kneadable at all – " +
             "this is what you want!" + "\n" +
             "2. Let rise" + "\n"
             + "3. Pull dough out and knead until tough to fold" + "\n" +
             "3. Put into a hot pan and bake for 40 minutes until stiff";
   }

   @Override
   public String getIngredients(){
     return super.Ingredients();
   }


    //String toString

    @Override
    public String toString() {
        return "Bread: " +
                flour + " cup(s) of flour"+ "\n" +
                water + " cup(s) of water" + "\n" +
                salt + " tsp(s) of salt" + "\n" +
                yeast + " tsp(s) of yeast" + "\n" +
                starter + " cup(s) of starter" ;
    }
}
