public class ClassLoaderr{
    public static void main(String a[]){
        Class c =ClassLoaderr.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }
}