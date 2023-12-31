import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZeroingOutMatrix {

    /*
     * Our startup is building a data analytics dashboard that relies on a matrix to display data.
     * Unfortunately, some of the data points are missing or have been corrupted and are represented by a 0 in
     * the matrix. This creates a lot of confusion for our users and can lead to incorrect analysis. We need your
     * help to implement a function that sets the entire row and column to 0's if a data point is missing or corrupted.
     * Bonus: Do not use any extra memory
     *
     * Example 1:
     *
     *   matrix = {{0, 2, 3}, {4, 5, 6}, {7, 8, 9}};
     *   Output = {{0, 0, 0}, {4, 5, 0}, {0, 0, 0}}
     *
     * Example 2:
     *   int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
     *   Output = {{1, 0, 3}, {0, 0, 0}, {7, 0, 9}}
     *
     * */
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        setZeroes(matrix);
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println();
        int[][] matrix2 = {{0, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        setZeroes(matrix2);
        for (int[] ints : matrix2) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println();
        int[][] matrix3 = {{1, 0, 3}, {0, 5, 0}, {7, 0, 9}};
        setZeroes(matrix3);
        for (int[] ints : matrix3) {
            System.out.println(Arrays.toString(ints));
        }



    }

    public static void setZeroes(int[][] matrix) {

        Map<Integer, Integer>zerosTracker = new HashMap<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 0) {
                    zerosTracker.put(row,col);
                }
            }
        }

        for(Integer row : zerosTracker.keySet()){
            int col = zerosTracker.get(row);
            if(col < 1){
                if(row < 1){
                    matrix[row + 1][col] = 0;
                    matrix[row + 2][col] = 0;
                    matrix[row][col + 1] = 0;
                    matrix[row][col + 2] = 0;
                }else if(row > 1){
                    matrix[row - 1][col] = 0;
                    matrix[row - 2][col] = 0;
                    matrix[row][col + 1] = 0;
                    matrix[row][col + 2] = 0;
                }else{
                    matrix[row - 1][col] = 0;
                    matrix[row + 1][col] = 0;
                    matrix[row][col + 1] = 0;
                    matrix[row][col + 2] = 0;
                }
            }else if(col > 1){
                if(row < 1){
                    matrix[row + 1][col] = 0;
                    matrix[row + 2][col] = 0;
                    matrix[row][col - 1] = 0;
                    matrix[row][col - 2] = 0;
                }else if(row > 1){
                    matrix[row - 1][col] = 0;
                    matrix[row - 2][col] = 0;
                    matrix[row][col - 1] = 0;
                    matrix[row][col - 2] = 0;
                }else{
                    matrix[row + 1][col] = 0;
                    matrix[row - 1][col] = 0;
                    matrix[row][col - 1] = 0;
                    matrix[row][col - 2] = 0;
                }
            }else{
                if(row < 1){
                    matrix[row + 1][col] = 0;
                    matrix[row + 2][col] = 0;
                    matrix[row][col - 1] = 0;
                    matrix[row][col + 1] = 0;
                } else if (row > 1) {
                    matrix[row - 1][col] = 0;
                    matrix[row - 2][col] = 0;
                    matrix[row][col - 1] = 0;
                    matrix[row][col + 1] = 0;
                }else{
                    matrix[row - 1][col] = 0;
                    matrix[row + 1][col] = 0;
                    matrix[row][col - 1] = 0;
                    matrix[row][col + 1] = 0;
                }
            }
        }
    }
}
