import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the Farenheit amount to convert to Celsius");
        int degrees = sc.nextInt();
        double result  = convertFarenheit(degrees);
        System.out.println("the resulted value was" + result);

    }

    public static double convertFarenheit(double degrees){
        return (degrees - 32) * (5.0/9);
    }
}
