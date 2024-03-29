public class immutable {
    public static void main(String[] args) {
        String s = "hello";
        s.concat("seval");

        System.out.println(s);

        s = s.concat(" zeytin");
        System.out.println(s);

    }
}
