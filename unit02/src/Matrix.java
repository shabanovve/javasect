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

    public int getElement(int i, int j) {
        return elements[i][j];
    }

    public void outputMatrix( String title) {
        System.out.println(title);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               int number = getElement(i,j);
                if (number < 10){
                    System.out.print(" " + number + " ");

                } else {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
        System.out.println("=============");
    }

    public void setElement(int i,int j, Integer element) {
        this.elements[i][j] = element;
    }

    public static Matrix summarizeMatrices(Matrix firstMatrix, Matrix secondMatrix) {
        Matrix result = new Matrix();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result.setElement(i,j,firstMatrix.getElement(i,j) + secondMatrix.getElement(i,j));
            }
        }
        return result;
    }

}
