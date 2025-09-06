package CS2;
public class CommonNumber {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {3, 2, 5, 8, 9};

        System.out.print("Common numbers: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                }
            }
        }
    }
}
