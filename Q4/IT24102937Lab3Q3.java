import java.util.Scanner;

public class IT24102937Lab3Q3 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to input the rupee amount
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        
        // Denominations available in notes and coins
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        // Loop through each denomination and calculate the number of notes/coins
        for (int denomination : denominations) {
            int count = amount / denomination;  // Calculate the number of notes/coins for current denomination
            amount = amount % denomination;    // Update the remaining amount
            
            // Print the result for current denomination
            System.out.println(denomination + " Notes – " + count);
        }
        
        // Close the scanner
        scanner.close();
    }
}
