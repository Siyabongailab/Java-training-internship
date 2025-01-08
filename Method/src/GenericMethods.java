public class GenericMethods {

    public static  void main(String[] args){
        DisplayNumbers(5,7);

    }
        //generics-> T represents any type
       static <T> void DisplayNumbers(T x, T y){

        System.out.println("X: "+ x +",Y: "+ y);

       }


    static int calcSum(int num1, int num2)
    {return num1 + num2;}

    static double calcSum(double num1, double num2)
    {return num1 + num2;}

    static float calcSum(float num1, float num2)
    {return num1 + num2;}
}
