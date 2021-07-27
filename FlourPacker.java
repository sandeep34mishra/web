public class FlourPacker {
    public static void main(String[] args) {
        boolean amount=true;
        amount=(canPack(1,0,4));
        System.out.println(amount);
    }
    public static boolean canPack(int bigCount,int smallCount, int goal){
        if(bigCount<0||smallCount<0||goal<0){
            return false;
        }
        int bigCountTotal=0;
        bigCountTotal=bigCount*5;
        System.out.println("Big Count Total :" +bigCountTotal);
        System.out.println("Small Count Total:" +smallCount);
        System.out.println("Goal :"+goal);

        int total=bigCountTotal+smallCount;
        if(total==goal){
            System.out.println("Goal met!");
            return true;
        }else if(bigCount%goal!=0){
            while (bigCountTotal>goal){
                bigCountTotal=5;
            }

        }
        int smallValue=(goal-bigCountTotal);
        return smallCount >= smallValue ? true:false;

    }
}
