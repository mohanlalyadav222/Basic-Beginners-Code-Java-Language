import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        System.out.println("Enter a numner:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp,r,sum=0;
        temp=num;
        while(num>0){
            r=num%10;
            sum=sum*10+r;
            num=num/10;
        }
        if(temp==sum){
            System.out.println(temp+" is Palindrome");
        }else{
            System.out.println(temp+" is not Palindrome");
        }
    }

}