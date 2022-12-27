import java.util.Scanner;
public class searchInput{
    static Scanner s = new Scanner(System.in);
    static void sequenSearch(int data[],int n,int cari){
        int penghitung = 0;boolean ketemu = false;
        for (int i = 0; i < n; i++) {
            if (data[i]==cari) {
                ketemu = true;
                penghitung++;
                System.out.println("Data "+cari+" berada pada elemen ke-"+(i+1));
            }
        }
        if (penghitung > 0) {
            System.out.println("Data " + cari + " berjumlah: " + penghitung);
        } else {
            System.out.println("Maaf data " + cari + " tidak ditemukan");
        }


    }
     static void insert(int data[]){
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan Data ke-" + (i + 1) + ": ");
            data[i] = s.nextInt();
        }
     }
    public static void main(String[] args) {
        
        System.out.print("Masukkan Jumlah Data : ");
        int jml = s.nextInt();
        int data[] = new int[jml];
        insert(data);
        System.out.print("Masukkan Data Yang Ingin Dicari= ");
        int cari = s.nextInt();
        sequenSearch(data, jml, cari);
    
    }
}