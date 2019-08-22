import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = 2;
        double num2 = 3;
        double result = add(num1, num2);
        System.out.println(result);
        //while användaren vill räkna
            //fråga om användaren vill räkna
            //ta två nummer
            //välj räknesätt
            //utför operation
            //presentera resultat
    }

    public static double add(double number1, double number2){
        double result = number1 + number2;
        return result;
    }


}


