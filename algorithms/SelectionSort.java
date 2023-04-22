import java.util.Arrays;
public class SelectionSort {

    public static void swap(int[] Arr, int pos1, int pos2 ){
        int temp = Arr[pos1];
        Arr[pos1] = Arr[pos2];
        Arr[pos2] = temp;
    }

    public static void selectionSort( int[] A) {

        int n = A.length;

        for (int j = 0; j < n - 1; j++) {

            int iMin = j;
            for (int i = j + 1; i < n; i++) {

                if (A[i] < A[iMin]) { iMin = i; }

            }
            if (iMin != j) {

                swap(A, j, iMin);
                System.out.println(Arrays.toString(A));

            }
        }

        System.out.println(Arrays.toString(A));
    }
}
