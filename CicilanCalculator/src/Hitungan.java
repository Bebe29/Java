package CicilanCalculator.src;

public class Hitungan {
    private int hargaAwal, durasiCicilan;
    private double bunga;
    private static final int PERCENT = 100;

    public Hitungan(int hargaAwal, int durasiCicilan, double bunga) {
        this.hargaAwal = hargaAwal;
        this.durasiCicilan = durasiCicilan;
        this.bunga = bunga;
    }

    public double hitungBayaranPerBulan() {
        return (hargaAwal + (hargaAwal * (bunga / PERCENT))) / (durasiCicilan * App.BULAN_DALAM_TAHUN);
    }

    public double hitungSisaBayaranPerBulan(int bulanSudahDibayar) {
        double totalBayaran = hargaAwal + (hargaAwal * (bunga / PERCENT));
        double sudahDibayar = hitungBayaranPerBulan() * bulanSudahDibayar;

        return totalBayaran - sudahDibayar;
    }

    public int durasiCicilan() {
        return durasiCicilan;
    }
}