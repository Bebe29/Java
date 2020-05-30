package CicilanCalculator.src;

public class Hitungan {

    public static double hitungBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga) {
        return (hargaAwal + (hargaAwal * (bunga / App.PERCENT))) / (durasiCicilan * App.BULAN_DALAM_TAHUN);
    }

    public static double hitungSisaBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga,
            double bayaranPerBulan) {
        return hargaAwal + (hargaAwal * (bunga / App.PERCENT));
    }

}