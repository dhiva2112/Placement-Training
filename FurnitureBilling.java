import java.util.*;
interface FurnitureCalculator {
    double calculate(double amount);
}
public class FurnitureBilling {
    public static void main(String[] args) {
        List<Double> items = Arrays.asList(25000.0, 15000.0, 45000.0, 8000.0);
        FurnitureCalculator woodGST = amount -> amount * 1.12;
        FurnitureCalculator assembly = amount -> {
            if (amount > 10000) {
                return amount + 500;
            } else {
                return amount + 150; 
            }
        };
        FurnitureCalculator discount = amount -> amount - (amount * 0.10);
        FurnitureCalculator delivery = amount -> amount + (amount * 0.02);
        System.out.println("--- MODERN FURNITURE OUTLET ---");
        items.forEach(price -> {
            double afterDiscount = discount.calculate(price);
            double afterGST = woodGST.calculate(afterDiscount);
            double afterAssembly = assembly.calculate(afterGST);
            double finalBill = delivery.calculate(afterAssembly);
            System.out.println("Base Price        : Rs. " + price);
            System.out.println("After 10% Disc.   : Rs. " + String.format("%.2f", afterDiscount));
            System.out.println("Price (Incl. GST) : Rs. " + String.format("%.2f", afterGST));
            System.out.println("Assembly Fee      : Included");
            System.out.println("FINAL INVOICE     : Rs. " + String.format("%.2f", finalBill));
            System.out.println("-------------------------");
        });
    }
}