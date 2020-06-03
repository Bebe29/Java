package CicilanCalculator.src;

import java.util.Locale;
import java.text.NumberFormat;

public class Currency {
    private static Locale locale = new Locale("id", "ID");

    public static void currencyFormat(double value) {
        System.out.println(NumberFormat.getCurrencyInstance(locale).format(value));
    }

}