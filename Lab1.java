/*******************************************************************************************************************
  * CIS 129 - Programming and Problem Solving I 
  * Emery Tate Student
  * Lab1.java
  ****************************************************************************************************************** 
  * This is the template to use for Lab 1
  ******************************************************************************************************************/
public class Lab1 {
   
   public static void main(String[] args) {
      int minNum = 0;
      int maxNum = 1000;
      displayWelcomeMessage();
      String userName = IR4.getString("What is your name?");
      int numberGuess = IR4.getInteger(userName + ", how many wasp do you think are in the hive?");

      if (numberGuess < minNum){
         System.err.println("Invalid Number enter a number above 0");
         System.exit(-1);
      }

      int randomNum = IR4.getRandomNumber(minNum, maxNum);

      int differenceOfNumbers = numberGuess - randomNum;
      displayResult(randomNum, numberGuess, differenceOfNumbers, userName);

      displayGoodbyeMessage();
      
   }//end of main

   //-----------------------------------------------------------------------------------------------------------------
     
   public static void displayWelcomeMessage() {
      System.out.println("*******************************************************************\n");
      System.out.println("                    Guess the Number of Wasps!                       ");
      System.out.println("In this program you will try and guess the number of Wasps in a hive.");
      System.out.println("The program will then tell you how many Wasp you were off by.\n");

      //display the welcome message here  <<<==================================================================
      
      System.out.println("*******************************************************************");
   }

   public static void displayGoodbyeMessage() {
      System.out.println("");
      System.out.println("Thank you for gracing us with your bee-keeping presence! Until we meet again!");
      //display the goodbye message here  <<<==================================================================
      
   }

   // insert the displayResult module here    <<<==============================================================

   public static void displayResult(int randomNum, int numGuess, int differenceOfNumbers, String userName) {
      if (randomNum == numGuess) {
         System.out.println("Hooray! You guess correctly! Congrats " + userName + "!");
      } else {
         System.out.println("There are " + randomNum + " Wasps in the hive, " + userName + ". You were off by " + differenceOfNumbers + ".");
      }
   }




}//end of class 