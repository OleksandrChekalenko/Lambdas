package generic;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        Operation<Integer> add = ((v1, v2) -> v1 + v2);
        System.out.println(add.getResult(2, 2));
        //the same, Java common
        Operation<Integer> add2 = (Integer::sum);
        System.out.println(add2.getResult(2, 2));

        Operation<String> concat = (v1, v2) -> v1 + v2;
        System.out.println(concat.getResult("2", "2"));

        /**Java 1.8 common functional interfaces*/

        Predicate<Integer> isZero = integer -> integer == 0;
        System.out.println(isZero.test(13));
        System.out.println(isZero.test(0));

        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hi");
        //the same
        Consumer<String> print1 = System.out::println;
        print1.accept("Hi");

        Function<Integer, Double> conventer = integer -> Double.valueOf(integer);
        System.out.println(conventer.apply(1));
        //the same
        Function<Integer, Double> conventer1 = Double::valueOf;
        System.out.println(conventer1.apply(1));

        Supplier<String> text = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text: ");
            return scanner.nextLine();
        };
        System.out.println(text.get());

        UnaryOperator<Double> sqrt = d -> Math.sqrt(d);
        System.out.println(sqrt.apply(4.0));
        //the same
        UnaryOperator<Double> sqrt1 = Math::sqrt;
        System.out.println(sqrt1.apply(4.0));

        BinaryOperator<Double> pow = (d1, d2) -> Math.pow(d1, d2);
        System.out.println(pow.apply(2.0,5.0));
        //the same
        BinaryOperator<Double> pow1 = Math::pow;
        System.out.println(pow1.apply(2.0,5.0));

    }
}
