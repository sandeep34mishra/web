public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNum=0;
        int secondNum=1;
        int temp;
        for(int i=1;i<=15;i++){

            temp=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=temp;
            System.out.println(firstNum);

        }
    }


}
