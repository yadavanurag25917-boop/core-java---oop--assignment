// Method overloading
public class ProductBilling {

    public double calculateBill(double price1) {
        double total = price1;
        System.out.println("Bill for 1 product:" + total);
        return total;
    }
     public double calculateBill(double price1, double price2) {
        double total = price1 + price2;
        System.out.println("Bill for 2 products:" + total);
        return total;
     } 
     
     public double calculateBill(double price1, double price2, double price3) {
        double total = price1 + price2 + price3;
        System.out.println("Bill for 3 products:" + total);
        return total;
     }
}