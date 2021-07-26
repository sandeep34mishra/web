public class EqualityPrinter {
    public static void main(String[] args) {
        System.out.println(printEqual(1,1,1));

    }
    public static String printEqual (int firstNum,int secondNum, int ThirdNum){
        if(firstNum<0||secondNum<0||ThirdNum<0){
            return "Invalid Value";
        }
        else if((firstNum == secondNum)&& (secondNum== ThirdNum)){
            return "All numbers are equal";
        }
        else if((firstNum != secondNum)&& (secondNum!= ThirdNum)&&(ThirdNum!=firstNum)){
            return "All numbers are different";
        }
        return "Neither all are equal or different";
    }
}
