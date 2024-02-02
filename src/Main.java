public class Main {
    public static void main(String[] args) {

        double springCost = 100.10;
        double summerCost = 60.30;
        double fallCost = 342.0;
        double winterCost = 234.23;
        double totalCost = 0;

        System.out.println("Your spring maintenance cost is: " + springCost);
        System.out.println("Your summer maintenance cost is: " + summerCost);
        System.out.println("Your fall maintenance cost is: " + fallCost);
        System.out.println("Your winter maintenance cost is: " + winterCost);

        totalCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Your total cost is: " +totalCost);

    }
}