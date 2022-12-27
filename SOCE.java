import java.util.Scanner;
public class SOCE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] data = { { "Apel", "12 byte" }, { "Pisang", "27 byte" }, { "Manggis", "43 byte" },
                { "Jeruk", "31 byte" } };
        int[] bit = { 1100000, 11011000, 101011000, 11111000 };

        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + ". " + data[i][0]);
        }
        System.out.print("Pilih yang ingin di ketahui bitnya : ");

        int pilih = sc.nextInt();
        if (pilih == 1) {
            System.out.println(data[0][0]);
            System.out.println("Tabel Bit : " + bit[0]);
            System.out.println("Byte : " + data[0][1]);
        } else if (pilih == 2) {
            System.out.println(data[1][0]);
            System.out.println("Tabel Bit : " + bit[1]);
            System.out.println("Byte : " + data[1][1]);
        } else if (pilih == 3) {
            System.out.println(data[2][0]);
            System.out.println("Tabel Bit : " + bit[2]);
            System.out.println("Byte : " + data[2][1]);
        } else if (pilih == 4) {
            System.out.println(data[3][0]);
            System.out.println("Tabel Bit : " + bit[3]);
            System.out.println("Byte : " + data[3][1]);
        } else {
            System.out.println("Yang anda inputkan tidak ada");
        }

    }

}