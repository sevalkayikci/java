public class buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");

        sb.append(" seval");
        System.out.println(sb);

        sb.insert(1,"zeytin");
        System.out.println(sb);

        sb.replace(1,3,"world");  
        System.out.println(sb);

        sb.reverse();  
        System.out.println(sb);

    }
    
}
