public class array {
    public static void main(String[] args) {
        int a[] = {10, 30, 90, 80};
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        //for each loop
        for(int j:arr){
            System.out.println(j);
        }
    }
}
