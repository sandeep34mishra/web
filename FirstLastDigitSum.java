public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }
    public static int sumFirstAndLastDigit(int number){
        int sum=0,num=number,firstNum=0;
        int lastNum=number%10;
        if(number<0){
            return -1;
        }
        System.out.println(lastNum);
            while(num>=10) {
                num = num / 10;
            }
            firstNum=num;
            System.out.println(firstNum);

            return firstNum+lastNum;
        }
    }

