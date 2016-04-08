public class Main {

    public static void main(String[] args) {

        Matrix a = new Matrix();
        a.prepare();
        Matrix.outputMatrix(a, "Matrix A with random numbers");

        Matrix b = new Matrix();
        b.prepare();
        Matrix.outputMatrix(b, "Matrix B with random numbers");

        Matrix c = summarizeMatrices(a,b);
        Matrix.outputMatrix(c,"Summarize two random matrix");

    }


    private static Matrix summarizeMatrices(Matrix firstMatrix, Matrix secondMatrix) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String number = firstMatrix.getElement(i,j) + secondMatrix.getElement(i,j);
                result[i][j] = Integer.decode(number);
            }
        }
        return null;
    }

}
