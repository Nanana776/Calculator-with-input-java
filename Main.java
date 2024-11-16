import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first value:");
        double val1=input.nextDouble();
        System.out.println("Enter second value:");
        double val2=input.nextDouble();
        input.nextLine();
        System.out.println("Enter operation (+, -, *, /, ^, sqrt):");
        String val3=input.nextLine();
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