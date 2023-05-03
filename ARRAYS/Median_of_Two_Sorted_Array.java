import java.util.*;

class Median_of_Two_Sorted_Array{
    public static void main(String[] args) {
        int arr_1[] = new int[5];
        arr_1[0] = 10; 
        arr_1[1] = 20; 
        arr_1[2] = 30; 
        arr_1[3] = 40; 
        arr_1[4] = 51; 
        int arr_2[] = {6,7,8,9,10};
        int m = 5, n=arr_2.length;
        int newArr[] = new int[m+n];

        // MERGING THE ARRAYS
        int k=0;
        for(int i=0; i<newArr.length; i++){
            if(i<m){
                newArr[i] = arr_1[i];
            } else {
                newArr[i] = arr_2[k];
                k++;
            }
        }
            // newArr[i] = arr_2[k];
            // k++;

          // TRAVERSING BEFORE SORTING
          System.out.println("BEFORE SORTING.");
          for (int j = 0; j < newArr.length; j++) {
              System.out.println("newArray["+j+"] = "+newArr[j]);
          }
  
          // BUBBLE SORT
          for (int i = 0; i < newArr.length; i++) {
              for (int j = i+1; j < newArr.length; j++) {
                  if(newArr[i]>newArr[j]){
                    newArr[i] = newArr[i] + newArr[j];
                    newArr[j] = newArr[i] - newArr[j];
                    newArr[i] = newArr[i] - newArr[j];
                  }
              }
          }

          // TRAVERSING AFTER SORTING
        System.out.println("AFTER SORTING.");
        for (int j = 0; j < newArr.length; j++) {
            System.out.println("newArray["+j+"] = "+newArr[j]);
        }

        // float median;
        // if(newArr.length%2==0){
        double median = (double)(newArr[0]+newArr[newArr.length-1])/2;
        // } 
        // else {
        //     double median = (newArr[0]+newArr[newArr.length-1])/2;
        // }
        System.out.println("\nThe Median of the MERGED Array is : "+median);
    }
}