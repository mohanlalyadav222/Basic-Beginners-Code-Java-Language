import java.util.Scanner;
class PalindromeAll{
    public static void main(String args[]){
        String original,reverse="";
        System.out.println("Enter string/number:");
        Scanner sc=new Scanner(System.in);
        original=sc.next();
        int length=original.length();
        for(int i=length-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println(original+" is Palindrome");
        }else{
            System.out.println(original+" is not Palindrome");
        }
        sc.close();
    }
}