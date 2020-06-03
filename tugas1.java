import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        String inputNama, inputAlamat;
        byte inputUmur;
        short inputTahunLahir;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input nama anda: ");
        inputNama = scanner.nextLine();
        System.out.print("Input umur anda: ");
        inputUmur = Byte.parseByte(scanner.nextLine());
        System.out.print("Input tahun lahir anda: ");
        inputTahunLahir = Short.parseShort(scanner.nextLine());
        System.out.print("Input alamat tinggal anda: ");
        inputAlamat = scanner.nextLine();

        // System.out.println("Nama anda adalah " + inputNama + ", berumur " + inputUmur
        // + " tahun, lahir tahun "
        // + inputTahunLahir + ", tinggal di " + inputAlamat);

        String template = "Nama anda adalah %s, berumur %s tahun, tinggal di %s, lahir tahun %s";

        String result = String.format(template, inputNama, inputUmur, inputAlamat, inputTahunLahir);

        System.out.println(result);
    }
}