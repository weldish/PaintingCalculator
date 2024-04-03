package org.example;

public class PaintCalculator {

    // Calculates the paintable area, subtracting doors and windows
    public static double calculatePaintableArea(double wallWidth, double wallHeight, int numberOfDoors, int numberOfWindows) {
        final double DOOR_AREA = 2.0; // Average door area in square meters
        final double WINDOW_AREA = 1.5; // Average window area in square meters

        double totalWallArea = wallWidth * wallHeight;
        double totalNonPaintableArea = (numberOfDoors * DOOR_AREA) + (numberOfWindows * WINDOW_AREA);

        return totalWallArea - totalNonPaintableArea;
    }

    // Estimates the amount of paint needed for the given area
    public static double estimatePaintRequired(double paintableArea, double coveragePerGallon, int numberOfCoats) {
        double basicRequirement =  paintableArea / coveragePerGallon;
        return basicRequirement * numberOfCoats;
    }

    // Calculates the total cost based on the amount of paint needed and the price per liter
    public static double calculateTotalCost(double paintRequired, double pricePerGallon) {
        return paintRequired * pricePerGallon;
    }

}



