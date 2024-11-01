import java.util.Scanner;

public class IT24102937Lab3Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
                System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();
        
        
        double totalAmount = pricePerKg * quantity;
        
       
        double discount = totalAmount * 0.10; // 10% discount
        double amountAfterDiscount = totalAmount - discount;
        
                System.out.printf("Total amount before discount: %.2f\n", totalAmount);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("The total amount to be paid after discount is: %.2f\n", amountAfterDiscount);
        
               scanner.close();
    }
}
