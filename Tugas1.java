import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rata = 0, total = 0;
        int tertinggi = 0, terendah = 100;
      
        System.out.println("============================================");
        System.out.print("Masukkan banyak mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();
        System.out.println("--------------------------------------------");
        
        int nilai[] = new int[jmlMahasiswa];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai mahasiswa ke- " + (i+1) + ": ");
            nilai[i] = sc.nextInt();

        }
        System.out.println("============================================");
        System.out.println("== Berikut adalah seluruh nilai mahasiswa ==");
        System.out.println("============================================");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke- "+ (i+1) + " adalah " + nilai[i]);
        }
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            } if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            total +=  nilai[i];
            rata = total / nilai.length;
        }
        System.out.println("============================================");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Rata-rata nilai seluruh mashasiswa: " + rata);
        System.out.println("============================================");

    }
}
