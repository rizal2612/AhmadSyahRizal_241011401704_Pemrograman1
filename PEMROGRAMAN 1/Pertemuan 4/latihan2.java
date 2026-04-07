import java.util.Scanner;
public class latihan2{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        System.out.println("Nilai Mahassiswa");
        System.out.println("=======================================");
        System.out.print("Masukin nilai presensi : ");
        float presensi = input.nextFloat();
        System.out.print("Masukin nilai tugas : ");
        float tugas = input.nextFloat();

        System.out.print("Masukin nilai UTS : ");
        float uts = input.nextFloat();

        System.out.print("Masukin nilai UAS : ");
        float uas = input.nextFloat();

        float totalPresensi = presensi / 21 * 10;
        float totalTugas = tugas * 21 / 100;
        float totalUTS = uts * 30 / 100;
        float totalUAS = uas * 40 / 100;

        double total = totalPresensi + totalTugas + totalUTS + totalUAS;
        System.out.println("=========================================");
        System.out.printf("total : %.2f ", total);
    }
}