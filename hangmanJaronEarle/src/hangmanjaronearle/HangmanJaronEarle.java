// Jaron Earle
package hangmanjaronearle;

import java.util.Scanner;

public class HangmanJaronEarle
{

    public static void main(String[] args)
    {
        boolean gameOn = true;

        String[] gameWords =
        {
            "javascript", "fuck", "fucking fuck", "goddamnit"
        };

        char[] alphabet =
        {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        do
        {
            int guesses;
            guesses = 0;

            char guess;
            char correctGuess;

            boolean isGuessed = false; // for now 

            String word = getWord(gameWords);
            String playAgain;

            char[] explodedWord;
            explodedWord = explode(word);

            Scanner input;
            input = new Scanner(System.in);


            while (!isGuessed)
            {
                displayGame(word, guesses);
                
                displayWord(word);
                
                System.out.println(word); // rm later
                
                System.out.println("Guess a letter: ");
                guess = input.next().charAt(0);

                for (char letter : explodedWord)
                {
                    if (letter == 'z') // update to isGuessed when loop works right
                    {
                        isGuessed = true;
                        break;
                        // update letters give winning message
                    }
                    else if (guess == letter) 
                    {
                        correctGuess = guess;
                        break;
                        // re-display word status && update available letters
                        // call display game 
                    }
                    else if (guess != letter) 
                    {
                        
                    }
                }
            }

            if (isGuessed)
            {
                System.out.println("Play again? y/n:"); // EOG prompt for play again
                playAgain = input.nextLine();

                if (playAgain.equalsIgnoreCase("y"))
                {
                    gameOn = true;
                }

                gameOn = false;
            }

        } while (gameOn);

    }

    public static char[] explode(String word)
    {
        return word.toCharArray();
    }

    public static String getWord(String[] choices)
    {
        int i = (int) (Math.random() * choices.length);

        return choices[i];
    }

    public static void displayGame(String word, int incorrectGuesses)
    {
        String hangman;

        switch (incorrectGuesses) // 
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
                hangman = "_________\n|       |\n|       0\n|      /|\\\n|       |\n|      /\n\n"; //left leg
                break;
            case 7:
                hangman = "_________\n|       |\n|       0\n|      /|\\\n|       |\n|      /\\\n\n"; // right leg
                break;
            default:
                hangman = "_________\n|       |\n|       \n|       \n|       \n|       \n\n"; // empty gallows
                break;
        }
        System.out.println(hangman);
    }

    public static String displayWord(String word)
    {
        String newWord;

        return "";
    }

    public static char[] displayAlphabet(char[] alphabet, char letter)
    {
        char[] newAlphabet =
        {
        }; // initialize with values

        return newAlphabet;
    }

    public static void clearConsole() 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
