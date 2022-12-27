import java.util.Scanner;

public class SOBE{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        byte a = 97, b = 98, c = 99, d = 100, e = 101, f = 102, g = 103, h = 104, i = 105, j = 106, k = 107, l = 108,
                m = 109, n = 110, o = 111, p = 112, q = 113, r = 114, s = 115, t = 116, u = 117, v = 118, w = 119,
                x = 120, y = 121, z = 122, A = 65, B = 66, C = 67, D = 68, E = 69, F = 70, G = 71, H = 72, I = 73,
                J = 74, K = 75, L = 76, M = 77, N = 78, O = 79, P = 80, Q = 81, R = 82, S = 83, T = 84, U = 85, V = 86,
                W = 87, X = 88, Y = 89, Z = 90;
        String huruf, bit_a, bit_b, bit_c, bit_d, bit_e, bit_f, bit_g, bit_h, bit_i, bit_j, bit_k, bit_l, bit_m, bit_n,
                bit_o, bit_p, bit_q, bit_r, bit_s, bit_t, bit_u, bit_v, bit_w, bit_x, bit_y, bit_z, bit_A, bit_B, bit_C,
                bit_D, bit_E, bit_F, bit_G, bit_H, bit_I, bit_J, bit_K, bit_L, bit_M, bit_N, bit_O, bit_P, bit_Q, bit_R,
                bit_S, bit_T, bit_U, bit_V, bit_W, bit_X, bit_Y, bit_Z;

        System.out.print("Masukkan huruf antara a-f atau A_F : ");
        huruf = scan.nextLine();

