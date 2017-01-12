/**
 * Created by stripes on 2017. 1. 9..
 */
public class BubbleSort {
    public static void main(String[] args) {

        // arr length = 9
        int[] arr = {5, 1, 3, 6, 9, 7, 10, 2, 14};
        int temp;

        System.out.println("Hello Sorting Study");
        System.out.print("Bubble Sort :");
        for(int num : arr) {
            System.out.print(String.format(" %2d",num));
        }
        System.out.println();
        System.out.println("---------------------------------------------------");

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.print(i + 1 + ")");
            for (int num : arr) {
                System.out.print(String.format(" %2d",num));
            }
            System.out.println();
        }

    }
}
