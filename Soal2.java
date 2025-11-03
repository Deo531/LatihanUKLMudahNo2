import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        System.out.println("Program menentukan Bilangan Ganjil atau Genap");
        System.out.println("==================");
        System.out.print("Masukkan bilangan : ");
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }
}
