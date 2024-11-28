import java.util.Scanner;
public class Siakad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah siswa: ");
        int siswa = sc.nextInt();
        System.out.print("Masukan jumlah matakuliah: ");
        int matakuliah = sc.nextInt();

        int nilai [] [] = new int[siswa][matakuliah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke- " + (i+1));
            double totalpersiswa =0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalpersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalpersiswa/matakuliah);
        }
        System.out.println("\n===================================");
        System.out.println("Rata-rata setiap mata kuliah");

        for (int i = 0; i < nilai.length; i++) {
            double totalpermatkul = 0;

            for (int j = 0; j < nilai.length; j++) {
                totalpermatkul += nilai[i][j];
            }
            System.out.println("mata kuliah " + (i+1) + ": " + totalpermatkul/matakuliah);
        }

    }
}
