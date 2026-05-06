import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNilai = 0;
        char ulang;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();
            totalNilai += nilai;

            System.out.print("Tambah nilai lain? (y/t): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Total seluruh nilai: " + totalNilai);
    }
}
