package CicilanCalculator.src;

import java.text.NumberFormat;

public class Currency {

    public static void currencyFormat(double value) {
        System.out.println(NumberFormat.getCurrencyInstance(App.locale).format(value));
    }

}