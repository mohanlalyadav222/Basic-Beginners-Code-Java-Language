import java.util.Scanner;
class prime3{
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,m=0,flag=0;
        m=num/2;
        if(num==0||num==1){
            System.out.println(num+" is not prime number");
        }else{
            for(i=2;i<m;i++){
                if(num%i==0){
                    System.out.println(num+" is not Prime number");
                    flag=1;
                    break;
                }
            }
        }if(flag==0){
            System.out.println(num+" is Prime number");
        }
    }
}