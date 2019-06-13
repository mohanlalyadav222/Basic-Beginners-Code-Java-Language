import java.util.Scanner;
class reverseAll{
    public static void main(String args[]){
        System.out.println("Enter string/number to be reversed:");
        String original,reverse="";
        Scanner sc=new Scanner(System.in);
        original=sc.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--){
        reverse=reverse+original.charAt(i);
        }
        System.out.println("Reversed:"+reverse);
    }
}