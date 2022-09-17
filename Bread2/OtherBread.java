package Bread2;

public class OtherBread extends Bread{

    int yeast;

    public OtherBread(){
        super(10,10);         //Do this to Ciabatta and other bread types Saturday
        yeast = 1;

    }
    public OtherBread(int suger, int salt, int yeast) {
        super(suger, salt);
        this.yeast = yeast;
    }


    public int getYeast() {
        return yeast;
    }

    public void setSuger(int sugar){
       sugar = sugar;
    }


    public void setSalt(int salt){
        salt = salt;
    }
    public void setYeast(int yeast) {
        this.yeast = yeast;
    }


@Override
public String getRecipe(){
        return "Recipe about making Other Bread";
}

    @Override
    public String getIngrediants() {
        return  super.getIngrediants()  + "\nSugar: " +  getSuger() + "\nSalt: " + getSalt() + "\nYeast: " + getYeast();
    }

    @Override
    public String toString(){
        return getIngrediants() + "\n" + getRecipe();
    }




}
