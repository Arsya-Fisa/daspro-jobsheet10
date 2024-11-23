import java.util.Scanner;
public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris=0,kolom = 0;
        String nama, next;

        String penonton[][] = new String [4][2];
        while (true) {
            System.out.println("Pilih Menu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan Daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Masukan Pilihan Menu");
            int PilihanMenu = sc.nextInt();
            sc.nextLine();

            if (PilihanMenu == 1) {
                
                System.out.print("Masukan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukan baris: ");
                baris = sc.nextInt();
                while (true) {
                    
                    if (baris >= 1 && baris <= 4) {
                      break;  
                    }else {
                        System.out.println("Angka tidak valid");
                    }
                }
                while (true) {
                    
                    System.out.print("Masukan kolom: ");
                    kolom = sc.nextInt();
                    if (kolom >= 1 && kolom <=2) {
                        break;
                    }else{ 
                        System.out.println("Angka Tidak valid");
                    }
                }
                sc.nextLine();
                
                if (penonton[baris-1] [kolom-1] != null) {
                    System.out.println("---Kursi Sudah ditempati,harap pilih kursi lain---");
                }else {
                    penonton[baris-1] [kolom-1] = nama;
                   
                }
                
                
    
          
            } else if (PilihanMenu == 2) {
                System.out.println("Daftar Penonton");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton [i] [j] != null) {
                            System.out.print(penonton[i] [j] + "   ");
                        }else {
                            System.out.print(" *** ");
                        }
                       
                    }
                    System.out.println();
                }
            }else if (PilihanMenu ==3) {
                System.out.print("===Terima Kasih===");
                break;
            }
        }
    }
}
