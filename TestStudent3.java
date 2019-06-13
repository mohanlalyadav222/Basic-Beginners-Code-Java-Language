//Initialization through reference
class Student{
int id;
String name;
}
class TestStudent3{
    public static void main(String a[]) {
        Student t= new Student();
        Student tt= new Student();

        t.id=9;
        t.name="Mohan";
        tt.id=19;
        tt.name="Rohan";
        System.out.println(t.id+" "+t.name);
        System.out.println(tt.id+" "+tt.name);

    }
}