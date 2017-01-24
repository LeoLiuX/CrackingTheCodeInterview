package Arrays_Strings;

/**
 * Created by liuxi on 2017/1/24.
 */
public class Q7_Rotate_Matrix {

    public static void main(String[] args){
        int[][] matrix = new int[][]{{1, 2, 3, 4, 5},
                                    {6, 7, 8, 9, 10},
                                    {11,12,13,14,15},
                                    {16,17,18,19,20},
                                    {21,22,23,24,25}};
        printMatrix(matrix);
        rotateMatrix(matrix);
        System.out.println();
        printMatrix(matrix);
    }
    private static void printMatrix(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrix(int[][] matrix){
        int mid = matrix.length / 2;
        for (int i=0; i<mid; i++){
            int first = i;
            int last = matrix.length - i - 1;
            for (int j=first; j<last; j++){
                int offset = j - first;
                int top = matrix[first][j];
                matrix[first][j] = matrix[last - offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[j][last];
                matrix[j][last] = top;
            }
        }
    }
}
