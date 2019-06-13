//Let us see another example of default constructor  
//which displays the default values  
class ConstA{
        int id;
        String Student;
        void display(){
            System.out.println(id+" "+Student);
        }
    
    public static void main(String args[]){
        ConstA C1=new ConstA();
        ConstA C2=new ConstA();
        C1.display();
        C2.display();

    }
}