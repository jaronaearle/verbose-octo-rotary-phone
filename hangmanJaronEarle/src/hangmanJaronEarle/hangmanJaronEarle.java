// Jaron Earle
package hangmanJaronEarle;

import java.util.Scanner;
import java.util.Random;

public class hangmanJaronEarle
{
    public static void main(String[] args)
    {
        boolean playing;
        Scanner s;
        Random r; 
        
        s = new Scanner(System.in);
        r = new Random();
        
        
        String words[] = {"javascript", "programming", "golang", "skiings"};
        
        playing = true;
        
        while(playing){
    
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
                playerGuess[i] =  '_';
            } 
            
            boolean guessed;
            int tries;
            
            guessed = false;
            tries = 0;
            
            while (!guessed && tries != guesses)
            {
                
                System.out.println("Guesses: ");
                
                displayWord(playerGuess);
                
                System.out.printf("You have %d guesses remaining.\n", guesses-tries);
                
                System.out.println("Enter a single letter: ");
                
                char input = s.nextLine().charAt(0);
                
                tries++;
                
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
                    } 
               
                    if (isWordGuessed(playerGuess))
                    {
                        guessed = true;
                        
                        System.out.println("Congratulations");
                    }
                }
            } 
            
            if (!guessed)
            {
                
                System.out.println("You ran out of guesses.");
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
    
    public static boolean isWordGuessed(char[] arr)
    {
        boolean condition;
        condition = true;
        
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == '_')
            {
                
                condition = false;
            }
        }
        return condition;
    }
}
