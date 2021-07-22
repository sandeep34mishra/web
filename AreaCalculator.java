public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Area Of Circle is=" +area(-11) );
        System.out.println("Area Of Rectangle is=" +area(-2,-3) );

    }
    public static double area (double radius){
       double pi= Math.PI;
       double areaOfCircle=(radius*radius*pi);
       if(radius<0){
           return areaOfCircle=-1.0;
       }
       return areaOfCircle;
    }
    public static double area (double x,double y){
        double areaOfRectangle = (x*y);
        if(x<0 || y<0){
            return areaOfRectangle=-1.0;
        }
        else{
        return areaOfRectangle;}
    }
}
