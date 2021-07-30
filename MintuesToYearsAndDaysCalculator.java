public class MintuesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        System.out.println(printYearAndDays(525600));

    }
    public static String printYearAndDays(long minutes){
        return minutes<0 ? "Invalid Value" : minutes+" min = "+minutes/(365*24*60)+" y and "+(minutes%(365*24*60))/(24*60)+"d";
    }
}
