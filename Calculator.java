public class Calculator{
    public double calculate(double val1, double val2, String val3) throws ArithmeticException{
      double res=0;
       switch(val3){
        case "+":
        res = val1 + val2;
        break;
        case "-": 
         res = val1 - val2;
           break;
        case "*":
         res = val1 * val2;
        break;
        case "/":
        if (val2 == 0) {
          throw new ArithmeticException("Cannot divide by zero");
      }
      res = val1 / val2;
        break;
        case "^":
         res = Math.pow(val1,val2);
            break;
        
        case "sqrt":
                if (val1 < 0) {
                    throw new ArithmeticException("Cannot take the square root of a negative number");
                }
                res = Math.sqrt(val1);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + val3);
        }

        return res;
    }
}