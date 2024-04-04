package org.example;

public class PaintCalculator {

    // Calculates the area to be painted, without the  doors and windows
    public static double calculateAreaToBePainted(double wallWidth, double wallHeight, int numberOfDoors, int numberOfWindows) {
        final double DOOR_AREA = 2.0;
        final double WINDOW_AREA = 1.5;

        double totalWallArea = wallWidth * wallHeight;
        double totalAreaNotPainted = (numberOfDoors * DOOR_AREA) + (numberOfWindows * WINDOW_AREA);

        return totalWallArea - totalAreaNotPainted;
    }

    // Estimates the amount of paint needed for the given area
    public static double estimatePaintRequired(double areaToBePainted, double areaCoveredPerGallon, int numberOfCoats) {
        double basicRequirement =  areaToBePainted / areaCoveredPerGallon;
        return basicRequirement * numberOfCoats;
    }

    // Calculates the total cost based on the amount of paint needed and the price per gallon
    public static double calculateTotalCost(double paintRequired, double pricePerGallon) {
        return paintRequired * pricePerGallon;
    }

}



