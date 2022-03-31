import java.util.*;

enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(final Operation operation, final int num1, final int num2){
        double result = 0;

        switch(operation) {
            case ADD:
                // if operation = ADD, return the sum
                result = num1 + num2;
                break;
            case SUBTRACT:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                if (num2 == 0) {
                    System.out.println("Can't divide by 0");
                } else {
                    result = ((double)num1) / num2;
                }
                break;
        }
        return result;
    }

    public static void main(final String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}
