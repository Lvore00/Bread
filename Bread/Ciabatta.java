package Bread;

public class Ciabatta extends Bread{
    //Data

//    private double flour;
//    private double water;
//    private double salt;
//    private double yeast;
//    private double starter;
    private double sugar;
    private double bakingP;
    private String breadName;
    private String state;
    private String recipe;

    // Constructor

    public Ciabatta(double flour, double water, double salt, double yeast,
                    double starter, double sugar, double bakingP,
                    String breadName, String state, String recipe) {
      super(flour, water, salt, yeast, starter);
        this.sugar = sugar;
        this.bakingP = bakingP;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }

    //Getters and Setters

//    public void setFlour(double amount){
//        super.setFlour(amount);
//    }
//

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
                super.getFlour()+ " cup(s) of flour" + "\n" +
                super.getWater() + " cup(s) of water" + "\n" +
                super.getSalt() + " tsp(s) of salt" + "\n" +
                super.getYeast() + " tsp(s) of yeast" + "\n" +
                sugar + " cup(s) of sugar" + "\n" +
                bakingP + " tsp(s) of baking powder" + "\n" +
                super.getStarter() + " cup(s) of ripe ciabatta starter" + "\n" +
                "Bread Name: " + breadName + "\n" +
                "Bread State: " + state + "\n" +
                "Recipe: " + recipe;
    }
}
