public class FactorPrinter {
    public static void main(String[] args) {
        printFactor(10);
    }

    public static int printFactor(int number) {
        int sum = 0, d = 1;
        if (number < 1) {
            return -1;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {


                if (i == 1) {
                    System.out.print(i);
                } else
                    System.out.print(" , " + i);

            }

        }

        return d;


    }
}