        if (huruf.equals("a")) {
            System.out.println("bit\t | byte");
            bit_a = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_a, a);
        } else if (huruf.equals("b")) {
            System.out.println("bit\t | byte");
            bit_b = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_b, b);
        } else if (huruf.equals("c")) {
            System.out.println("bit\t | byte");
            bit_c = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_c, c);
        } else if (huruf.equals("d")) {
            System.out.println("bit\t | byte");
            bit_d = String.format("%8s", Integer.toBinaryString(d)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_d, d);
        } else if (huruf.equals("e")) {
            System.out.println("bit\t | byte");
            bit_e = String.format("%8s", Integer.toBinaryString(e)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_e, e);
        } else if (huruf.equals("f")) {
            System.out.println("bit\t | byte");
            bit_f = String.format("%8s", Integer.toBinaryString(f)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_f, f);
        } else if (huruf.equals("g")) {
            System.out.println("bit\t | byte");
            bit_g = String.format("%8s", Integer.toBinaryString(g)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_g, g);
        } else if (huruf.equals("h")) {
            System.out.println("bit\t | byte");
            bit_h = String.format("%8s", Integer.toBinaryString(h)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_h, h);
        } else if (huruf.equals("i")) {
            System.out.println("bit\t | byte");
            bit_i = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_i, i);
        } else if (huruf.equals("j")) {
            System.out.println("bit\t | byte");
            bit_j = String.format("%8s", Integer.toBinaryString(j)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_j, j);
        } else if (huruf.equals("k")) {
            System.out.println("bit\t | byte");
            bit_k = String.format("%8s", Integer.toBinaryString(k)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_k, k);
        } else if (huruf.equals("l")) {
            System.out.println("bit\t | byte");
            bit_l = String.format("%8s", Integer.toBinaryString(l)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_l, l);
        } else if (huruf.equals("m")) {
            System.out.println("bit\t | byte");
            bit_m = String.format("%8s", Integer.toBinaryString(m)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_m, m);
        } else if (huruf.equals("n")) {
            System.out.println("bit\t | byte");
            bit_n = String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_n, n);
        } else if (huruf.equals("o")) {
            System.out.println("bit\t | byte");
            bit_o = String.format("%8s", Integer.toBinaryString(o)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_o, o);
        } else if (huruf.equals("p")) {
            System.out.println("bit\t | byte");
            bit_p = String.format("%8s", Integer.toBinaryString(p)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_p, p);
        } else if (huruf.equals("q")) {
            System.out.println("bit\t | byte");
            bit_q = String.format("%8s", Integer.toBinaryString(q)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_q, q);
        } else if (huruf.equals("r")) {
            System.out.println("bit\t | byte");
            bit_r = String.format("%8s", Integer.toBinaryString(r)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_r, r);
        } else if (huruf.equals("s")) {
            System.out.println("bit\t | byte");
            bit_s = String.format("%8s", Integer.toBinaryString(s)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_s, s);
        } else if (huruf.equals("t")) {
            System.out.println("bit\t | byte");
            bit_t = String.format("%8s", Integer.toBinaryString(t)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_t, s);
        } else if (huruf.equals("u")) {
            System.out.println("bit\t | byte");
            bit_u = String.format("%8s", Integer.toBinaryString(u)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_u, u);
        } else if (huruf.equals("v")) {
            System.out.println("bit\t | byte");
            bit_v = String.format("%8s", Integer.toBinaryString(v)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_v, v);
        } else if (huruf.equals("w")) {
            System.out.println("bit\t | byte");
            bit_w = String.format("%8s", Integer.toBinaryString(w)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_w, w);
        } else if (huruf.equals("x")) {
            System.out.println("bit\t | byte");
            bit_x = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_x, x);
        } else if (huruf.equals("y")) {
            System.out.println("bit\t | byte");
            bit_y = String.format("%8s", Integer.toBinaryString(y)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_y, y);
        } else if (huruf.equals("z")) {
            System.out.println("bit\t | byte");
            bit_z = String.format("%8s", Integer.toBinaryString(z)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_z, z);
        } else if (huruf.equals("A")) {
            System.out.println("bit\t | byte");
            bit_A = String.format("%8s", Integer.toBinaryString(A)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_A, A);
        } else if (huruf.equals("B")) {
            System.out.println("bit\t | byte");
            bit_B = String.format("%8s", Integer.toBinaryString(B)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_B, B);
        } else if (huruf.equals("C")) {
            System.out.println("bit\t | byte");
            bit_C = String.format("%8s", Integer.toBinaryString(C)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_C, C);
        } else if (huruf.equals("D")) {
            System.out.println("bit\t | byte");
            bit_D = String.format("%8s", Integer.toBinaryString(D)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_D, D);
        } else if (huruf.equals("E")) {
            System.out.println("bit\t | byte");
            bit_E = String.format("%8s", Integer.toBinaryString(E)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_E, E);
        } else if (huruf.equals("F")) {
            System.out.println("bit\t | byte");
            bit_F = String.format("%8s", Integer.toBinaryString(F)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_F, F);
        } else if (huruf.equals("G")) {
            System.out.println("bit\t | byte");
            bit_G = String.format("%8s", Integer.toBinaryString(G)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_G, G);
        } else if (huruf.equals("H")) {
            System.out.println("bit\t | byte");
            bit_H = String.format("%8s", Integer.toBinaryString(H)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_H, H);
        } else if (huruf.equals("I")) {
            System.out.println("bit\t | byte");
            bit_I = String.format("%8s", Integer.toBinaryString(I)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_I, I);
        } else if (huruf.equals("J")) {
            System.out.println("bit\t | byte");
            bit_J = String.format("%8s", Integer.toBinaryString(J)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_J, J);
        } else if (huruf.equals("K")) {
            System.out.println("bit\t | byte");
            bit_K = String.format("%8s", Integer.toBinaryString(K)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_K, K);
        } else if (huruf.equals("L")) {
            System.out.println("bit\t | byte");
            bit_L = String.format("%8s", Integer.toBinaryString(L)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_L, L);
        } else if (huruf.equals("M")) {
            System.out.println("bit\t | byte");
            bit_M = String.format("%8s", Integer.toBinaryString(M)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_M, M);
        } else if (huruf.equals("N")) {
            System.out.println("bit\t | byte");
            bit_N = String.format("%8s", Integer.toBinaryString(N)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_N, N);
        } else if (huruf.equals("O")) {
            System.out.println("bit\t | byte");
            bit_O = String.format("%8s", Integer.toBinaryString(O)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_O, O);
        } else if (huruf.equals("P")) {
            System.out.println("bit\t | byte");
            bit_P = String.format("%8s", Integer.toBinaryString(P)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_P, P);
        } else if (huruf.equals("Q")) {
            System.out.println("bit\t | byte");
            bit_Q = String.format("%8s", Integer.toBinaryString(Q)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_Q, Q);
        } else if (huruf.equals("R")) {
            System.out.println("bit\t | byte");
            bit_R = String.format("%8s", Integer.toBinaryString(R)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_R, R);
        } else if (huruf.equals("S")) {
            System.out.println("bit\t | byte");
            bit_S = String.format("%8s", Integer.toBinaryString(S)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_S, S);
        } else if (huruf.equals("T")) {
            System.out.println("bit\t | byte");
            bit_T = String.format("%8s", Integer.toBinaryString(T)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_T, T);
        } else if (huruf.equals("U")) {
            System.out.println("bit\t | byte");
            bit_U = String.format("%8s", Integer.toBinaryString(U)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_U, U);
        } else if (huruf.equals("V")) {
            System.out.println("bit\t | byte");
            bit_V = String.format("%8s", Integer.toBinaryString(V)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_V, V);
        } else if (huruf.equals("W")) {
            System.out.println("bit\t | byte");
            bit_W = String.format("%8s", Integer.toBinaryString(W)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_W, W);
        } else if (huruf.equals("X")) {
            System.out.println("bit\t | byte");
            bit_X = String.format("%8s", Integer.toBinaryString(X)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_X, X);
        } else if (huruf.equals("Y")) {
            System.out.println("bit\t | byte");
            bit_Y = String.format("%8s", Integer.toBinaryString(Y)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_Y, Y);
        } else if (huruf.equals("Z")) {
            System.out.println("bit\t | byte");
            bit_Z = String.format("%8s", Integer.toBinaryString(Z)).replace(' ', '0');
            System.out.printf("%s = %d \n", bit_Z, Z);
        } else {
            System.out.println("Huruf yang anda inputkan tidak ada");
        }

    }

}