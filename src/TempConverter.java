import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        String conversionChoice = "";

        System.out.println("Enter temp to be converted:");
        userInput = sc.nextLine();
        System.out.println(userInput);

        System.out.println("Do you want to convert to F)ahrenheit or C)elcius?");
        conversionChoice = sc.nextLine().toUpperCase();
        double inputConvertedToDouble = Double.parseDouble(userInput);

        if (conversionChoice.equals("F")) {
            double tempToReturn = (inputConvertedToDouble * 1.8) + 32;
            System.out.println("It is " + tempToReturn + " decgrees C.");
        } else if (conversionChoice.equals("C")) {
            double tempToReturn = ((5 * (inputConvertedToDouble - 32.0)) / 9.0);
            System.out.println("It is " + tempToReturn + " decgrees C.");
        } else {
            System.out.println("That is not a valid choice.");
        }

    }

}
