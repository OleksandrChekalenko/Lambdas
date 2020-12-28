package generic;

public class Test {
    public static void main(String[] args) {
        Operation<Integer> add = ((v1, v2) -> v1 + v2);
        System.out.println(add.getResult(2, 2));

        Operation<String> concat = (v1, v2) -> v1 + v2;
        System.out.println(concat.getResult("2", "2"));
    }
}
