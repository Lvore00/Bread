package Bread;

public class Sourdough extends Bread{
    //Data

    private String breadName;
    private String state;

    public Sourdough(){
        super(5.0,3.0,1.0,2.0,2.0);
        setBreadName("Sourdough");
        setState("Not done!");

    }


    // Constructor

    public Sourdough(double flour, double water, double salt,
                     double yeast, double starter, String breadName,
                     String state) {
        super(flour, water, salt, yeast, starter);
        this.breadName = breadName;
        this.state = state;
    }

    // Getters and Setters

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

    public void howtoSourdough(){
        System.out.println("Before baking: Make sure to leave newly mixed dough" +
                " in a bowl and covered for 30 minutes to 1 hour to rest before kneading out");
    }
    public String getIngredients(){
        return super.Ingredients() +
                "\nBread Name: " + getBreadName() +
                "\nBread State: " + getState();
    }

    public String getRecipe() {
        return "1. After letting dough rest, roll it on a floured surface" + "\n" +
                "2. Put into bread pan that is oiled" + "\n"
                + "3. Bake bread for 3 hours on 340 degrees F until risen";
    }

    //String toString
    @Override
    public String toString() {
        return getIngredients() + "\n" + getRecipe() +
                "\n" + getState();
    }

}
