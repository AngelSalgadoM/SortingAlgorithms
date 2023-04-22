import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] A = { 2, 8, 5, 3, 9, 4, 8, 15 };

        int option = 3;

        System.out.println("Unsorted Array = " + Arrays.toString(A) + "\n");


        switch (option){

            case 1:         // INSERTION SORT
                int[] B = A;
                InsertionSort.insertionSort(B);
                System.out.println("Sorted Array (Insertion Sort) = " + Arrays.toString(B) + "\n" );
                break;

            case 2:         // SELECTION SORT
                int[] C = A;
                SelectionSort.selectionSort(C);
                System.out.println("Sorted Array (Selection Sort) = " + Arrays.toString(C) + "\n" );
                break;
                
            case 3:         // BUBBLE SORT
                int[] D = A;
                BubbleSort.bubbleSort(D);
                System.out.println("Sorted Array (BubbleSort) = " + Arrays.toString(D) + "\n" );
                break;

            case 4:         // MERGE SORT
                int[] E = A;
                MergeSort.mergeSort(E);
                System.out.println("Sorted Array (Merge Sort) = " + Arrays.toString(E) + "\n" );
                break;

            case 5:         // QUICKSORT
                int[] F = A;
                System.out.println("Sorted Array (Quick Sort) = " + Arrays.toString(F) + "\n" );
                break;        
        }

    }
}