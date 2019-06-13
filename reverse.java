import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String rev="";
        String input=sc.next();
        int len=input.length();
        for(int i=len-1;i>=0;i--){
        
            rev= rev + input.charAt(i);
            
        }
        System.out.println(rev);
    sc.close();
    }
}
