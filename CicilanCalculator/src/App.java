package CicilanCalculator.src;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    static Locale locale = new Locale("id", "ID");
    static final int BULAN_DALAM_TAHUN = 12;
    static final int PERCENT = 100;

    public static void main(String[] args) throws Exception {
        int hargaAwal, durasiCicilan;
        double bunga;

        while (true) {
            hargaAwal = (int) Console.readInputNUmber("Harga Awal: ");
            if (hargaAwal >= 1_000_000 && hargaAwal <= 100_000_000) {
                break;
            }
            System.out.println("Harga minimal 1.000.000 dan maksimal 100.000.000");
        }

        while (true) {
            durasiCicilan = (int) Console.readInputNUmber("Durasi Cicilan: ");
            if (durasiCicilan >= 1) {
                break;
            }
            System.out.println("Durasi cicilan minimal 1 tahun");
        }

        while (true) {
            bunga = Console.readInputNUmber("Bunga: ");
            if (bunga >= 0) {
                break;
            }
            System.out.println("Bunga minimal 0");
        }

        double bayaranPerBulan = Hitungan.hitungBayaranPerBulan(hargaAwal, durasiCicilan, bunga);
        Tampilan.tampilBayaran(bayaranPerBulan);

        double sisaBayaran = Hitungan.hitungSisaBayaranPerBulan(hargaAwal, durasiCicilan, bunga, bayaranPerBulan);
        Tampilan.tampilanSisaBayaran(durasiCicilan, sisaBayaran, bayaranPerBulan);

    }
}
