import java.io.CharArrayReader;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
       Palindrome a = new Palindrome(); 
       System.out.println(a.check(1231));
        
    }    

    public boolean check(int x){
        String num = Integer.toString(x);
        int len = num.length()-1;
        int i=0;
        while(i<num.length()/2){
            if(num.charAt(i)==num.charAt(len)){
                i++;
                len--;
            } else {
                return false;
            }
        }
        return true;
    }
}
