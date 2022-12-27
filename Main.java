import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int data[] = {13,16,14,21,76,15};
        int cari,penghitung=0;
        boolean ketemu= false;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Data Yang Ingin Dicari= ");
        cari = s.nextInt();
        for (int i = 0; i < 6; i++) {
            penghitung ++;
            if(data[i] ==cari){
                ketemu = true;
                break;
            }
        }

        if(ketemu ==true){
            System.out.println("Data "+cari+" berada pada elemen ke- "+penghitung);
        }else{
        System.out.println("Maaf data "+cari+" tidak ditemukan");
        }

    }
}