import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNilai = 0;
        int jumlahData = 0;
        char ulang;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();
            totalNilai += nilai;
            jumlahData++;

            System.out.print("Input nilai lain? (y/t): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        if (jumlahData > 0) {
            double rataRata = (double) totalNilai / jumlahData;
            System.out.println("Rata-rata nilai: " + rataRata);
        }
    }
}
