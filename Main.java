import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first value");
        double val1=input.nextDouble();
        System.out.println("Enter second value");
        double val2=input.nextDouble();
        System.out.println("Enter operation");
        String val3=input.nextLine();
    input.close();

    Calculator calculator = new Calculator();


    }
}