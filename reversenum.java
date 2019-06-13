import java.util.*;
public class reversenum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rev=0,x=0;

        int input=sc.nextInt();
        while(input!=0){
            x=input%10;
            rev=rev*10+x;
            input=input/10;
        }
        System.out.println(rev);
    sc.close();
    }
}
