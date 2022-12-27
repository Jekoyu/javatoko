import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas {
    static Scanner input = new Scanner(System.in);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static String users[][] = new String[10][3];
    static String produk[][] = new String[10][4];
    static String[][] keranjang = new String[10][6];
    static String[][] pembeli = new String[10][2];
    static String[][] invoice = new String[10][2];

    public static String[][] sortString(String array[][], int u, String con) {
        int flag = 0;
        String temp[] = new String[array.length];
        if (con == "desc") {
            for (int i = 0; i < array.length; i++) {
                flag = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j][u].compareTo(array[flag][u]) > 0)
                        flag = j;
                }
                if (flag != 1) {
                    for (int j = 0; j < temp.length; j++)
                        temp[j] = array[i][j];
                    for (int j = 0; j < temp.length; j++)
                        array[i][j] = array[flag][j];
                    for (int j = 0; j < temp.length; j++)
                        array[flag][j] = temp[j];
                }
            }
        } else if (con == "asc") {

            for (int i = 0; i < array.length; i++) {
                flag = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j][u].compareTo(array[flag][u]) < 0)
                        flag = j;
                }
                if (flag != i) {
                    for (int j = u; j < temp.length; j++)
                        temp[j] = array[i][j];
                    for (int j = u; j < temp.length; j++)
                        array[i][j] = array[flag][j];
                    for (int j = u; j < temp.length; j++)
                        array[flag][j] = temp[j];
                }
            }

        }
        return array;
    }

    public static String[][] sort(String array[][], int u, String con) {
        int flag;
        String temp[] = new String[array.length];
        if (con == "desc") {
            for (int i = 0; i < array.length; i++) {
                flag = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (Integer.parseInt(array[j][u]) > Integer.parseInt(array[flag][u]))
                        flag = j;
                }
                if (flag != 1) {
                    for (int j = 0; j < temp.length; j++)
                        temp[j] = array[i][j];
                    for (int j = 0; j < temp.length; j++)
                        array[i][j] = array[flag][j];
                    for (int j = 0; j < temp.length; j++)
                        array[flag][j] = temp[j];
                }
            }
        } else if (con == "asc") {
            for (int i = 0; i < array.length; i++) {
                flag = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (Integer.parseInt(array[j][u]) < Integer.parseInt(array[flag][u]))
                        flag = j;
                }
                if (flag != 1) {
                    for (int j = 0; j < temp.length; j++)
                        temp[j] = array[i][j];
                    for (int j = 0; j < temp.length; j++)
                        array[i][j] = array[flag][j];
                    for (int j = 0; j < temp.length; j++)
                        array[flag][j] = temp[j];
                }
            }
        }

        return array;
    }

    public static void printWhere(String arr[][], int data, String con) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][data] != con) {
                    if (arr[i][j].length() >= 8) {
                        System.out.print(arr[i][j] + "\t");
                    } else {
                        System.out.print(arr[i][j] + "\t\t");
                    }
                }
            }
            System.out.println();
        }

    }

    public static void printArray(String arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != null) {
                    if (arr[i][j].length() >= 8) {
                        System.out.print(arr[i][j] + "\t");
                    } else {
                        System.out.print(arr[i][j] + "\t\t");
                    }
                }
            }
            if (arr[i][0] != null) {
                System.out.println();
            }

        }
    }

    public static String[][] register(String arr[][]) {
        try {
            judul("Registrasi");
            System.out.print("> Inputkan Username :");
            String user = in.readLine();
            System.out.print("> Inputkan Password :");
            String pwd = in.readLine();
            System.out.println("------------------------------");
            boolean c = true;
            int i = 0;
            do {
                if (arr[i][0] != null) {
                    if (user.equals(users[i][0])) {
                        arr[i][1] = pwd;
                        c=false;
                    } else {
                        i++;
                    }
                } else if (arr[i][0] == null) {
                    arr[i][0] = user;
                    arr[i][1] = pwd;
                    arr[i][2] = "2";
                    c = false;
                }
            } while (c == true);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Data Berhasil Ditambahkan!");
        return arr;

    }

    public static void login(String arr[][]) {
        judul("Login");
        System.out.print("> Inputkan Username : ");
        String user = input.next();
        System.out.print("> Inputkan Password : ");
        String pwd = input.next();
        System.out.println("------------------------------");
        for (int j = 0; j < arr.length; j++) {
            if (user.equals(arr[j][0]) && pwd.equals(arr[j][1])) {
                if (arr[j][2] == "1") {
                    admin();
                    break;
                } else if (arr[j][2] == "2") {
                    customer(user);
                    break;
                }
            } else {
                System.out.println("Username / Password Salah!");
            }
        }
    }

    public static void delKeranjang() {
        System.out.print("> Inputkan Urutan Produk : ");
        int i = input.nextInt();
        System.out.println("------------------------------");
        keranjang[i - 1][0] = null;
        keranjang[i - 1][1] = null;
        keranjang[i - 1][2] = null;
        keranjang[i - 1][3] = null;
        keranjang[i - 1][4] = null;
        for (int k = 0; k < keranjang.length - 1; k++) {
            if (keranjang[k][0] == null) {
                if (keranjang[k + 1][0] != null) {
                    keranjang[k][0] = keranjang[k + 1][0];
                    keranjang[k][1] = keranjang[k + 1][1];
                    keranjang[k][2] = keranjang[k + 1][2];
                    keranjang[k][3] = keranjang[k + 1][3];
                    keranjang[k][4] = keranjang[k + 1][4];
                    keranjang[k + 1][0] = null;
                    keranjang[k + 1][1] = null;
                    keranjang[k + 1][2] = null;
                    keranjang[k + 1][3] = null;
                    keranjang[k + 1][4] = null;
                }
            }
        }
    }

    public static void ubahKeranjang() {
        System.out.print("> Inputkan Urutan Produk : ");
        int i = input.nextInt();
        System.out.print("> Inputkan Jumlah Produk : ");
        int jumlah = input.nextInt();
        System.out.println("------------------------------");
        keranjang[i - 1][3] = String.valueOf(jumlah);
        keranjang[i - 1][4] = String.valueOf(Integer.parseInt(keranjang[i - 1][2]) * jumlah);
    }

    public static void addKeranjan() {
        System.out.print("> Inputkan Urutan Produk : ");
        int i = input.nextInt();
        System.out.print("> Inputkan Jumlah Produk : ");
        int jumlah = input.nextInt();
        System.out.println("------------------------------");
        for (int j = 0; j < keranjang.length; j++) {
            if (keranjang[j][0] == null) {
                keranjang[j][0] = produk[i - 1][0];
                keranjang[j][1] = produk[i - 1][1];
                keranjang[j][2] = produk[i - 1][2];
                keranjang[j][3] = String.valueOf(jumlah);
                keranjang[j][4] = String.valueOf(Integer.parseInt(produk[i - 1][2]) * jumlah);
                break;
            } else if (keranjang[j][0].equals(produk[i - 1][0])) {
                keranjang[j][3] = String.valueOf(Integer.parseInt(keranjang[j][3]) + jumlah);
                keranjang[j][4] = String.valueOf(Integer.parseInt(keranjang[j][4]) * Integer.parseInt(keranjang[j][3]));
                break;
            }
        }
        produk[i - 1][3] = Integer.toString(Integer.parseInt(produk[i - 1][3]) - jumlah);

    }

    public static void menuAdmin() {
        System.out.println("------------------------------");
        System.out.println("\tMenu Admin");
        System.out.println("------------------------------");
        System.out.println("1. Tambah Daftar Kosmetik");
        System.out.println("2. Ubah Daftar Kosmetik");
        System.out.println("3. Hapus Daftar Kosmetik");
        System.out.println("4. Lihat Daftar Kosmeti");
        System.out.println("5. Tambah login");
        System.out.println("6. Ubah data login");
        System.out.println("7. Hapus data login");
        System.out.println("8. Lihat Data login");
        System.out.println("9. Lihat Daftar pembeli");
        System.out.println("10. Lihat Daftar Invoice");
        System.out.println("11. Keluar");
        System.out.println("------------------------------");
        System.out.print("> Inputkan Pilihan : ");
    }

    public static void judul(String a) {
        System.out.println("------------------------------");
        System.out.println("\t" + a);
        System.out.println("------------------------------");
    }

    public static String[][] addProduk(String arr[][], String a) {
        judul(a);
        System.out.print("> Inputkan Nama Produk : ");
        String nama = input.next();
        System.out.print("> Inputkan Harga Produk : ");
        String harga = input.next();
        System.out.print("> Inputkan Stok Produk : ");
        String stok = input.next();
        System.out.println("------------------------------");

        for (int i = 0; i < arr.length; i++) {
            if (nama.equals(arr[i][1])) {
                arr[i][3] = String.valueOf(Integer.parseInt(arr[i][3]) + Integer.parseInt(stok));
                if (arr[i][2] != harga) {
                    arr[i][2] = harga;
                    break;
                }
                break;
            } else if (arr[i][0] == null) {
                arr[i][0] = noId(arr, "BRG");
                arr[i][1] = nama;
                arr[i][2] = harga;
                arr[i][3] = stok;
                break;
            }
        }
        System.out.println("Data Berhasil Ditambahkan!");
        return arr;
    }

    public static String[][] delProduk(String arr[][]) {
        judul("Hapus Produk");
        System.out.println("Id Produk\tNama\tHarga\tStok");
        printArray(arr);
        System.out.print("> Inputkan Urutan Produk : ");
        int i = input.nextInt();
        System.out.println("------------------------------");
        arr[i - 1][0] = null;
        arr[i - 1][1] = null;
        arr[i - 1][2] = null;
        arr[i - 1][3] = null;
        for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k][0] == null) {
                if (arr[k + 1][0] != null) {
                    arr[k][0] = arr[k + 1][0];
                    arr[k][1] = arr[k + 1][1];
                    arr[k][2] = arr[k + 1][2];
                    arr[k][3] = arr[k + 1][3];
                    arr[k + 1][0] = null;
                    arr[k + 1][1] = null;
                    arr[k + 1][2] = null;
                    arr[k + 1][3] = null;
                }
            }
        }
        return arr;
    }

    public static String[][] delUsers(String arr[][]) {
        judul("Hapus Users");
        System.out.println("Username\tPassword\tRole");
        printArray(arr);
        System.out.print("> Inputkan Urutan Users : ");
        int i = input.nextInt();
        System.out.println("------------------------------");
        if (i != 1) {
            arr[i - 1][0] = null;
            arr[i - 1][1] = null;
            arr[i - 1][2] = null;
            for (int k = 0; k < arr.length - 1; k++) {
                if (arr[k][0] == null) {
                    if (arr[k + 1][0] != null) {
                        arr[k][0] = arr[k + 1][0];
                        arr[k][1] = arr[k + 1][1];
                        arr[k][2] = arr[k + 1][2];
                        arr[k + 1][0] = null;
                        arr[k + 1][1] = null;
                        arr[k + 1][2] = null;
                    }
                }
            }
        }
        return arr;
    }

    public static void admin() {
        int pilihan = 0;
        do {
            menuAdmin();
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                   addProduk(produk, "Tambah Produk");
                    break;
                case 2:
                    addProduk(produk, "Update Produk");
                    break;
                case 3:
                   delProduk(produk);
                    break;
                case 4:
                    System.out.println("Id barang\tNama\t\tHarga\t\tStok");
                    printArray(produk);
                    break;
                case 5:
                    register(users);
                    break;
                case 6:
                    register(users);
                    break;
                case 7:
                    users = delUsers(users);
                    break;
                case 8:
                    printArray(users);
                    break;
                case 9:
                    printArray(pembeli);
                    break;
                case 10:
                    printArray(invoice);
                    break;
                case 11:
                    System.out.println("------------------------------");
                    System.out.println("\tTerima Kasih");
                    System.out.println("------------------------------");
                    break;
                default:
                    System.out.println("------------------------------");
                    System.out.println("\tPilihan Tidak Ada");
                    System.out.println("------------------------------");
                    break;
            }
        } while (pilihan != 11);
    }

    public static int menucustomer() {
        System.out.println("------------------------------");
        System.out.println("\tKosmetik Lala");
        System.out.println("------------------------------");
        System.out.println("1. Daftar Produk");
        System.out.println("2. Tambah Daftar Keranjang");
        System.out.println("3. Hapus Daftar Keranjang");
        System.out.println("4. Ubah Daftar Keranjang");
        System.out.println("5. Lihat Daftar Keranjang");
        System.out.println("6. Lihat Invoice");
        System.out.println("7. Keluar");
        System.out.print("pilih :");
        int pilih = input.nextInt();
        return pilih;
    }

    public static String noId(String arr[][], String a) {
        String re = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == null) {
                re = a + String.format("%04d", (i + 1));
                break;
            } else if (!arr[i][0].equals(a + String.format("%04d", i))) {
                re = a + String.format("%04d", i);
            }
        }
        return re;
    }

    public static void invoice(String u) {
        int total = 0;
        String no = noId(invoice, "INV");
        System.out.println("No Invoice\t: " + no);
        System.out.println("Id Barang\tNama\tJumlah\tTotal");
        boolean z = true;
        int b = 0;
        do{
            if (keranjang[b][0] != null) {
                System.out.println(
                keranjang[b][0] + "\t\t" + keranjang[b][1] + "\t" + keranjang[b][3] + "\t" + keranjang[b][4]);
                total = total + Integer.parseInt(keranjang[b][4]);
                z = false;
            }else{
                b++;
            }
        }while(z==true);
        System.out.println("------------------------------");
        System.out.println("Total\t\t\t" + total);
        System.out.println("------------------------------");
        for (int i = 0; i < pembeli.length; i++) {
            if (pembeli[i][0] == null) {
                pembeli[i][0] = u;
                pembeli[i][1] = no;
                break;
            }
        }
        for (int i = 0; i < invoice.length; i++) {
            if (invoice[i][0] == null) {
                invoice[i][0] = no;
                invoice[i][1] = Integer.toString(total);
                break;
            }
        }
        for (int i = 0; i < keranjang.length; i++) {
            for (int j = 0; j < keranjang[i].length; j++) {
                keranjang[i][j] = null;
            }
        }
    }

    public static void daftarProduk() {
        System.out.println("------------------------------");
        System.out.println("\tDaftar Produk");
        System.out.println("------------------------------");
        System.out.println("Id Produk\tNama Produk\tHarga\t\tStok");
        sort(produk, 2, "asc");
        printWhere(produk, 3, "0");
    }

    public static void customer(String user) {
        int pilih = 0;
        do {
            pilih = menucustomer();
            switch (pilih) {
                case 1:
                    daftarProduk();
                    break;
                case 2:
                    judul("Tambah Keranjang");
                    addKeranjan();
                    break;
                case 3:
                    judul("Hapus Keranjang");
                    delKeranjang();
                    break;
                case 4:
                    judul("Ubah Keranjang");
                    ubahKeranjang();
                    break;
                case 5:
                    judul("Lihat Daftar Keranjang");
                    System.out.println("---------------------------------");
                    System.out.println("Id Barang\tNama Barang\tHarga\t\tJumlah\t\tTotal");
                    System.out.println("---------------------------------");
                    // sortString(keranjang, 1, "asc");
                    printArray(keranjang);
                    break;
                case 6:
                    judul("Lihat Invoice");
                    invoice(user);
                    break;
                case 7:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan Tidak Ada");
                    break;
            }
        } while (pilih != 7);
    }

    public static void main(String[] args) {
        boolean c = true;
        users[0][0] = "admin";
        users[0][1] = "admin";
        users[0][2] = "1";
        produk[0][0]="BRG0001";produk[0][1] = "Lipcream";produk[0][2] = "20000";produk[0][3] = "10";
        produk[1][0] = "BRG0002";produk[1][1] = "Mascara";produk[1][2] ="10000";produk[1][3] = "20";

        do {
            System.out.print("Apakah anda punya akun? (y/n) : ");
            String pilih = input.next();
            if (pilih.equals("y")) {
                login(users);
            } else if (pilih.equals("n")) {
                register(users);
            } else {
                System.out.println("Pilihan Tidak Ada");
            }
        } while (c == true);
    }
}
