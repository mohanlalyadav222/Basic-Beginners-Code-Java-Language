import java.util.Scanner;
class reverseNumb{
    public static void main(String[] args) {
        System.out.println("Enter num to be reversed:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp,r,rev=0;
        temp=num;
        while(num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println("Reversed num:"+rev);
    }
}