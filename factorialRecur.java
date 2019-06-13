class factorialRecur{
    static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }

    }
    public static void main(String args[]){
        int f=1,num=5;
        f=fact(num);
        System.out.println("Factorial of "+num+" is "+f);

    }
}