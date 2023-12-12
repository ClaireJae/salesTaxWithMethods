package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /*Setup any variables you need and call your methods
       * here in the main method */

        double purchasePrice = inputPurchasePrice();
        double countyTaxRate = .02;
        double stateTaxRate = .04;

        double stateTax = calculateTax(purchasePrice, stateTaxRate);
        double countyTax = calculateTax(purchasePrice, countyTaxRate);
        double totalTax = calculateTotal(stateTax, countyTax);
        double saleTotal = calculateTotal(purchasePrice, totalTax);

        displayTotals(purchasePrice, stateTax, countyTax, totalTax, saleTotal);
    }

    /* Write a method called inputPurchasePrice that
    *  takes the user input for price, converts to
    *  a double, and returns the price
    * */
    public static double inputPurchasePrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter purchase price: ");
        return scanner.nextDouble();
    }

    /* Write a method called calculateTax that
     * accepts price and tax rate as parameters and
     * calculates and returns the tax
     * */
    public static double calculateTax(double price, double taxRate) {
        return price + taxRate;
    }

    /* Write a method called calculateTotal that
     * accepts two double values nd calculates and
     * returns the total
     * */
    public static double calculateTotal(double price1, double price2) {
        return price1 + price2;
    }

    /* Write a method called displayTotals that takes
    *  purchasePrice, stateTax, countyTax, totalTax and totalPrice
    *  as parameters. Output using decimal formatter amd printf */
    public static void displayTotals(double purchasePrice, double stateTax, double countyTax, double totalTax, double saleTotal) {
        System.out.printf("Purchase price: $%.2f%n", purchasePrice);
        System.out.printf("State tax: $%.2f%n", stateTax);
        System.out.printf("County tax: $%.2f%n", countyTax);
        System.out.printf("Total of tax: $%.2f%n", totalTax);
        System.out.printf("Sale total: $%.2f%n", saleTotal);
    }

}