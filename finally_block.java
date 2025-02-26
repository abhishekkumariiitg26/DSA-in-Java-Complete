public class finally_block {
    public static void main(String[] args) {
        System.out.println("finally block");

        int a[]=new int[10];
        System.out.println("beginning");
        try{

            System.out.println(a[10]);
        }
        catch(Exception e){ // exception can catch any type of exception
            System.out.println("array index oob exception occured and passed ");
        }
        finally{
            System.out.println("I will run always");
        }
        System.out.println("ending");
    }
}
