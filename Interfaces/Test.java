package Interfaces;

public class Test {
    public static void main(String[]args){
        //array of objet behavior instances
        ObjectBehavior[] test = new ObjectBehavior[3];
        test[0] = new Type1();
        test[1] = new Type2();
        test[2] = new Type3();

        //for Type1
        test[0].performAction();
        System.out.println("Class Type 1 attribute details: " + test[0].getDetails());
        System.out.println("Car model: " + test[0].getAttribute());
        System.out.println("Object Type: " + test[0].getType());

        //for Type2
        test[1].performAction();
        System.out.println("Class Type 1 attribute details: " + test[1].getDetails());
        System.out.println("Car model: " + test[1].getAttribute());
        System.out.println("Object Type: " + test[1].getType());

        //for Type1
        test[2].performAction();
        System.out.println("Class Type 1 attribute details: " + test[2].getDetails());
        System.out.println("Car model: " + test[2].getAttribute());
        System.out.println("Object Type: " + test[2].getType());
    }
}
