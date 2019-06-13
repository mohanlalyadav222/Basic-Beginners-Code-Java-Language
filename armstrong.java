import java.util.Scanner;
class armstrong{
    public static void main(String args[]){
        int a,c=0,temp,num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter desired number:");
        num=sc.nextInt();
        temp=num;
        while(num>0){
            a=num%10;
            num=num/10;
            c=c+(a*a*a);
        }
        if(temp==c){
            System.out.println(temp+" is a armstrong number.");
        }else{
            System.out.println(temp+" is NOT a armstrong number.");
        }
    }
        
}