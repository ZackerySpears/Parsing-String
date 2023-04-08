import java.util.Scanner;

public class ParsingStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Scanner inSS = null;
      String firstWord;
      String secondWord;
      
      //This is a while loop to loop over multiple inputs from the user
      while (true) {
         
         System.out.println("Enter input string: ");
         
         //Get the user whole input
         String parsingString = scnr.nextLine();
         
         //This creates a new string stream input
         inSS = new Scanner(parsingString);
         
         //This delimiters is defined as a comma and then creates a new line
            inSS.useDelimiter("[,\n]");
         
         
         //If the user enters q the while loop breaks out
         if (parsingString.equals("q")) {
            break;            
         }
         else {
            //This if statement checks to see if there are no commas 
            if(parsingString.indexOf(",") == -1) {
               System.out.println("Error: No comma in string");
            }
            
            else {
               //This assigns the the first word with the first word from the user inputs
               firstWord = inSS.next();
               //This assigns the the second word with the first word from the user inputs
               secondWord = inSS.next();
               
               //Prints out the first word and removes the comman 
               System.out.println("First word: " + firstWord.trim().replace(",", ""));
               //Prints out the second word and removes the comman 
               System.out.println("Second word: " + secondWord.trim().replace(",", ""));
               
               //Prints the space between each set of two words
               System.out.println("");
               System.out.println("");
               
               scnr.close();
               inSS.close();
            }
         }
      }
      return;
   }
}