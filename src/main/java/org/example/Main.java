import org.example.PaintCalculator;
import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


//    double coveragePerGallon = 10; // square meters per liter
//    double pricePerGallon = 25; // currency units per liter


    System.out.println("Choose your unit of measurement:");
    System.out.println("1. Meters");
    System.out.println("2. Millimeters");
    System.out.println("3. Feet");
    System.out.print("Enter your choice (1/2/3): ");
    int choice = scanner.nextInt();


    System.out.println("Enter wall width: ");
    double wallWidth = scanner.nextDouble();

    System.out.println("Enter wall height: ");
    double wallHeight = scanner.nextDouble();

    System.out.println("Enter number of doors: ");
    int numberOfDoors = scanner.nextInt();

    System.out.println("Enter number of windows: ");
    int numberOfWindows = scanner.nextInt();

    System.out.println("Enter paint coverage per Gallon (square meters): ");
    double coveragePerGallon = scanner.nextDouble();

    System.out.println("Enter number of coats: ");
    int numberOfCoats = scanner.nextInt();

    System.out.println("Enter price per Gallon (currency units): ");
    double pricePerGallon = scanner.nextDouble();


    // Convert the measurements to meters
    if (choice == 2) { // Millimeters to meters
        wallWidth = wallWidth / 1000;
        wallHeight = wallHeight / 1000;
    } else if (choice == 3) { // Feet to meters
        wallWidth = wallWidth * 0.3048;
        wallHeight = wallHeight * 0.3048;
    }

    double paintableArea = PaintCalculator.calculatePaintableArea(wallWidth, wallHeight, numberOfDoors, numberOfWindows);
    double paintRequired = PaintCalculator.estimatePaintRequired(paintableArea, coveragePerGallon, numberOfCoats);
    double totalCost = PaintCalculator.calculateTotalCost(paintRequired, pricePerGallon);

    System.out.println("Paintable area: " + paintableArea + " square meters");
    System.out.println("Paint required: " + String.format("%.2f", paintRequired) + " Gallons");
    System.out.println("Total cost: " + String.format("%.2f", totalCost) + " currency units");

    scanner.close();
}