import java.util.*;

public class MergeTwoArray {
    public static void main(String[] args) {
        int arr_1[] = new int[10];
        arr_1[0] = 10; 
        arr_1[1] = 20; 
        arr_1[2] = 30; 
        arr_1[3] = 40; 
        arr_1[4] = 50; 
        int arr_2[] = {6,7,8,9,10};
        int m = 5, n=arr_2.length;
        // int newArr[] = new int[m];

        // MERGING THE ARRAYS
        int k=0;
        for (int i = m; i < arr_1.length; i++) {
            arr_1[i] = arr_2[k];
            k++;
        }

        // TRAVERSING BEFORE SORTING
        System.out.println("BEFORE SORTING.");
        System.out.print("newArray[] = [ ");
        for (int j = 0; j < arr_1.length; j++) {
            System.out.print(arr_1[j]+", ");
        }
        System.out.println(" ]");
        
        // BUBBLE SORT
        for (int i = 0; i < arr_1.length; i++) {
            for (int j = i+1; j < arr_1.length; j++) {
                if(arr_1[i]>arr_1[j]){
                    arr_1[i] = arr_1[i] + arr_1[j];
                    arr_1[j] = arr_1[i] - arr_1[j];
                    arr_1[i] = arr_1[i] - arr_1[j];
                }
            }
        }

        // int i;
        // for (i = 0; i < m; i++) {
        //     newArr[i] = arr_1[i];
        // }
        // for (int j = 0; j < n; j++) {
        //     newArr[i] = arr_2[j];
        //     i++;
        // }

        // TRAVERSING AFTER SORTING
        System.out.println("AFTER SORTING.");
        System.out.print("newArray[] = [ ");
        for (int j = 0; j < arr_1.length; j++) {
            System.out.print(arr_1[j]+", ");
        }
        System.out.println(" ]");
        

    }
}
