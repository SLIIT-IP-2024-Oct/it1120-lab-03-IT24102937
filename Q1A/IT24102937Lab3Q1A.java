import java.util.Scanner;

public class IT24102937Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
               System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();
        
        
        double totalAmount = pricePerKg * quantity;
        
        
        System.out.printf("The total amount to be paid is: %.2f\n", totalAmount);
        
        
        scanner.close();
    }
}
