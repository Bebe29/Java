package CicilanCalculator.src;

public class Console {

    public static double readInputNUmber(String message) {
        System.out.print(message);
        return App.scanner.nextDouble();
    }

}