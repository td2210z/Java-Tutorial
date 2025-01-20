package thangdinh.love2code.Array;

import java.util.Arrays;

public class SortArrray {

    public static void main(String[] args) {
        int[][] array = {
                {4, 2, 7},
                {9, 5, 1},
                {6, 3, 8}
        };

        // Chuyển mảng 2 chiều thành mảng 1 chiều
        int rows = array.length;
        int cols = array[0].length;
        int[] flatArray = new int[rows * cols];

        int index = 0;
        for (int[] row : array) {
            for (int element : row) {
                flatArray[index++] = element;
            }
        }

        // Sắp xếp mảng 1 chiều
        Arrays.sort(flatArray);

        // Chuyển ngược lại thành mảng 2 chiều
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = flatArray[index++];
            }
        }

        // In mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp toàn bộ phần tử:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
