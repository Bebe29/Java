package OOP.src;

public class Console {

    public static String readStringInput(String message) {
        System.out.print(message);
        return App.scanner.next();
    }

    public static double readNumberInput(String message) {
        System.out.print(message);
        return App.scanner.nextDouble();
    }

}