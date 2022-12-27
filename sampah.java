import java.lang.reflect.Array;
import java.util.Arrays;

public class sampah {
    public static void sort(String arr[]) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_index = i;
            String minStr = arr[i];
            for (int j = i + 1; j < n; j++) {

                if (arr[j].toLowerCase().compareTo(minStr) < 0) {
                    // Make arr[j] as minStr and update min_idx
                    minStr = arr[j];
                    min_index = j;
                }
            }

            // Swapping the minimum element
            // found with the first element.
            if (min_index != i) {
                String temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void sorts(String str[]) {
        String temp;
        for (int j = 0; j < str.length; j++) {
            for (int i = j + 1; i < str.length; i++) {
                // comparing adjacent strings
                if (str[i].toLowerCase().compareTo(str[j]) < 0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
            System.out.println(str[j]);
        }
    }
    public static void name(String array[][],int u) {
          int flag = 0;
        String temp[] = new String[array.length];
       
            for (int i = 0; i < array.length; i++) {
                flag = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j][u].compareTo(array[flag][u]) > 0)
                        flag = j;
                }
                if (flag <= 1) {
                    for (int j = 0; j < temp.length; j++)
                        temp[j] = array[i][j];
                    for (int j = 0; j < temp.length; j++)
                        array[i][j] = array[flag][j];
                    for (int j = 0; j < temp.length; j++)
                        array[flag][j] = temp[j];
                }
            }
        
    }
    public static void main(String args[]) {
        // // defining an array of type String
        String[][] array = { { "5000", "Barang", "sad" }, { "10000", "Sas", "asd" }, { "20", "naas", "asdasd" } };
        int n = 50, a = 2;
        String[] countries = { "5000", "10000", "20" };
        sort(countries);
        System.out.println(Arrays.toString(countries));
        sorts(countries);
        System.out.println(Arrays.toString(countries));
        String myStr1 = "";
        String myStr2 = "9";
        System.out.println(myStr1.compareTo(myStr2));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("hahhhahah");
        name(array, 0);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println("INV"+String.format("%04d", a));
        // String [] y= {"Barang","bagas",""};
        // y[2] = "INV"+String.format("%04d", a);
        // for (int i = 0; i < y.length; i++) {
        // if (y[i].equals("INV"+String.format("%04d", i))) {
        // System.out.println("Benar");
        // }else{
        // System.out.println("Salah");
        // }
        // }
        // int size = countries.length;
        // // logic for sorting
        // for (int i = 0; i < size - 1; i++) {
        // for (int j = i + 1; j < countries.length; j++) {
        // // compares each elements of the array to all the remaining elements
        // if (Integer.parseInt(countries[i]) > Integer.parseInt(countries[j])) {
        // // swapping array elements
        // String temp = countries[i];
        // countries[i] = countries[j];
        // countries[j] = temp;
        // }
        // }
        // }
        // // prints the sorted array in ascending order
        // for (int i = 0; i < countries.length; i++) {
        // System.out.println(countries[i]);

        // }
        // int flag;
        // String temp[] = new String[3];
        // for (int i = 0; i < array.length; i++) {
        // flag = i;
        // for (int j = i + 1; j < array.length; j++) {
        // if (Integer.parseInt(array[j][0]) > Integer.parseInt(array[flag][0]))
        // flag = j;
        // }
        // if (flag != 1) {
        // for (int j = 0; j < temp.length; j++)
        // temp[j] = array[i][j];
        // for (int j = 0; j < temp.length; j++)
        // array[i][j] = array[flag][j];
        // for (int j = 0; j < temp.length; j++)
        // array[flag][j] = temp[j];
        // }
        // }

        // System.out.println(Arrays.deepToString(array));
        // array[1][0] = null;
        // for (int i = 0; i < array.length; i++) {
        // for (int j = 0; j < array.length; j++) {
        // if (array[i][0] != null) {
        // System.out.print(array[i][j]+" ");
        // }
        // }
        // }

    }
}