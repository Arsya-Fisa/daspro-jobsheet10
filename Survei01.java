import java.util.Scanner;
public class Survei01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int survey [][]=new int[10][6];


        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i+1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print("Masukan nilai antara (1-5), pertanyaan ke- " + (j+1) + " :");
                survey[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rata = (double) total/6;
            System.out.println("Rata-rata responden " + (i+1) + ": " + total);
        }
        System.out.println();
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            double rata = (double)total/10;
            System.out.println("Rata-rata setiap pertanyaan " + (j+1) + ": " + total);
        }
        System.out.println();
        int totalseluruh = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalseluruh += survey[i][j];
            }
        }
        double ratarata = (double) totalseluruh/(10*6);
        System.out.println("Rata-rata keseluruhan adalah: " + totalseluruh);
    }
}
