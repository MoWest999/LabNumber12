import java.util.Scanner;

/**
 * Created by Grand Circus Student on 7/26/2017.
 */
public class Main {
    public static void main(String[] args) {


                Scanner scan = new Scanner(System.in);

                String userName;
                String choosePlayer;
                String userChoice;
                String resultOne = "Win!";
                String resultTwo = "Lose!";
                String resultThree = "Draw!";

                System.out.println("Welcome to the classic game Rock, Paper, Scissors!");
                System.out.println();

                //prompt the user to enter a name and select an opponent
                System.out.print("Please enter your name: ");
                userName = scan.next();

                //prompt the user to select a player
                System.out.print("Choose a player (Computer or Queen): ");
                choosePlayer = scan.next();
                System.out.println();

                //prompt the user to select rock, paper, scissors
                System.out.print("Rock, paper, or scissors? ");
                userChoice = scan.next();
                Being uc = new Being();
                System.out.println();

                //print the player's choice
                System.out.print(userName + ": " + uc.generateRoshambo(userChoice));
                System.out.println();

                //print the opponent's choice
                if (choosePlayer.equalsIgnoreCase("Computer")) {
                    Computer choice1 = new Computer();
                    System.out.println("Computer: " + choice1.generateRoshambo());
                }
                else if (choosePlayer.equalsIgnoreCase("Queen")){
                    Queen choice2 = new Queen();
                    System.out.println("Queen: " + choice2.generateRoshambo());
                }
                System.out.println();
                scan.nextLine();

                String compChoice = "ROCK";
                //print the result of the match
                if (userChoice.equalsIgnoreCase("scissors")  compChoice.compareTo("ROCK")  ) {
                    System.out.println("Computer" + resultOne);

                }

    }
}
