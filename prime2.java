import java.util.Scanner;
class prime2{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int i;
        for(i=2;i<num;i++){
            if(num%i==0)
                break;}
        if(i==num)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not Prime");
    }
}


