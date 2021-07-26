public class DiagonalStar {
    public static void main(String[] args) {
        System.out.println(printSquareStar(8));
    }
    public static String printSquareStar(int number){
        if(number<5){
            return "Invalid Value";
        }
        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++){
                if(i==0||j==0||i==j||i==number-1||j==number-1||i+j==number-1){
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }
                System.out.println();
            }
        }
        return "Valid Number";
    }

}
