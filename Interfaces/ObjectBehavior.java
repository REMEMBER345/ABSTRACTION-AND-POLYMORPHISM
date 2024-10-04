package Interfaces;

public interface ObjectBehavior {
    void performAction(); //this will initiate a certain action of the object
    void haltAction(); //this method will stop the object's action
    String getAttribute(); // this method should return a key attribute of the object
    String getType();//this method should return the type of the object

    int getDetails();
}
