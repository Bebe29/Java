
// import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // System.out.println("Halo dunia");

        // PRIMITIVE DATA TYPES//
        // byte umur = 99;
        // short iniShort = 128;
        // int iniInt = 1_142_342; //ga bs angka koma
        // long iniLong = 1231423342;
        // float iniFloat = 147.32f;
        // dibelakang hrs d ksh "F" untuk nunjukin kl dia bilangan float
        // double iniDouble = 142.32D;
        // dibelakang blh d ksh "D" untuk nunjukin kl dia bilangan double
        // String nama = "Seto"; //String hrs capital
        // char grade = 'B';
        // boolean isVerified = true;

        // REFERENCE DATA TYPES//
        // tipe data arraynya apa. trs d isi panjang arraynya brp
        // String people[] = new String[5];
        // people[0] = "Seto";

        // int people[] = { 3, 6, 8, 7, 2 };
        // people[5] = 1; //ga bs krn dia yg udh lbh dr panjang arraynya
        // // people[4] = 1;
        // for (int i = 0; i < people.length; i++) {
        // people[i] = i * 3;
        // }
        // System.out.println(Arrays.toString(people));

        // int matrix[][] = new int[4][3];
        // matrix[0][1] = 17;
        // matrix[1][0] = 7;
        // System.out.println(Arrays.deepToString(matrix));

        // final float PI = 3.14F; // buat konstanta
        // System.out.println(PI);

        Scanner scanner = new Scanner(System.in); // baca semua inputan dr terminal
        // byte inputAge = scanner.nextByte(); // bakal baca token pertama
        // System.out.println("Age: " + inputAge);
        System.out.print("Input nama anda: ");
        String inputName = scanner.nextLine(); // bakal baca semua token (hello world => itu 2 token)
        System.out.println("Input: " + inputName);

        // int number = 21;
        // System.out.println(number);
    }
}