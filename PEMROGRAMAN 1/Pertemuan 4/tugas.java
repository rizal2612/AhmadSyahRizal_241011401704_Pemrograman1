import java.util.Scanner;
public class tugas {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Makan: ");
        int makan = input.nextInt();

        System.out.print("Transport: ");
        int transport = input.nextInt();

        System.out.print("Belanja: ");
        int belanja = input.nextInt();

        int pengeluaran = makan + transport + belanja;
        
        double total_makan = ((double)makan / pengeluaran) * 100;
        double total_transport = ((double)transport / pengeluaran) * 100;
        double total_belanja = ((double)belanja / pengeluaran) * 100;

        System.out.printf("Total : %d\n", pengeluaran);
        
        System.out.printf("Pengeluaran makan: %.2f%%\n", total_makan);
        System.out.printf("Pengeluaran transport: %.2f%%\n", total_transport);
        System.out.printf("Pengeluaran belanja: %.2f%%\n", total_belanja);
    }
}