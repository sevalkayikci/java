public class multidimensionalarray {
    public static void main(String[] args) {
        int arr[][] = {{1, 1, 1}, {2, 4, 6}, {3, 5, 7}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
