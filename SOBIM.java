// import java.util.Scanner;

// public class SOBIM {
//     static Scanner sc = new Scanner(System.in);
//     static String apl[][] = {
//             { "WhatsApp", "17 byte" },
//             { "Instagram", "23 byte" },
//             { "Mobile Legend", "45 byte" }
//     };
//     static int n[] = { 2, 3, 5 };
//     static int pilihApl;
//     static int kode;
//     static int top = 0;
//     static int tampilanBinner[] = new int[10];
//     public static void main(String[] args) {

//         while (true) {
//             System.out.println("\n========MENU========");
//             System.out.println("1. Buka Aplikasi");
//             System.out.println("2. Tutup Aplikasi");
//             System.out.println("3. Tampilkan Aplikasi Berjalan");
//             System.out.println("4. Tampilkan Kode Binner");
//             System.out.println("0. Keluar");

//             System.out.print("\nPilih Menu : ");
//             int pilih = sc.nextInt();
//             sc.nextLine();

//             if (pilih == 1) {
//                 bukaApl();

//             } else if (pilih == 2) {

//             } else if (pilih == 3) {
//                 tampilkan();

//             } else if (pilih == 4) {
//                 kodeBinner();
//             } else if (pilih == 0) {
//                 break;

//             } else {
//                 System.out.println("Salah Inputan");
//             }

//         }
//     }

//     public static void bukaApl() {
//         System.out.println("\n1. WhatsApp");
//         System.out.println("2. Instagram");
//         System.out.println("3. Mobile Legend");
//         System.out.print("Pilih Aplikasi : ");
//         pilihApl = sc.nextInt();
//     }

//     public static void tampilkan() {
//         for (int i = 0; i < apl.length; i++) {
//             if (i == pilihApl - 1) {
//                 System.out.println("\nNama Aplikasi : " + apl[i][0] + " , Size : " + apl[i][1]);
//             }
//         }
//     }

//     public static void kodeBinner() {
//         System.out.println("\nKode Binner : ");
//         for (int i = 0; i < apl.length; i++) {
//             if (i == pilihApl - 1) {
//                 kode = kode + n[i];

//             }

//         }

//         for (int i = 0; i < kode; i++) {
//             push(1);
//         }

//         for (int i = 0; i < 10; i++) {
//             System.out.print(tampilanBinner[i] + " ");
//         }

//     }

//     public static void push(int nilai) {
//         if (top == tampilanBinner.length) {
//             System.out.println("RAM Penuh");
//         } else {
//             tampilanBinner[top] = nilai;
//             top++;
//         }
//     }

// }



// import java.util.Scanner;

// public class SOBIM {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[][] data = { { "Netbeans", "27 byte" }, { "Ms Power Point", "15 byte" }, { "After Effect", "50 byte" } };
//         int[] bit = { 11100000, 11000000, 11111000 };

//         System.out.println("Program");

//         for (int i = 0; i < data.length; i++) {
//             System.out.println((i + 1) + "," + data[i][0]);
//         }
//         System.out.print("Program mau dirun : ");

//         int pilih = sc.nextInt();
//         if (pilih == 1) {
//             System.out.println(data[0][0]);
//             System.out.println("Tabel Bit : " + bit[0]);
//             System.out.println("Size : " + data[0][1]);

//         } else if (pilih == 2) {
//             System.out.println(data[1][0]);
//             System.out.println("Tabel Bit : " + bit[1]);
//             System.out.println("Size : " + data[1][1]);

//         } else if (pilih == 3) {
//             System.out.println(data[2][0]);
//             System.out.println("Tabel Bit : " + bit[2]);
//             System.out.println("Size : " + data[2][1]);
//         } else {
//             System.out.println("Maaf Tidak Ada Program");

//         }

//     }

// }

// import java.util.Scanner;

// public class SOBIM {
//     static boolean ketemu = false;

//     static void squenSearch(int data[], int n, int cari) {
//        int  penghitung = 0;
//         boolean ketemu = false;
//         for (int i = 0; i < data.length; i++) {
//             if (data[i] == cari) {
//                 ketemu = true;
//                 penghitung++;
//                 System.out.println("Data " + cari + " berada pada elemen ke-" + (i + 1));
//             }
//         }
//         if (penghitung > 0) {
//             System.out.println("Data " + cari + ", ada dalam larik sebanyak " + penghitung);
//         } else {
//             System.out.println("Maaf data " + cari + " tidak ditemukan");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Masukkan jumlah data: ");
//         int n = s.nextInt();
//         int data[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.print("Masukkan data ke-" + (i + 1) + ": ");
//             data[i] = s.nextInt();
//         }
//         System.out.print("Masukkan data yang ingin dicari= ");
//         int cari = s.nextInt();
//         squenSearch(data, n, cari);
//     }
// }