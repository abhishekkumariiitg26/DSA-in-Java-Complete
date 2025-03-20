import java.util.Scanner;

public class custom_exception {
    public static void main(String[] args) throws MyException {
        int age;
        System.out.println("enter the age: ");
        Scanner sc=new Scanner(System.in);
        try{

            age=sc.nextInt();
            if (age>100) {
                // throw new MyException("My error is this");
                throw new ArithmeticException("more than 100 not allowed");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class MyException extends Exception{
    public MyException (String message){
        super(message);
    }

}
