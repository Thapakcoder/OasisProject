

import java.util.*;

 class NumberGuessingGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random random =new Random();
            int randomNO=random.nextInt(100)+1;
            int chance = 0;
            
            System.out.println("Guess your no between 0 to 100 and You have only 5 chances .");
            
            while (chance < 3) {
                System.out.print("please enter your guessed no : ");
                int guessedNO = sc.nextInt();
                chance++;
                
                if (guessedNO== randomNO) {
                    System.out.println(" you won this game ,you are winner !");
                    return; 
                } else if (guessedNO< randomNO) {
                    System.out.println("your guess no is smaller then the win no ");
                } else {
                    System.out.println("your no is larger then the win no ");
                }
            }

            System.out.println("sorry to say but  you are fail to guess the no so ");
            System.out.println("you loose the game , the required no is  : " +randomNO);
        }

}
}