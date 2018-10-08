package world.of.zuul;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Parser 
{
    private CommandWords commands;
    private Scanner reader;

    public Parser() 
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    public Command getCommand() 
    {
        String inputLine;
        String word1 = null;
        String word2 = null;

        System.out.print("> "); 

        inputLine = reader.nextLine();

        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) { //tjekker for mellemrum
            word1 = tokenizer.next();
            if(tokenizer.hasNext()) {  //tjekker for mellemrum
                word2 = tokenizer.next(); 
            }
        }

        return new Command(commands.getCommandWord(word1), word2);
    }

    public void showCommands()
    {
        commands.showAll();
    }
}
