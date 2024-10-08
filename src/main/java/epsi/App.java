package epsi;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        int result = compute(args);
        System.out.println("The result is : " + result);

        int resultMultiply = computeMultiply(args);
        System.out.println("The result of multiplication is : " + resultMultiply);
    }

    public static int compute( String[] args) {
        return new CalculatorService().add(Arrays.asList(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }

    public static int computeMultiply( String[] args) {
        return new CalculatorService().multiply(Arrays.asList(Integer.valueOf(args[0]), Integer.valueOf(args[1])));
    }
}
