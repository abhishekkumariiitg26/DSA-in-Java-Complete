public class try_catch_implementation {
    public static void main(String[] args) {
        int a[]=new int[10];
        System.out.println("beginning of code before array_oob_exp");
        //System.out.println(a[10]); // this line abnormally disrupt the flow of code and next line not printed.

        //now using try catch method
        try{
            System.out.println(a[100]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("trying to print out of bound values of the array");
        }

        System.out.println("ending of code after array_oob_exp");
    }
}
