public class Main {

    public static void main(String[] args) {

        Matrix a = new Matrix();
        a.prepare();
        a.outputMatrix("Matrix A with random numbers");

        Matrix b = new Matrix();
        b.prepare();
        b.outputMatrix("Matrix B with random numbers");

        Matrix c = summarizeMatrices(a,b);
        c.outputMatrix("Summarize two random matrix");

    }


    private static Matrix summarizeMatrices(Matrix firstMatrix, Matrix secondMatrix) {
        Matrix result = new Matrix();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result.setElement(i,j,firstMatrix.getElement(i,j) + secondMatrix.getElement(i,j));
            }
        }
        return result;
    }

}
