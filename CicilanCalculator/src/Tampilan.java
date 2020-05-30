package CicilanCalculator.src;

public class Tampilan {

    public static void tampilBayaran(double bayaranPerBulan) {
        System.out.println("============================== PEMBAYARAN SETIAP BULAN ==============================");
        Currency.currencyFormat(bayaranPerBulan);

    }

    public static void tampilanSisaBayaran(int durasiCicilan, double sisaBayaran, double bayaranPerBulan) {
        System.out.println("============================== SISA BAYARAN SETIAP BULAN ==============================");
        for (int i = 0; i < durasiCicilan * App.BULAN_DALAM_TAHUN; i++) {
            sisaBayaran -= bayaranPerBulan;
            Currency.currencyFormat(sisaBayaran);
        }
    }

}