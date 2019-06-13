interface MultIntf{
    void print();
}
interface MultIntf1{
    void print1();
}
class A7 implements MultIntf,MultIntf1{
    public void print(){
        System.out.println("print...");
    }
    public void print1(){
        System.out.println("print1...");
    }
    public static void main(String args[]) {
        A7 a=new A7();
        a.print();
        a.print1();
        
    }
}