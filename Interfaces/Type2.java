package Interfaces;

public class Type2 implements  ObjectBehavior{
    public String carModel= "BMW";
    public String objectType ="Type2";
    //method to get details
    public int getDetails() {
        System.out.println("Class Type 1 attribute:");
        return 200;
    }
    public boolean isRevolving =false;

    @Override
    public void performAction() {
        isRevolving = false;
        System.out.println("The car engine is revolving at:4000 ");
    }

    @Override
    public void haltAction() {
        isRevolving = true;
        System.out.println("The car engine is at halt. ");
    }

    @Override
    public String getAttribute() {
        return carModel;
    }

    @Override
    public String getType() {
        return objectType;
    }
}
