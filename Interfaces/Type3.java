package Interfaces;

public class Type3 implements  ObjectBehavior{
    public String carModel= "Ferrari";
    public String objectType ="Type3";
    //method to get details
    public int getDetails() {
        System.out.println("Class Type 3 attribute:");
        return 300;
    }
    public boolean isRevolving = true;

    @Override
    public void performAction() {
        isRevolving = true;
        System.out.println("The car engine is revolving at:9000 ");
    }

    @Override
    public void haltAction() {
        isRevolving = false;
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
