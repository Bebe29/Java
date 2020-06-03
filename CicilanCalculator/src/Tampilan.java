package CicilanCalculator.src;

public class Tampilan {
    private Hitungan calculator;

    public Tampilan(Hitungan calculator) {
        this.calculator = calculator;
    }

    public void tampilBayaran() {
        System.out.println("============================== PEMBAYARAN SETIAP BULAN ==============================");
        Currency.currencyFormat(calculator.hitungBayaranPerBulan());
    }

    public void tampilanSisaBayaran() {
        System.out.println("============================== SISA BAYARAN SETIAP BULAN ==============================");
        for (int bulan = 1; bulan <= calculator.durasiCicilan() * App.BULAN_DALAM_TAHUN; bulan++) {
            Currency.currencyFormat(calculator.hitungSisaBayaranPerBulan(bulan));
        }
    }

}