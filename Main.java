import java.util.*;
public class Main{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter  any string :");
    String input=sc.next();

    int len=input.length();

    /*
    String reverse="";

    //int j=0;

    for(int i=len-1;i>=0;i--)
    {
        reverse= reverse + input.charAt(i);
        
    }
    */
    System.out.println(String.reverse(input));

}
}