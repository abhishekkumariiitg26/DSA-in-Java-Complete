public class throws_keyword {

    static int getNumberFromArray(int a[]) throws ArrayIndexOutOfBoundsException{
        return a[8];
    }
    public static void main(String[] args) {
        int a[]=new int[5];
        try{

            getNumberFromArray(a);
        }
        catch(Exception e){
            System.out.println("catched the exception "+e.getMessage());
        }
    }
}
