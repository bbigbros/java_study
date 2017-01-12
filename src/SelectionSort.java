/**
 * Created by stripes on 2017. 1. 9..
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 3, 10 , 2, 7, 14, 9};
        int temp;
        int idx;
        System.out.println("Hello Sorting Study");
        System.out.print("Selection Sort :");
        for(int num : arr) {
            System.out.print(String.format(" %02d",num));
        }
        System.out.println();
        System.out.println("---------------------------------------------------");

        for(int i = 0; i < arr.length-1; i++) {
            idx = i;
            System.out.println();

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }

            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;

            System.out.print(i + 1 + ")");
            for (int num : arr) {
                System.out.print(String.format(" %2d",num));
            }
        }

    }
}
