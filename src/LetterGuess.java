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
    int guessesLeft = 9;
    String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
        "T", "U",
        "V", "W", "X", "Y", "Z" };
    int index = rand.nextInt(letters.length);

    System.out.println(TEXT_BLUE + "Welcome to the letter guess game!" + TEXT_RESET);
    System.out.println(TEXT_CYAN + "You have " + guessesLeft + " chances to win." + TEXT_RESET);
    System.out.println(TEXT_GREEN + "Please choose one letter from the alphabet:" + TEXT_RESET);
    userChoice = sc.nextLine().toUpperCase();

    if (userChoice.equals(letters[index])) {
      System.out.println(TEXT_GREEN + "Congratualations! You have won!" +
          TEXT_RESET);
    }

    if (!userChoice.equals(letters[index])) {
      System.out.println(TEXT_YELLOW + "Sorry, that is not the correct letter.");
      guessesLeft = guessesLeft - 1;
      userChoice = "";
      System.out.println("You have " + guessesLeft + " chances remaining. Please choose again:" + TEXT_RESET);
      userChoice = sc.nextLine().toUpperCase();
    }

    if (!userChoice.equals(letters[index]) && guessesLeft == 8) {
      System.out.println(TEXT_YELLOW + "Sorry, that is not the correct letter.");
      guessesLeft = guessesLeft - 1;
      userChoice = "";
      System.out.println("You have " + guessesLeft + " chances remaining. Please choose again:" + TEXT_RESET);
      userChoice = sc.nextLine().toUpperCase();
    }

    if (!userChoice.equals(letters[index]) && guessesLeft == 7) {
      System.out.println(TEXT_YELLOW + "Sorry, that is not the correct letter.");
      guessesLeft = guessesLeft - 1;
      userChoice = "";
      System.out.println("You have " + guessesLeft + " chances remaining. Please choose again:" + TEXT_RESET);
      userChoice = sc.nextLine().toUpperCase();
    }

    if (!userChoice.equals(letters[index]) && guessesLeft == 6) {
      System.out.println(TEXT_YELLOW + "Sorry, that is not the correct letter.");
      guessesLeft = guessesLeft - 1;
      userChoice = "";
      System.out.println("You have " + guessesLeft + " chances remaining. Please choose again:" + TEXT_RESET);
      userChoice = sc.nextLine().toUpperCase();
    }

    if (!userChoice.equals(letters[index]) && guessesLeft == 5) {
      System.out.println(TEXT_YELLOW + "Sorry, that is not the correct letter.");
      guessesLeft = guessesLeft - 1;
      userChoice = "";
      System.out.println("You have " + guessesLeft + " chances remaining. Please choose again:" + TEXT_RESET);
      userChoice = sc.nextLine().toUpperCase();
    }

    if (!userChoice.equals(letters[index]) && guessesLeft == 4) {
      System.out.println(TEXT_YELLOW + "Sorry, that is not the correct letter.");
      guessesLeft = guessesLeft - 1;
      userChoice = "";
      System.out.println("You have " + guessesLeft + " chances remaining. Please choose again:" + TEXT_RESET);
      userChoice = sc.nextLine().toUpperCase();
    }

    if (!userChoice.equals(letters[index]) && guessesLeft == 3) {
      System.out.println(TEXT_YELLOW + "Sorry, that is not the correct letter.");
      guessesLeft = guessesLeft - 1;
      userChoice = "";
      System.out.println("You have " + guessesLeft + " chances remaining. Please choose again:" + TEXT_RESET);
      userChoice = sc.nextLine().toUpperCase();
    }

    if (!userChoice.equals(letters[index]) && guessesLeft == 2) {
      System.out.println(TEXT_YELLOW + "Sorry, that is not the correct letter.");
      guessesLeft = guessesLeft - 1;
      userChoice = "";
      System.out.println("You have " + guessesLeft + " chances remaining. Please choose again:" + TEXT_RESET);
      userChoice = sc.nextLine().toUpperCase();
    }

    if (!userChoice.equals(letters[index]) && guessesLeft == 1) {
      System.out.println(TEXT_YELLOW + "Sorry, that is not the correct letter." + TEXT_RESET);
      guessesLeft = guessesLeft - 1;
      userChoice = "";
      System.out.println(TEXT_RED + "This is your last chance! Please choose again:" + TEXT_RESET);
      userChoice = sc.nextLine().toUpperCase();
    }

    if (guessesLeft == 0) {
      System.out.println(TEXT_RED + "Sorry, the correct letter was " + letters[index] + ". You lose!" + TEXT_RESET);
    }

  }

}
