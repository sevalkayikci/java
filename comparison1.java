public class comparison1 {
    public static void main(String[] args) {
        String s1="Seval";  
        String s2="Seval";  
        String s3=new String("SEVAL");  
        String s4="seval";  
        
        System.out.println(s1.equals(s2));  
        System.out.println(s1.equals(s3));  
        System.out.println(s1.equals(s4));

        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
