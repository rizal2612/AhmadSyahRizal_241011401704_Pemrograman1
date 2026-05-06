import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int pilih, pilih_reg = 0;
        String jurusan = "", nama ="", reg = "";
        
        pilih = input.nextInt();
        input.nextLine();

        System.out.println("=== MENU ===");
        System.out.println("1. Masuk");
        System.out.println("2. Keluar");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        input.nextLine();

        if(pilih == 1){
            System.out.println("Masukkan Nama Anda");
            nama = input.nextLine();
            jurusan = "Teknik Informatika";

            System.out.println("Reguler");
            System.out.println("1 - Reg A");
            System.out.println("2 - Reg B");
            System.out.println("3 - Reg CK");
            System.out.println("4 - Reg CS");

            System.out.println("Masukkan Reguler : ");
            pilih_reg = input.nextInt();

            switch (pilih_reg) {
                case 1:
                    System.out.println("Reg A");
                    reg = "Reg A";
                    break;
                case 2:
                    System.out.println("Reg B");
                    reg = "Reg B";
                    break;
                case 3:
                    System.out.println("Reg CK");
                    reg = "Reg CK";
                    break;
                case 4:
                    System.out.println("Reg CS");
                    reg = "Reg CS";
                    break;
                default:
                    System.out.println("Reg A");
                    reg = "Reg A";
            }

        }else{
            System.out.println("Keluar");
        }

        System.out.println("Halo " + nama + " " + jurusan + " " + reg);
        System.out.println("Selesai");

        input.close();
    }
}