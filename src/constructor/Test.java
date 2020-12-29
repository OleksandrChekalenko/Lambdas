package constructor;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hi");

        Consumer<String> custom = Test::print;
        custom.accept("custom");

        Database db = User::new;
        User user = db.create("Peta", 23);
        System.out.println(user);
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
