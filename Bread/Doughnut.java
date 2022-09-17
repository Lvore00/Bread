package Bread;

public class Doughnut extends Bread{
    //Data

    private double sugar;
    private double bakingP;
    private String breadName;
    private String state;


    public Doughnut(){
            super(6.0,4.5,2.0,1.0,1.2);
            setBakingP(2.25);
            setBreadName("Doughnut");
            setState("Not done!");
            setSugar(5.5);

        }
    }

    // Constructor

    public Doughnut(double flour, double water, double salt,
                    double yeast, double starter, double sugar, double bakingP,
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


    //Instance Method
    public void howtoDoughnut(){
        System.out.println("Let the doughnut dough rise for about 90 minutes " +
                "rolling out and baking!");
    }

    @Override
    public String getIngredients(){
        return super.Ingredients() + "\nSugar: " + getSugar() +
                "\nBaking Powder: " + getBakingP() +
                "\nBread Name: " + getBreadName() +
                "\nBread State: " + getState();
    }

 public String getRecipe(){
        return " 1. Mix listed ingredients" + "\n" +
                "2. Roll out the rested dough" + "\n" +
                "3. Flour rolling pin and rolling surface and roll out the dough" +
                "\n" + "4. Cut out the dough" + "\n" +
                "5. Fry the dough in oil 1-2 minutes each side";
 }

    //String toString
    @Override
    public String toString() {
        return getIngredients() + "\n" + getRecipe() +
                "\n" + getState();
    }

}
