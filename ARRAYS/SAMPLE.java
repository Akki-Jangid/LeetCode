import java.util.*;

public class SAMPLE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
    
    }
}
