public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualbyThreeDecimalPlaces(2.222,2.222));
    }
    public static boolean areEqualbyThreeDecimalPlaces(double firstNumber,double secondNumber){
        System.out.println("33" +(int) (firstNumber*1000));
        System.out.println("22" +(int) (secondNumber*1000));

        if(((int) (firstNumber*1000))==((int) (secondNumber*1000))){
            return true;
        }
        return false;
    }
}
