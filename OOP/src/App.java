package OOP.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        // listBuah.forEach(item -> {
        // System.out.println("1. " + item.getNama() + " || " + item.getHarga() + " || "
        // + item.getStock());
        // });
        menuUtama();
        // tambahBuah();
        // tampilListBuah();
    }

    public static void menuUtama() {
        while (true) {
            System.out.println("================= MENU =================");
            System.out.println("1. Tambah buah");
            System.out.println("2. List buah");
            System.out.println("3. Exit");
            System.out.print("Pilihan menu yang dipilih: ");
            String menuOption = scanner.next();

            if (menuOption.equals("1")) {
                Menu.tambahBuah();
            } else if (menuOption.equals("2")) {
                Menu.tampilListBuah();
            } else {
                break;
            }
        }
    }
}
