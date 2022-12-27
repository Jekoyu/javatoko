import java.util.Scanner;

public class MHS {

    static Scanner scannerNumber = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);

    private static String[][] addElementArray(String arrayMahasiswa[][]) {
        System.out.print("\n> Tambah Mahasiswa");
        String arrayTemp[][] = arrayMahasiswa;
        arrayMahasiswa = new String[arrayTemp.length + 1][3];
        for (int i = 0; i < arrayTemp.length; i++) {
            arrayMahasiswa[i][0] = arrayTemp[i][0];
            arrayMahasiswa[i][1] = arrayTemp[i][1];
            arrayMahasiswa[i][2] = arrayTemp[i][2];
        }
        System.out.print("Masukkan NIM\t: ");
        arrayMahasiswa[arrayTemp.length][0] = scannerString.nextLine();
        System.out.print("Masukkan Nama\t:");
        arrayMahasiswa[arrayTemp.length][1] = scannerString.nextLine();
        return arrayMahasiswa;
    }

    private static String[][] removeElemntaryArray(String arrayMahasiswa[][]) {

        System.out.println("\n> Hapus Data Mahasiswa");
        if (arrayMahasiswa.length == 0) {
            System.out.println("Data Kosong");
            return arrayMahasiswa;
        } else {
            System.out.print("Masukkan NIM yang akan dihapus\t: ");
            String removeElement = scannerString.nextLine();
            String arrayTemp[][] = arrayMahasiswa;
            arrayMahasiswa = new String[arrayTemp.length - 1][3];

            for (int i = 0; i < arrayMahasiswa.length; i++) {
                System.out.println("Proses ke-" + i);
                if (!arrayTemp[i][0].equals(removeElement)) {
                    System.out.println("Ini ya");
                    arrayMahasiswa[i][0] = arrayTemp[i][0];
                    arrayMahasiswa[i][1] = arrayTemp[i][1];
                    arrayMahasiswa[i][2] = arrayTemp[i][2];
                } else {
                    System.out.println("Ini kah");
                    arrayMahasiswa[i][0] = arrayTemp[i + 1][0];
                    arrayMahasiswa[i][1] = arrayTemp[i + 1][1];
                    arrayMahasiswa[i][2] = arrayTemp[i + 1][2];
                }
            }

            return arrayMahasiswa;
        }
    }

    public static String[][] selectionAsc(String array[][]) {
        System.out.println("\n> Urutkan Data Mahasiswa");
        int flag;
        String temp[] = new String[3];
        for (int i = 0; i < array.length; i++) {
            flag = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j][0].compareTo(array[flag][0]) < 0)
                    flag = j;
            }
            if (flag != i) {
                for (int j = 0; j < temp.length; j++)
                    temp[j] = array[i][j];
                for (int j = 0; j < temp.length; j++)
                    array[i][j] = array[flag][j];
                for (int j = 0; j < temp.length; j++)
                    array[flag][j] = temp[j];
            }
        }
        return array;
    }

    public static void printArray(String array[][]) {
        System.out.println("\n> Cetak Data Mahasiswa");
        if (array.length == 0) {
            System.out.println("Data Kosong!");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Mahasiswa ke-" + (i + 1) + "\t: ");
                System.out.println("NIM\t: " + array[i][0]);
                System.out.println("Nama\t: " + array[i][1]);
                System.out.println("Prodi\t: " + array[i][2]);
            }
        }
    }

    public static void menu() {
        System.out.println("\n>==== Data Mahasiswa ====");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Hapus Data Mahasiswa");
        System.out.println("3. Urutkan Data Mahasiswa");
        System.out.println("4. Cetak Data Mahasiswa");
        System.out.println("5. Tutup");
    }

    public static void main(String[] args) {

        String arrayMahasiswa[][] = new String[0][3];
        int pilih = 0;
        do {
            menu();
            System.out.print("Silahkan pilih menu\t: ");
            pilih = scannerNumber.nextInt();
            switch (pilih) {
                case 1:
                    arrayMahasiswa = addElementArray(arrayMahasiswa);
                    break;
                case 2:
                    arrayMahasiswa = removeElemntaryArray(arrayMahasiswa);
                    break;
                case 3:
                    arrayMahasiswa = selectionAsc(arrayMahasiswa);
                    printArray(arrayMahasiswa);
                    break;
                case 4:
                    printArray(arrayMahasiswa);
                    break;
                case 5:
                    System.out.println("\nkeluar dari sistem ...");
                    break;
            }
        } while (pilih != 5);

    }

}