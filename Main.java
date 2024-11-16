import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter operation (+, -, *, /, ^, sqrt):");
        String val3=input.nextLine();
        double val1=0, val2=0;
        if (val3=="sqrt"){
            System.out.println("Enter value:");
         val1=input.nextDouble();
        }
        else{
            System.out.println("Enter first value:");
         val1=input.nextDouble();

        System.out.println("Enter second value:");
         val2=input.nextDouble();
        }
        
        
    input.close();

    Calculator calculator = new Calculator();

    try { 
        double result=calculator.calculate(val1, val2, val3);
        System.out.println(result);
    }catch (ArithmeticException | IllegalArgumentException e){
        System.out.println(e.getMessage());

    }

    }
}