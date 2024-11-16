public class Calculator{
    public void calculate(double val1, double val2, String val3) throws ArithmeticException{
      
       switch(val3){
        case '+':
          double res = val1 + val2;
        break;
        case '-': 
         res = val1 - val2;
           break;
        case '*':
         res = val1 * val2;
        break;
        case '/':
         res = val1 / val2;
        break;
        case '^':
         res = Math.pow(val1,val2);
            break;
        break;
        case 'sqrt':
        if()
            res=Math.sqrt()


       }
    }
}