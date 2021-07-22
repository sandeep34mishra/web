public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,6));
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay ){
        if((hourOfDay<8||hourOfDay>=22)&&(hourOfDay<23||hourOfDay>0)){
           return true;
        }
        else{
            return false;
        }
    }
}
