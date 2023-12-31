import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int numberOfGuesses=0;

    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number below 100");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }
    boolean isCorrectNumber(){
        numberOfGuesses++;
        if (inputNumber==number){
            System.out.printf("Yes, you guessed it right..!!, it was %d\n You  guessed it in %d attempts\n",number,numberOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low..");
        }
        else if(inputNumber>number){
            System.out.println("Too high..");
        }
        return false;

    }
}
public class CWH_50_ex_sol {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number" game once.
            1.Game should have the following methods:
            2.Constructor to generate the random number
            3.takeUserInput() to take a user input of number
            4.isCorrectNumber() to detect whether the number entered by the user is true
            5.getter and setter for noOfGuesses
            6.Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean b=false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }


    }
}
