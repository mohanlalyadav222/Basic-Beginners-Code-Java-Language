interface intf{
    void print();
}
class A6 implements intf{
    public void print(){
        System.out.println("Interface ...");
    }
    public static void main(String args[]) {
        intf a=new A6();
        a.print();
        
    }
}