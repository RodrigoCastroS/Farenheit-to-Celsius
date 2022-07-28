import java.util.Scanner;

public class ForexConverter {
    public static double formulaConverter(String typeOfCurrency, int amountToChange){
        double result = 0;

        if(typeOfCurrency.toLowerCase().equals("euros")){
            result = amountToChange * 0.84;
        }else {
            result = amountToChange * 1.19;
        }

        return Math.round(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica que quieres cambiar: Euros o Pounds");
        String currency = sc.next();

        System.out.println("Indica cuanto quieres cambiar");
        int amountToChange = sc.nextInt();

        System.out.println("El total será de " + formulaConverter(currency, amountToChange));
    }
}
