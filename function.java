import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class function {
    public static void main(String[] args) {
        // int length, min, max;

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Angka minimum: ");
        // min = scanner.nextInt();
        // System.out.print("Angka maximum: ");
        // max = scanner.nextInt();

        // length = max - min + 1;
        // int Arr[] = new int[max - min + 1];
        // for (int i = 0; i < max - min + 1; i++) {
        // Arr[i] = i + min;
        // }
        // System.out.println(Arrays.toString(Arr));

        // generateArrayFromRange(min, max);
        System.out.println(includesArray(-1));

    }

    public static ArrayList<Integer> generateArrayFromRange(int min, int max) {

        if (min < max) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int i = min; i <= max; i++) {
                numbers.add(i);
            }
            // System.out.println(numbers);
            return numbers;
        }
        return new ArrayList<Integer>();
    }

    public static boolean includesArray(int item) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // for (int i = 0; i < numbers.length; i++) {
        // if (numbers[i] == item)
        // return true;
        // }
        // return false;
        for (int i : numbers) {
            if (i == item)
                return true;
        }
        return false;
    }
}