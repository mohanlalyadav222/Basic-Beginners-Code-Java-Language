import java.util.Scanner;
class factorialRecurWithOutStatic{
    int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }

    }
    public static void main(String args[]){
       factorialRecur fR=new factorialRecur();
       System.out.println("Enter number:");
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int f=fR.fact(num);
        System.out.println("Factorial of "+num+" is "+f);

    }
}