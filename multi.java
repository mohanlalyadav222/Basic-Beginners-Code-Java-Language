import java.util.*;
public class multi
{
    public static void main(String args[]){
    System.out.println("Enter two number(first no. should be larger)");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    //for(int i=1;i<=10;i++){
        int mult=n*m;
        int add=n+m;
        int divis=n/m;
        int Sub=n-m;
        System.out.println(""+add+" "+divis+" "+Sub);
        /*System.out.println(add);
        System.out.println(divis);
        System.out.println(Sub);*/
    //}
        sc.close();
    }

}