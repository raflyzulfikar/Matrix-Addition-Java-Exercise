//RAFLY ZULFIKAR ALKAUTSAR
//102022400192
//SI-48-08
//Penjumlahan 2 Matriks 

import java.util.Random;
public class latihan4 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = 2;
        int cols = 2;
        int [][] matrixA = new int[rows][cols];
        int [][] matrixB = new int[rows][cols];
        int [][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = random.nextInt(10) + 1;
                matrixB[i][j] = random.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("Matriks A: ");
        printMatrix(matrixA);
        System.out.println("Matriks B: ");
        printMatrix(matrixB);
        System.out.println("\nHasil penjumlahan: ");
        printMatrix(resultMatrix);
    }
    public static void printMatrix (int[][] matrix) {
        for (int [] row : matrix) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
    }
    
}
