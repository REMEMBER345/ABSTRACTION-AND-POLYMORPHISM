package Abstraction;
//this is to show abstraction.
//abstraction simply refers to hiding the complexity of implementation details and only expose the necessary features.
// think of a phone, we don't know what happens in the system behind the scenes, but we know certain functions of the phone parts
//for example we know how to operate its power button and know its functionality but don't really know what happens in the system
// once the button is pressed, but we see that the phone either turns on or off.

public abstract class ChinaTown { //abstract class
    public String itemPurchased;
    public String branchName;
    public double Price;
    public final double percentageDiscount = 0.05;
    public String cashierName;
    public String storeAddress;
    public String branchManager;
    public String inCharge;
    public double volumeOfStock;
    public String Supplier;
    public double discount;

    //constructor to initialize the variables
    public ChinaTown(String itemPurchased,String cashierName) {
        this.itemPurchased = itemPurchased;
        this.cashierName = cashierName;
    }
    public ChinaTown(double Price,String Supplier){
        this.Price= Price;
        this.Supplier = Supplier;
    }
    public ChinaTown (String storeAddress, String branchName, String branchManager, String inCharge,double volumeOfStock)
    {
        this.storeAddress= storeAddress;
        this.branchName = branchName;
        this.branchManager = branchManager;
        this.inCharge = inCharge;
        this.volumeOfStock = volumeOfStock;
    }

    // abstract method to display store details
    public abstract String displayStoreDetails();
    // concrete method to calculate the discount
    public double calculateDiscount(double Price, double percentageDiscount){
        int discount = (int) ((Price*percentageDiscount)/100);
        double FinalPrice;
        FinalPrice = Price - discount;
        return FinalPrice;
    }
    }
