import java.util.Random;

/**
 * Created by Vladimir Shabanov on 09/04/16.
 */
public class Matrix {

    private static final int DIMENTION = 3;
    private int[][] elements = new int[DIMENTION][DIMENTION];

    public void prepare() {
        Random randomGenerator = new Random();
        for (int i = 0; i < DIMENTION; i++) {
            for (int j = 0; j < DIMENTION; j++) {
                elements[i][j] = randomGenerator.nextInt(10);
            }
        }
    }

    public String getElement(int i, int j) {
        return Integer.toString(elements[i][j]);
    }
}
