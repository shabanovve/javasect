public class Main {

    public static void main(String[] args) {

        Matrix a = new Matrix();
        a.prepare();
        a.outputMatrix("Matrix A with random numbers");

        Matrix b = new Matrix();
        b.prepare();
        b.outputMatrix("Matrix B with random numbers");

        Matrix c = Matrix.summarizeMatrices(a,b);
        c.outputMatrix("Summarize two random matrix");

    }

}
