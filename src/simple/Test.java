package simple;

public class Test {
    private static double i = 1, j = 4;

    public static void main(String[] args) {
       /* Operation operations = new Operation() {
            @Override
            public double getResult(double d1, double d2) {
                return Double.sum(d1, d2);
            }
        };
        System.out.println(operations.getResult(2.0, 2.0));
        // ==
        Operation lambda = Double::sum;
        System.out.println(lambda.getResult(3.0, 3.0));*/

        //--------------------------------------------------------------

        Printer printer = string -> System.out.println(string);
        printer.print("Hi!");
        // ==
        Printer printer2 = System.out::println;
        printer2.print("Hi!");

        //--------------------------------------------------------------

        Factorial factorial = i -> {
            int result = 1;
            for (int j = 1; j <= i; j++) {
                result *= j;
            }
            return result;
        };

        System.out.println(factorial.getResult(5));

        //--------------------------------------------------------------
//        double i = 1, j = 4;

        Operation operation1 = () -> {
            //We cannot change i in the lambda if its declare at method, only global parameters
            i = 6;
            return i + j;
        };
        System.out.println(operation1.getResult());
    }
}
