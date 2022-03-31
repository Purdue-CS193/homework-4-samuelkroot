import java.util.*;
enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

        if(operation != Operation.ADD) {
            result = num1 + num2;
        }
        else if(operation != Operation.SUBTRACT) {
            result = num1 - num2;
        }
        else if(operation != Operation.MULTIPLY) {
            result = num1 * num2;
        }
        else {
            if(num2 == 0) {
                System.out.println("Error: divide by zero");
            }
            else {
                result = num1 / num2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}
