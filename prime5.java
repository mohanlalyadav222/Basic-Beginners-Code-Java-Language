class prime5{
    public static void main(String[] args) {
        int n=67,i,count=0;
        for(i=1;i<=n;i++){
            if(n%i==0)
            count++;
        }
        if(count==2)
        System.out.println("Prime");
        else System.out.println("Not prime");
    }
}