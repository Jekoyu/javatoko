import java.util.Scanner;

public class SOUS {
    public static void show(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print("]\n");
    }

    public static int[] insert(int arr[], int n) {
        if (n <= 10) {
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i] + 1;
            }
        }else{
            for (int i = 0; i < 10; i++) {
                arr[i] = arr[i] + 1;
            }
        }
        return arr;
    }

    public static void judul(String jdl) {
        System.out.println("==========================");
        System.out.println("\t" + jdl);
        System.out.println("==========================");
    }

    public static void proses(int pil, String app[][], int bit[]) {
        judul("Tabel Bit");
        show(insert(bit, Integer.parseInt(app[pil - 1][1])));
        System.out.println("==========================");
    }

    public static void menu(String app[][]) {
        judul("Daftar Aplikasi");
        for (int i = 0; i < app.length; i++) {
            System.out.println((i + 1) + " " + app[i][0]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String app[][] = { { "Bima +", "8" }, { "IntelIJ Idea", "9" }, { "VS Code", "5" }, { "Xampp", "4" },
                { "Opera", "3" }, { "Android Studio", "7" },{"Brave Browser","5"} ,{"Visual Studio","9"}};
        int bit[] = new int[10];
        judul("Tabel bit");
        show(bit);
        System.out.println("==========================");
        menu(app);
        System.out.print("Pilih Aplikasi\t: ");
        int pilih = in.nextInt();
        proses(pilih, app, bit);

    }
}
