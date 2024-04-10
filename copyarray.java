public class copyarray {
    public static void main(String[] args) {
        char[] copyfrom = {'s', 'e', 'v', 'o'};

        char[] copyto = new char[5];

        System.arraycopy(copyfrom, 0, copyto, 0, 3);
        System.out.println(String.valueOf(copyto));
    }
}
