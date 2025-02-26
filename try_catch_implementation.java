public class try_catch_implementation {
    public static void main(String[] args) {
        int a[]=new int[10];
        System.out.println("beginning of code before array_oob_exp");
        //System.out.println(a[10]); // this line abnormally disrupt the flow of code and next line not printed.

        //now using try catch method
        try{

            int b=5/0; // this is a type of arithmetic exception
            System.out.println(b);
            System.out.println(a[100]);

          //  int b=5/0; //actually this line is not executed as the code go from the upper line to the catch block automatically
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("trying to print out of bound values of the array");
        }
        catch(RuntimeException e){
            System.out.println("runtime exception caught");
        }
        // catch(ArithmeticException | RuntimeException e){
        //     System.out.println("arithmetic exception occured  "+e);
        // }

        System.out.println("ending of code after array_oob_exp");
    }
}
