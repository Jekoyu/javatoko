import java.util.Scanner;
public class SO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int word = 3, ppt = 2, calculator = 2;
        String[] app = { "Word", "PPT", "Calculator" };
        int[] bit = new int[10];
        System.out.println(">=====Tabel Bit=====<");
        System.out.print("[");
        for (int i = 0; i < bit.length; i++) {
            System.out.print(bit[i]);
            System.out.print(", ");
        }
        System.out.print("]");

        System.out.println("\n\n>=====Daftar Aplikasi=====<");
        for (int i = 0; i < app.length; i++) {
            System.out.println((i + 1) + "." + app[i]);
        }

        System.out.print("\nJalankan Aplikasi\t: ");
        int pilih = in.nextInt();

        switch (pilih) {

            case 1:
                for (int i = 0; i < word; i++) {
                    int temp = bit[i];
                    bit[i] = bit[i] + 1;
                }
                System.out.println(">=====Tabel Bit=====<");
                System.out.print("[");
                for (int i = 0; i < bit.length; i++) {
                    System.out.print(bit[i]);
                    System.out.print(", ");
                }
                System.out.print("]");
                break;

            case 2:
                for (int i = 0; i < ppt; i++) {
                    int temp = bit[i];
                    bit[i] = bit[i] + 1;
                }
                System.out.println(">=====Tabel Bit=====<");
                System.out.print("[");
                for (int i = 0; i < bit.length; i++) {
                    System.out.print(bit[i]);
                    System.out.print(", ");
                }
                System.out.print("]");
                break;

            case 3:
                for (int i = 0; i < calculator; i++) {
                    int temp = bit[i];
                    bit[i] = bit[i] + 1;
                }
                System.out.println(">=====Tabel Bit=====<");
                System.out.print("[");
                for (int i = 0; i < bit.length; i++) {
                    System.out.print(bit[i]);
                    System.out.print(", ");
                }
                System.out.print("]");
                break;
        }
    }
}
