import java.util.Scanner;

public class stack {
   
    static int top = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang array");
        int n = sc.nextInt();
        int stack[] = new int[n];
        String stack1[] = new String[n];
        while (true) {
            System.out.println("\n-------[Pilihan Menu]-------");
            System.out.println("1. Push");
            System.out.println("2. Peek");
            System.out.println("3. Pop");
            System.out.println("4. Print");
            System.out.print("Pilih Menu : ");
            int pilih = sc.nextInt();

            if (pilih == 1) {// push
                push1(stack,stack1);
            } else if (pilih == 2) {// peek
                System.out.println("Nilai Peek saat ini : " + peek(stack1));
            } else if (pilih == 3) {// pop
                pop(stack,stack1);

            } else if (pilih == 4) {// print

                printArray(stack,stack1);
            }

        }

    }

    public static void push(int stack[],String stack1[],int nilai, String nama) {
        if (top == stack.length) {
            System.out.println("stack penuh tidak bisa mengisi");
        } else {
            stack[top] = nilai;
            stack1[top] = nama;
            top++;

        }
    }

    public static String peek(String stack1[]) {

        return stack1[top - 1];

    }

    public static void pop(int stack[],String stack1[]) {
        if (top == 0) {
            System.out.println("Stack kosong tidak bisa pop");
        } else {
            top--;
            stack[top] = 0;
            stack1[top] = null;
        }
    }

    public static void push1(int stack[],String stack1[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nilai : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("nama : ");
        String b = sc.nextLine();
        push(stack,stack1,a,b);
    }

    public static void printArray(int stack[],String stack1[]) {
        for (int i = stack.length - 1; i >= 0; i--) {
            System.out.println(stack[i] + "," + stack1[i]);
        }
    }

}