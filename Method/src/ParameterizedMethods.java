public class ParameterizedMethods {

    public static  void main(String[] args){

        displayMessage("hello world");




    }
    static void displayMessage(String msg){System.out.println(msg);}
    static int calcSum(int num1, int num2)
    {return num1 + num2;}

    static double calcSum(double num1, double num2)
    {return num1 + num2;}

    static float calcSum(float num1, float num2)
    {return num1 + num2;}

    static int sum(int[] numbers){
        int total =0;

        for(int i =0; i<numbers.length; i++){

            total +=numbers[i];


        }
        return total;
    }

//store any number of integers..
    static int SAum(int... numbers) {
        int tot = 0;

        for (int num : numbers) {
            tot += num;
        }

        return tot;
    }
}
