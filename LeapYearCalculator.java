public class LeapYearCalculator {
    public static void main(String[] args) {

        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }

            }
        }
        return false;
    }

}

