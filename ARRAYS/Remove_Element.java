import java.util.*;


public class Remove_Element {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Remove_Element a = new Remove_Element();
        System.out.print("Enter the Size of the Array : ");
        int n = input.nextInt();
        int arr[] = new int[n];
        
        // TAKING ELEMENT IN THE ARRAY 
        System.out.println("\n|| Enter Elements in the Array || ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("A["+i+"] = ");
            arr[i] = input.nextInt();
        }

        // TRAVERSING THE ARRAY
        System.out.println("\n|| ELEMENTS IN THE ARRAY ||");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("A["+i+"] = "+arr[i]);
        }

        int temp[] = new int[arr.length];
        a.newArray(arr, 2);
        System.out.print("ARRAY = [ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(" ]");
    }

    public int[] newArray(int [] arr, int val){
        int index=0, counter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[counter]==val){
                counter++;
            } else {
                arr[index]=arr[counter];
                index++;
                counter++;
            }
        }
        System.out.println("The Real Elements in the Array : "+index);
        return arr;
    }
}
