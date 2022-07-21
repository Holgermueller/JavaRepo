import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        String convertedTemp = "";
        String conversionChoice = "";

        System.out.println("Enter temp to be converted:");
        userInput = sc.nextLine();
        System.out.println(userInput);

        System.out.println("Do you want to convert to F)ahrenheit or C)elcius?");
        conversionChoice = sc.nextLine().toUpperCase();

        if (conversionChoice.equals("F")) {
            System.out.println("Convert to Fahrenheit");
            System.out.println(userInput + ", " + conversionChoice);
        } else if (conversionChoice.equals("C")) {
            System.out.println("Convert to Celcius");
            System.out.println(userInput + ", " + conversionChoice);
        } else {
            System.out.println("That is not a valid choice.");
        }

    }

}
