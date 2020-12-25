package simple;

public class Test {
    public static void main(String[] args) {
        Operations operations = new Operations() {
            @Override
            public double getResult(double d1, double d2) {
                return Double.sum(d1, d2);
            }
        };

        System.out.println(operations.getResult(2.0, 2.0));

        Operations lambda = Double::sum;
        System.out.println(lambda.getResult(3.0, 3.0));
    }
}
