public class blood {
    public static void main(String[] args) {
        int age = 12;
        int weight = 68;

        if (age >= 18) {

            if (weight >= 68) {
                System.out.println("you can donate blood");
            }
            else{
                System.out.println("you cant donate blood");
            }
            
        }
        else{
            System.out.println("you are under age");
        }
    }
}
