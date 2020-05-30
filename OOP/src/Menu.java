package OOP.src;

public class Menu {

    public static void tambahBuah() {
        while (true) {
            String inputNama = Console.readStringInput("Input nama buah: ");
            int inputHarga = (int) Console.readNumberInput("Input harga buah: ");
            int inputStock = (int) Console.readNumberInput("Input stock buah: ");
            // System.out.print("Input stock buah: ");
            // int inputStock = scanner.nextInt();

            Buah buah = new Buah(inputNama, inputHarga, inputStock);

            App.listBuah.add(buah);

            System.out.print("Input lagi? (y/n) ");
            String option = App.scanner.next();
            if (option.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void tampilListBuah() {
        System.out.println("================= LIST BUAH =================");
        for (int i = 0; i < App.listBuah.size(); i++) {
            System.out.println((i + 1) + ". " + App.listBuah.get(i).getNama() + " || " + App.listBuah.get(i).getHarga()
                    + " || " + App.listBuah.get(i).getStock());
        }
    }

}