public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        int evenNumSum=0;
        if(number<0){
            return -1;
        }

        while(number>0){
            if(((number%10)%2)==0){//all the last digits are even
                evenNumSum=evenNumSum+(number%10);//last num
            }
            number/=10;//take the last digit
        }
        return evenNumSum;
    }
}
