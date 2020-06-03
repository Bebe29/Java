package CicilanCalculator.src;

public class App {
    static final int BULAN_DALAM_TAHUN = 12;

    public static void main(String[] args) throws Exception {
        int hargaAwal, durasiCicilan;
        double bunga;

        hargaAwal = (int) Console.readInputNUmber("Harga Awal: ", 1_000_000, 100_000_000);
        durasiCicilan = (int) Console.readInputNUmber("Durasi Cicilan: ", 1);
        bunga = Console.readInputNUmber("Bunga: ", 0);

        Hitungan calculator = new Hitungan(hargaAwal, durasiCicilan, bunga);
        Tampilan report = new Tampilan(calculator);

        report.tampilBayaran();
        report.tampilanSisaBayaran();
    }
}
