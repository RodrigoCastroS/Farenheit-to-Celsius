import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica cuantos euros quieres cambiar");
        int euros = sc.nextInt();
        double rateChange = 0.84;

        System.out.println("la cantidad de pounds seràn £" + (euros * rateChange));
    }
}
