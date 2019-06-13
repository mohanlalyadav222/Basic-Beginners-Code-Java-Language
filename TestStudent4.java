//Initialization through method
class Student{
    int id;
    String name;
    void insert(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
class TestStudent4{
    public static void main(String a[]) {
    Student s1=new Student();
    Student s2=new Student();

    s1.insert(8,"Alex");
    s2.insert(18,"Flex");
    s1.display();
    s2.display();
        
    }
}