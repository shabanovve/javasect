public class Main {

    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] secondMatrix = {{3, 3, 3}, {2, 2, 2}, {1, 1, 1}};

        System.out.println("First matrix");
        for (int i = 0; i < 3; i++) {
            for (int j=0;j<3;j++){
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=============");

    }
}
