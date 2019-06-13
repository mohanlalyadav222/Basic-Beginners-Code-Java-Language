class IfElseNested2{
    public static void main(String args[]){
        int weight=75;
        int age=54;
        if(age>18){
            if(weight>70){
                System.out.println("You are Eligible to donate blood.");
            }else{
                System.out.println("Not Eligible");
            }
        }else{
            System.out.println("Age must be greater than 18.");
        }
    }
}