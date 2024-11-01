import java.util.Scanner;

public class ArrayRataNilai09modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jmlMahasiswa];
        double total = 0;
        double rataLulus, rataTidakLulus;
        double lulus = 0, tidakLulus = 0, totalMhsLulus = 0, totalMhsTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- "+ (i+1)+ ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus += nilaiMhs[i];
                totalMhsLulus++;
            } else {
                tidakLulus += nilaiMhs[i];
                totalMhsTidakLulus++;
            }
        }
        
        rataLulus = lulus / totalMhsLulus;
        System.out.println("Rata-rata nilai lulus = "+ rataLulus);
        rataTidakLulus =  tidakLulus / totalMhsTidakLulus;
        System.out.println("Rata-rata nilai tidak lulus = "+ rataTidakLulus);
    }
}
