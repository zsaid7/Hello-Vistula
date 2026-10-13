
public class Main {
    public static void main(String[] args) {

        // Input data
        double productCost = 9.99;
        double vatRate = 0.05;

        // VAT for one unit
        double vatPerUnit = productCost * vatRate;

        System.out.println("VAT for one unit: " + vatPerUnit);

        // Simulate 10,000 transactions
        int numberOfUnits = 10_000;

        double totalNetSales = 0.0;
        double totalVat = 0.0;
        double totalGrossValue = 0.0;

        // Precalculate values for each unit
        double grossPerUnit = productCost + vatPerUnit;

        // Process every transaction
        for (int i = 0; i < numberOfUnits; i++) {
            totalNetSales += productCost;
            totalVat += vatPerUnit;
            totalGrossValue += grossPerUnit;
        }

        // Print raw values
        System.out.println("Total net sales: " + totalNetSales);
        System.out.println("Total VAT amount: " + totalVat);
        System.out.println("Total gross value: " + totalGrossValue);
    }
}
