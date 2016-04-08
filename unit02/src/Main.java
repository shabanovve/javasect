public class Main {

    public static void main(String[] args) {

        Matrix[] matrices = new Matrix[10];
        for (int i = 0; i < 10; i++) {
            Matrix m = new Matrix();
            m.prepare();
            matrices[i] = m;
        }

        for (int i = 0; i < 10; i++) {
            matrices[i].outputMatrix("Random matrix #" + i);
        }
    }

}
