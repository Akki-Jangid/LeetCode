import java.util.*;


class Two_Sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Two_Sum sum = new Two_Sum();
        int arr[] = new int[2], target;
        System.out.println("Enter Elements in the Array.");
        for (int i=0; i<arr.length; i++) {
            System.out.print("Arr["+i+"] = ");
            arr[i] = input.nextInt();
        }
        target = 10;
        int result[] = sum.two_Sum(arr, target);
        for (int i=0; i<result.length; i++) {
            System.out.print(result[i]+"    ");
        }

    }

    public int[] two_Sum(int[] arr, int target){
        int [] arr_Indices= new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    arr_Indices[0]=i;
                    arr_Indices[1]=j;
                    break;
                }
            }
        }    
        System.out.println(arr_Indices[0]+"     "+arr_Indices[1]);
        return arr_Indices;
    }
}