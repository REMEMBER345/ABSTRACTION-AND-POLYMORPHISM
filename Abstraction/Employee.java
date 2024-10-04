package Abstraction;

public class Employee extends ChinaTown{
public Employee(String itemPurchased,String cashierName){
    super(itemPurchased,cashierName);
}



    @Override
    public String displayStoreDetails() {
        return "Item Purchased: " + itemPurchased + "/n" + "Employee: " + cashierName;
    }
}