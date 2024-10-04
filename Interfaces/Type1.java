package Interfaces;

public class Type1 implements  ObjectBehavior{
public String carModel= "SUV";
public String objectType ="Type1";
    //method to get details
    public int getDetails() {
        return 100;
    }
    public boolean isRevolving = true;

    @Override
    public void performAction() {
       isRevolving = true;
        System.out.println("The car engine is revolving at:6000 ");
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
