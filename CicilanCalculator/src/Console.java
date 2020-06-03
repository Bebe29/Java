package CicilanCalculator.src;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double readInputNUmber(String message, double minValue, double maxValue) {
        while (true) {
            System.out.print(message);
            double input = scanner.nextDouble();

            if (input >= minValue && input <= maxValue) {
                return input;
            }

            System.out.println("Input minimal " + minValue + " dan maksimal " + maxValue);
        }
    }

    public static double readInputNUmber(String message, double minValue) {
        while (true) {
            System.out.print(message);
            double input = scanner.nextDouble();

            if (input >= minValue) {
                return input;
            }

            System.out.println("Input minimal " + minValue);
        }
    }
}