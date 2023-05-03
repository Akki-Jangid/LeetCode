import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Remove_Duplicates_Array {
    public int[] duplicates(int [] arr){
        int l=0, r=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr.length==r){
                break;
            }
            if(arr[i]==arr[r]){
                r++;
            } else {
                l++;
                arr[l] = arr[r];
                r++;
            }
        }
        System.out.println("The Number of Elements in the Array are : "+(l+1));
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Remove_Duplicates_Array a = new Remove_Duplicates_Array();
        int [] arr = new int[5];
        System.out.println("Enter the Elements in the Array.");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr["+i+"] = ");
            arr[i] = input.nextInt();
        }
        
        int temp[] = new int[arr.length];
        temp = a.duplicates(arr);
        System.out.print("Arr[] = [ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+", ");
        }
        System.out.print("]");
        
    }
}
