import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("=============================================================");
        System.out.print("Masukkan nama menu yang kamu cari: ");
        String cari = sc.nextLine();
        System.out.println("-------------------------------------------------------------");
        String hasil;
        boolean ada = false;

        for (int i = 0; i < menu.length; i++) {
            if (cari.equalsIgnoreCase(menu[i])) {
                hasil = menu[i];
                ada = true;
                break;
            }
        }
        if (ada) {
            System.out.println("Yeyy menu yang kamu cari yaitu "+ cari + " tersedia");
            System.out.println("=========================================================");
        } else {
            System.out.println("Yahh menu yang kamu cari yaitu "+ cari + " Tidak tersedia");
            System.out.println("=========================================================");
            System.out.println();
            System.out.println("=== List menu yang tersedia ===");
    
            for (int j = 0; j < menu.length; j++) {
                
                    System.out.println((j+1) + ". "+menu[j]);
                }
            System.out.println("===============================");
        }
    }
}
