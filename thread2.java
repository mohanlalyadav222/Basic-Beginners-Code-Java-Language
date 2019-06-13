class thread2 implements Runnable{
    public void run(){
        System.out.println("Thread is running.:..");
    }
    public static void main(String args[]){
    thread2 t2=new thread2();
    Thread t=new Thread(t2);
    t.start();
    //t.start();        
    }
}