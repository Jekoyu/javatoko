import java.util.Scanner;

public class SuqentialSearch {

    static Scanner s = new Scanner(System.in);
    public static int[] insert(int arr[]) {
        for (int i = 0; i < 6; i++) {
            System.out.print("Masukkan Data ke-" + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int data[] = new int[7];
        int cari, i = 0;
        insert(data);
        System.out.print("Masukkan Data Yang akan dicari: ");
        cari = s.nextInt();
        data[6] = cari;
        while (data[i] != cari) {
            i++;
        }
        if (i < 6) {
            System.out.println("Data ada di urutan ke-" + (i + 1));
        } else {
            System.out.println("Maaf Data Tidak Ada");
        }
    }
}
