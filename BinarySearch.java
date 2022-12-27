import java.util.Scanner;

public class BinarySearch {
   
    public static void sort(int arr[]){
        int n =arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         printArray(arr);   
    }
    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(i!=n-1){
                System.out.println(arr[i]+" ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
    public static int binary(int arr[], int x){
        int left=0,right=arr.length-1;
        while (left <= right){
            int mid=left+(right-left)/2;
            if(arr[mid]==x){
                return mid;
            }else if (arr[mid]<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void search(int arr[], int x){
        int result=binary(arr,x);
        if(result==-1){
            System.out.println("Data "+x+" tidak ditemukan");
        }else{
            System.out.println("Data "+x+" ditemukan pada elemen ke-" + (result+1));
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int arr[]={128,4,8,64,32,2};
        System.out.println("Data yang sudah diurutkan: ");
        sort(arr);
        System.out.println("\n\nBinary Search");
        System.out.println("Masukkan angka yang ingin dicari: ");
        int x=s.nextInt();
        search(arr,x);
    }
    
}

