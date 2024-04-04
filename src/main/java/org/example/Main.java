import org.example.PaintCalculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double areaCoveredPerGallon= 10; // square meters per gallon
    double pricePerGallon = 35; // in pounds

try
{
// allowing the user to choose their measurements
    System.out.println("Choose your measurements from the following:");
    System.out.println("1. Meters");
    System.out.println("2. Millimeters");
    System.out.println("3. Feet");
    System.out.println("Enter your choice as 1 or 2 or 3: ");
    int choice = getNextInt(scanner);

    System.out.println("Enter wall width: ");
    double wallWidth = getNextDouble(scanner);

    System.out.println("Enter wall height: ");
    double wallHeight = getNextDouble(scanner);

    System.out.println("Enter number of doors: ");
    int numberOfDoors = getNextInt(scanner);

    System.out.println("Enter number of windows: ");
    int numberOfWindows = getNextInt(scanner);

    System.out.println("Enter number of coats: ");
    int numberOfCoats = getNextInt(scanner);


    // Convert the measurements to meters
    if (choice == 2) { // Millimeters to meters
        wallWidth = wallWidth / 1000;
        wallHeight = wallHeight / 1000;
    } else if (choice == 3) { // Feet to meters
        wallWidth = wallWidth * 0.3048;
        wallHeight = wallHeight * 0.3048;
    }



    double areaToBePainted = PaintCalculator.calculateAreaToBePainted(wallWidth, wallHeight, numberOfDoors, numberOfWindows);
    double paintRequired = PaintCalculator.estimatePaintRequired(areaToBePainted , areaCoveredPerGallon, numberOfCoats);
    double totalCost = PaintCalculator.calculateTotalCost(paintRequired, pricePerGallon);

    // printing the paint required and total cost
    System.out.println();
    System.out.println("Paint required and total cost for a single wall");
    for (int i = 0; i < 50; i++) {
        System.out.print("-");
    }
    System.out.println();
    System.out.println("Paint required for " + numberOfCoats + " coats: " + String.format("%.2f", paintRequired) + " Gallons");
    System.out.println("Total cost: £" + String.format("%.2f", totalCost) );

    for (int i = 0; i < 50; i++) {
        System.out.print("-");
    }
    System.out.println();


}
catch (Exception e) {
    System.out.println("An unexpected error occurred: " + e.getMessage());
}
finally {
    scanner.close();
}

}



static double getNextDouble(Scanner scanner) {
    while (true) {
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            scanner.next(); // getting rid of the invalid input
            System.out.print("Invalid input. Please enter a number: ");
        }
    }
}

static int getNextInt(Scanner scanner) {
    while (true) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // getting rid of the invalid input
            System.out.print("Invalid input. Please enter a number: ");
        }
    }
}
