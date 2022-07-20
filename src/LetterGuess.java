import java.util.Scanner;
import java.util.Random;;

public class LetterGuess {
  public static final String TEXT_RESET = "\u001B[0m";
  public static final String TEXT_RED = "\u001B[31m";
  public static final String TEXT_BLUE = "\u001B[34m";
  public static final String TEXT_GREEN = "\u001B[32m";
  public static final String TEXT_CYAN = "\u001B[36m";
  public static final String TEXT_YELLOW = "\u001B[33m";

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    String userChoice = "";
    String secretLetter = "";
    int guessesAllowed = 10;
    int guessesTaken = 0;
    boolean outOfGuesses = false;
    String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
        "T", "U",
        "V", "W", "X", "Y", "Z" };
    int index = rand.nextInt(letters.length);

    System.out.println(TEXT_BLUE + "Welcome to the letter guess game!" + TEXT_RESET);
    System.out.println(TEXT_CYAN + "You have " + guessesAllowed + " chances to win." + TEXT_RESET);
    System.out.println(TEXT_GREEN + "Please choose one letter from the alphabet:" + TEXT_RESET);

    secretLetter = letters[index];

    userChoice = sc.nextLine().toUpperCase();

    while (!userChoice.equals(secretLetter) && !outOfGuesses) {
      if (guessesAllowed > guessesTaken) {
        System.out.println(TEXT_RED + "That's not the correct letter." + TEXT_RESET);
        guessesTaken++;
        System.out
            .println(TEXT_YELLOW + "You have tried " + TEXT_RESET + TEXT_BLUE + guessesTaken + TEXT_RESET + TEXT_YELLOW
                + " times." + TEXT_RESET);
        System.out.println(TEXT_GREEN + "Please try again:" + TEXT_RESET);
        userChoice = sc.nextLine().toUpperCase();
      } else {
        outOfGuesses = true;
      }
    }
    if (outOfGuesses) {
      System.out.println(TEXT_RED + "Sorry, you're out of tries.");
      System.out.println("The correct answer was " + TEXT_RESET + TEXT_CYAN + secretLetter + TEXT_RESET);
      System.out.println(TEXT_RED + "You lose." + TEXT_RESET);
    } else {
      System.out.println(TEXT_BLUE + "The correct answer IS " + TEXT_RESET + TEXT_YELLOW + secretLetter + TEXT_RESET
          + TEXT_BLUE + "!" + TEXT_RESET);
      System.out.println(TEXT_GREEN + "Congratualations! You have won!" +
          TEXT_RESET);
    }

  }

}
