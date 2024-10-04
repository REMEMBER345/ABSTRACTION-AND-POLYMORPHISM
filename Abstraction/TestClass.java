package Abstraction;

public class TestClass{
    public static void main(String[]args){
        ChinaTown stock = new Stock("Kansanga Ggaba Road","HongKong","Remember Joselyne","Namara Grace",4000000);
       ChinaTown sales = new Sales(5500000,"Ampaire Eric");
       ChinaTown employee = new Employee("Samsung Fridge","Murungi Reagan");
       System.out.println(stock.displayStoreDetails());
       System.out.println(sales.displayStoreDetails());
       System.out.println(employee.displayStoreDetails());
    }
}
