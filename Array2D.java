import java.util.*;

class Array2D {

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 7 }, { 9, 8 }, { 6, 3 } };

        display(arr);

        for (int[] a : arr) {
            Arrays.sort(a); 
        }

        display(arr);

    }
}