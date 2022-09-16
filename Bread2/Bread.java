package Bread2;

public class Bread {
    private int suger;
    private int salt;

    public Bread(){
        setSuger(10);
        setSalt(10);
    }
    public Bread(int suger, int salt) {
        this.suger = suger;
        this.salt = salt;
    }

    public int getSuger() {
        return suger;
    }

    public void setSuger(int suger) {
        this.suger = suger;
    }

    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }
    public boolean bake(boolean status){

        if(status){
            return true;
        }
        else return false;
    }

    public String getIngrediants() {
        return "Bread[" +
                "suger:" + suger +
                ", salt:" + salt +
                ']';
    }


    public String getRecipe(){
        return "";
    }


}
