// Jaron Earle
package hangmanjaronearle;

import java.util.Random;
import java.util.Scanner;

public class HangmanJaronEarle
{

    public static void main(String[] args)
    {
        boolean playing;
        Scanner s;
        Random r;

        s = new Scanner(System.in);
        r = new Random();

        String words[] =
        {
            "traditional", "climbing", "is", "radical", "programming"
        };

        playing = true;

        while (playing)
        {

            int rn;
            int guesses;
            char[] gameWord;
            char[] playerGuess;

            rn = r.nextInt(words.length);
            gameWord = explode(words[rn]);

            guesses = gameWord.length;

            playerGuess = new char[guesses];

            for (int i = 0; i < playerGuess.length; i++)
            {
                playerGuess[i] = '_';
            }

            boolean guessed;
            int incorrect;
            int counter;

            guessed = false;
            incorrect = 0;
            counter = 0;

            while (!guessed && incorrect != 7)
            {
                char input;

                System.out.println("Guesses: ");
                
                displayGallows(incorrect);
                
                displayWord(playerGuess);

                System.out.printf("You have %d incorrect guesses remaining!\n", 7 - incorrect);

                System.out.println("Enter a single letter: ");

                input = s.nextLine().charAt(0);

                if (input == '-')
                {
                    guessed = true;
                    playing = false;
                }
                else
                {
                    for (int i = 0; i < gameWord.length; i++) 
                    {
                        if (gameWord[i] == input)
                        {
                            playerGuess[i] = input;
                        }
                        else if (gameWord[i] != input) 
                        {
                            counter++;
                            
                            if(counter == gameWord.length) 
                            {
                                incorrect++;
                            }
                        }
                    }
                    
                    counter = 0;

                    if (isWordGuessed(playerGuess))
                    {
                        guessed = true;
                        
                        displayGallows(incorrect);
                        
                        displayWord(playerGuess);
                        
                        System.out.println("Congratulations, you won!");
                    }
                }
            }

            if (!guessed)
            {
                displayGallows(incorrect);
                
                displayWord(playerGuess);
                
                System.out.println("You're out of guesses!");
            }

            System.out.println("Would you like to play again? (y/n) ");

            String choice = s.nextLine();

            if (choice.equals("n"))
            {

                playing = false;
            }
        }

        System.out.println("Game Over!");
    }

    public static char[] explode(String word)
    {
        return word.toCharArray();
    }

    public static void displayWord(char array[])
    {
        for (int i = 0; i < array.length; i++)
        {

            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void displayGallows(int incorrect) // 7 guesses max
    {
        String hangman;

        switch (incorrect)
        {
            case 0:
                hangman = "_________\n|       |\n|       \n|       \n|       \n|       \n\n"; // empty gallows
                break;
            case 1:
                hangman = "_________\n|       |\n|       0\n|       \n|       \n|       \n\n"; // head on gallows
                break;
            case 2:
                hangman = "_________\n|       |\n|       0\n|       \n|      /\n|       \n\n"; // left arm
                break;
            case 3:
                hangman = "_________\n|       |\n|       0\n|      /|\n|       \n|       \n\n"; // upper torso
                break;
            case 4:
                hangman = "_________\n|       |\n|       0\n|      /|\\\n|       \n|       \n\n"; // right arm
                break;
            case 5:
                hangman = "_________\n|       |\n|       0\n|      /|\\\n|       |\n|      \n\n"; // lower torso
                break;
            case 6:
                hangman = "_________\n|       |\n|       0\n|      /|\\\n|       |\n|       /\n\n"; //left leg
                break;
            case 7:
                hangman = "_________\n|       |\n|       0\n|      /|\\\n|       |\n|       /\\\n\n"; // right leg
                break;
            default:
                hangman = "_________\n|       |\n|       \n|       \n|       \n|       \n\n"; // empty gallows
                break;
        }
        System.out.println(hangman);
    }

    public static boolean isWordGuessed(char[] arr)
    {
        boolean condition;
        condition = true;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == '_')
            {
                condition = false;
            }
        }
        return condition;
    }
}
