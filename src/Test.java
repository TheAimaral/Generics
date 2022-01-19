public class Test {
    public static void main(String[] args) {
        Box<String, String> sample1 = new Box<>("Runtime", "Respect");
        System.out.println(sample1);
        Box<Integer, Integer> sample2 = new Box<>(1, 5);
        System.out.println(sample2);
        Box<Boolean, Boolean> sample3 = new Box<>(Boolean.TRUE, Boolean.FALSE);
        System.out.println(sample3);
    }
}