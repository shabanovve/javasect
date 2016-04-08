public class Main {

    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] secondMatrix = {{3, 3, 3}, {2, 2, 2}, {1, 1, 1}};
        int[][] result;

        outputMatrix(firstMatrix, "First matrix");
        outputMatrix(secondMatrix, "Second matrix");

        result = summarizeMatrices(firstMatrix, secondMatrix);

        outputMatrix(result, "Result matrix");

        Matrix a = new Matrix();
        a.prepare();
        Matrix.outputMatrix(a, "Matrix A with random numbers");

        Matrix b = new Matrix();
        b.prepare();
        Matrix.outputMatrix(b, "Matrix B with random numbers");

        result = summarizeMatrices(a,b);
        outputMatrix(result,"Summarize two random matrix");

    }

    private static int[][] summarizeMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return result;
    }

    private static int[][] summarizeMatrices(Matrix firstMatrix, Matrix secondMatrix) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String number = firstMatrix.getElement(i,j) + secondMatrix.getElement(i,j);
                result[i][j] = Integer.decode(number);
            }
        }
        return result;
    }

    private static void outputMatrix(int[][] firstMatrix, String title) {
        System.out.println(title);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=============");
    }
}
