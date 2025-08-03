public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 40, 30, 35};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum number is: " + min);
    }
}