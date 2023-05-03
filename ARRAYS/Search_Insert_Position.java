import java.util.*;

import javax.swing.plaf.synth.SynthScrollPaneUI;

class Search_Insert_Position{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Search_Insert_Position a = new Search_Insert_Position();
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

        // SORTING THE ARRAY
        System.out.println("\n|| AFTER SORTING ARRAY ||");
        a.sort_Array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("A["+i+"] = "+arr[i]);
        }

        // SEARCHING ELEMENT IN ARRAY
        int item;
        System.out.println("Enter the Element to be Searched : ");
        item = input.nextInt();
        a.search(arr, item);

    }

    public int[] sort_Array(int A[]){
        for (int i = 0; i < A.length; i++) {
            for(int j=i+1; j<A.length; j++){
                if(A[i]>A[j]){
                    A[i] = A[i] + A[j];
                    A[j] = A[i] - A[j];
                    A[i] = A[i] - A[j];
                }
            }
        }
        return A;
    }

    public void search(int A[], int target){
        int lb = 0, ub = (A.length-1), mid=(lb+ub)/2;
        while(lb<=ub){
            mid = (lb+ub)/2;
            if(A[mid]==target){
                System.out.println(target+" is Found at "+mid+" index.");
                break;
            } else if(A[mid]>target){
                ub = mid-1;
            } else {
                lb = mid+1;
            }
        } 
        if(A[mid]!=target){
            // System.out.println(target+" is not Found in this Array.");
            int i=0, j=0;
                while(A[i]<target){
                    i++;
                    if(i == A.length){
                        System.out.println(target+" Element could be inserted at "+A.length+" index.");
                        break;
                    } 
                }
            System.out.println(target+" Element could be inserted at "+i+" index.");
            }
        }
    }