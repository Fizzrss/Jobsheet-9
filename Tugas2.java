import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();
        System.out.println("============================");

        String arrMenu[] = new String[jmlPesanan];
        int arrHarga[] = new int[jmlPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("Pesanan ke- " + (i+1));
            System.out.print("Nama makanan/minuman: ");
            arrMenu[i] = sc.nextLine();
            
            System.out.print("Harga: ");
            arrHarga[i] = sc.nextInt();
            sc.nextLine();
            totalBiaya += arrHarga[i];
        }
        System.out.println();
        System.out.println("============================");
        System.out.println("====== Rician Pesanan ======");
        System.out.println("============================");
        System.out.println("Jumlah pesanan = " + jmlPesanan);
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1)+ ". " + arrMenu[i] + " = " + arrHarga[i]);
        }
        System.out.println("----------------------------");
        System.out.println("Total harga: " + totalBiaya);
        System.out.println("============================");
    }
}
