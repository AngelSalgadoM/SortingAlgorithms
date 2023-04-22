import java.util.Arrays;

public class BubbleSort {

    public static void swap(int[] Arr, int pos1, int pos2 ){
        int temp = Arr[pos1];
        Arr[pos1] = Arr[pos2];
        Arr[pos2] = temp;
    }

    public static void bubbleSort(int[] A){

        int n = A.length;
        for( int i = 0; i < n; i++){
            System.out.println("Iteration no. " + Integer.toString(i+1));

            for (int j = (i+1); j < n; j++){

                if ( A[i] > A[j] ) { swap(A, i, j); }

                System.out.println(Arrays.toString(A));

            }

        }

    }

}
