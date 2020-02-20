// Jaron Earle
package hangmanjaronearle;

public class HangmanJaronEarle
{

    public static void main(String[] args)
    {
         String[] words =
        {
            "javascript", "fuck", "fucking fuck", "goddamnit"
        };
        
        char[] alphabet =
        {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

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

    public static boolean gameloop(String word, char[] alphabet)
    {
        int numGuesses = 0; // 0 for now
        boolean isGuessed = false;
               

        do {
            displayGame(word,  numGuesses);
            
            for (int i = 0; i < word.length(); i++) 
            {
                
            }
            
            
        } while (!isGuessed);

        return isGuessed;
    }
}
