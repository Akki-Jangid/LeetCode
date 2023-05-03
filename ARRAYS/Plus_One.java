import java.util.*;

public class Plus_One {
    public static void main(String[] args) {
        
        Plus_One a= new Plus_One();
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

        // a.plus(arr);
        System.out.print("\nAFTER INCREMENT : ");
        // System.out.println(Arrays.toString(a.plus(arr)));
        // System.out.print("ARRAY[] : [ ");
        // for (int i = 0; i < arr.length+1; i++) {
        //     System.out.print(arr[i]+",  ");
        // }
        // System.out.print("]");
        System.out.println(a.plus(arr));
    }

    public int[] plus(int A[]){
        int n = A.length;
        for (int i = n-1; i >= 0; i--) {
            if(A[i]<9){
                A[i]++;
                return A;
            }
            A[i]=0;
        }
        int [] newNumber = new int[n+1];
        newNumber[0] = 1;
        int k = 0;
        for (int i = 1; i < newNumber.length; i++) {
            newNumber[i] = A[k];
            k++;
        }
        // for (int i = 0; i < newNumber.length; i++) {
        //     System.out.print(newNumber[i]+"   ");
        // }
        return newNumber;
    }
}

