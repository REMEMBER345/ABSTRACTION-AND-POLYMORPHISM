package Abstraction;

public class Stock extends ChinaTown{
    Stock(String storeAddress, String branchName, String branchManager, String inCharge, double volumeOfStock)
    {
        super(
        storeAddress,branchName,branchManager,inCharge,volumeOfStock);
    }
    @Override
    public String displayStoreDetails() {
        return "Store Address: " + storeAddress +"/nBranch Name: " + branchName + "/nBranch Manager: " + branchManager;
    }
}