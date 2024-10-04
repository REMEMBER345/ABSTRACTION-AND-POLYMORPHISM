package Abstraction;
public class Sales extends ChinaTown{

    Sales(double Price, String Supplier){
        super(Price, Supplier);
    }

    @Override
    public String displayStoreDetails() {
        double FinalPrice = calculateDiscount(Price,percentageDiscount);
        return"Final Price after discount: shs " + FinalPrice + "/n"+ "Supplier: " + Supplier;
    }
}