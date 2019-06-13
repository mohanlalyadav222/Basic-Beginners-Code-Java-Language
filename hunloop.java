/*

public class hunloop{
    void func(int n){
            if(n<101)
            {
        
            System.out.println(n);
            func(n+1);}
        }

    public static void main(String args[]){
    hunloop hl=new hunloop();
    int n=1;
    hl.func(n);
    }
}
*/

public class hunloop{
    int count(int n)
    {
        if(n==100)
        {
            return 100;
        }
        else
        {
            System.out.println(n);
            return count(n+1);
        }
    }
    public static void main(String args[])
    {
        hunloop hl=new hunloop();
        int x=hl.count(1);
        System.out.println(x);
    }
}

