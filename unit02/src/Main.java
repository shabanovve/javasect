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

        Matrix[] matrices = new Matrix[10];
        for (int i = 0; i < 10; i++) {
            Matrix m = new Matrix();
            m.prepare();
            matrices[i] = m;
        }
    }

}
