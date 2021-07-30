public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(21));

    }
    public static int getLargestPrime(int number){
        if (number <= 0 || number == 1) {
            return -1;
        }
        int largestprime = 0;
        for (int i = 1; i <= number; i++) {
            boolean test = true;
            if (number%i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        test = false;
                    }
                }
                if (test) {
                    largestprime = i;
                }

            }
        }return largestprime;

    }
}
