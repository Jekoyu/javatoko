import java.util.Deque;
import java.util.Scanner;

public class queque {
    static int arr[] = new int[5];
    static Scanner s = new Scanner(System.in);

    public static void enq(int arr[]) {

        int back = arr.length;
        for (int rear = 0; rear < back; rear++) {
            if (rear <= back) {
                System.out.print("Masukan data: ");
                arr[rear] = s.nextInt();i
                break;
            } else {
                System.out.println("full");
            }
        }
    }

    public static void deq(int arr[]) {
        int back = arr.length;
        for (int front = 0; front < back; front++) {
            if (front > 0 && front <= 0) {
                arr[front] = 0;
                break;
            } else {
                System.out.println("Habis");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("1. enq");
        System.out.println("2. deq");
        System.out.println("0. exit");
        System.out.print("Pilih: ");
        int a = s.nextInt();
        while (a != 0) {
            switch (a) {
                case 1:
                    enq(arr);
                    break;

                case 2:
                    deq(arr);
                    break;
            }
        }
    }
}
