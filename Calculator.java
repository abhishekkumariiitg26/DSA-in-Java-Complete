class calc{
   
    public int add(int num1,int num2){
        
        return (num1+num2);
    }
}


public class Calculator {
    public static void main(String[] args){
        int num1=8;
        int num2=6;
        calc myCalc=new calc();
        int result = myCalc.add(num1,num2);
        System.out.println(result);
    }
    
}
