import java.util.Scanner;

public class JumlahData {
    public static void main(String[] args) {
        int data[] = { 15, 16, 14, 21, 76, 15 };
        int cari, penghitung = 0;
        boolean ketemu = false;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Data Yang Ingin Dicari= ");
        cari = s.nextInt();
        for (int i = 0; i < 6; i++) {
            if (data[i] == cari) {
                ketemu = true;
                penghitung++;
            }
        }

        if (penghitung>0) {
            System.out.println("Data " + cari + " berjumlah: " + penghitung);
        } else {
            System.out.println("Maaf data " + cari + " tidak ditemukan");
        }

    }
}