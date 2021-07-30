public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(22,23,42));
        System.out.println(isValid(11));
    }
    public static boolean hasSameLastDigit(int firstNum,int secondNum,int thirdNum) {
        if ((firstNum > 9 && firstNum < 1001) && (secondNum > 9 && secondNum < 1001) && (thirdNum > 9 && thirdNum < 1001)) {
            firstNum = firstNum % 10;
            secondNum = secondNum % 10;
            thirdNum = thirdNum % 10;
            if ((firstNum == secondNum) || (secondNum == thirdNum) || (secondNum == thirdNum) ||
                    (firstNum == secondNum && secondNum == thirdNum && secondNum == thirdNum)) ;
            return true;
        } else {
            return false;
        }
    }public static boolean isValid(int newNum){
            if(newNum>9&&newNum<1001){
                return true;
            }
            else {
                return false;
            }

        }
    }

