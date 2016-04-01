public class Main {

    public static void main(String[] args) {

        for (int multiplicand = 2; multiplicand < 10; multiplicand ++){
            System.out.println("===========");
            new Column(multiplicand).show();
        }

    }
}
