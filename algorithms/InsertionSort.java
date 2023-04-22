import java.util.Arrays;
public class InsertionSort {

    public static void swap(int[] Arr, int pos1, int pos2 ){
        int temp = Arr[pos1];
        Arr[pos1] = Arr[pos2];
        Arr[pos2] = temp;
    }

    public static void insertionSort(int[] A) {

        int n = A.length;

        for (int i = 1; i < n; i++) {

            int j = i;

            while ( j > 0  && A[j-1] > A[j] ) {

                int pos1 = j-1;
                int pos2 = j;

                swap(A, pos1, pos2 );
                j = j-1;

                System.out.println(Arrays.toString(A));

            }
        }

        System.out.println(Arrays.toString(A));

    }
}