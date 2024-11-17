// import java.util.Scanner;
// import java.util.Random;

// class RandomNum {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         Random rn = new Random();
//         int num_to_guess, attempts, user_guess;
//         boolean correct_guess= false ;
//         num_to_guess = rn.nextInt(1000) + 1;
//         attempts = 10; 
//         System.out.println("Guess the number between 1 and 1000.");
//         while (attempts > 0 && !correct_guess) {
//             System.out.println("Enter your guess:");
//             user_guess = sc.nextInt();
//             if (user_guess < 1 || user_guess > 1000) {
//                 System.out.println("Out of range! Please guess a number between 1 and 1000.");
//                 continue;
//             }
//             if (user_guess == num_to_guess) {
//                 System.out.println("Congratulations! You've guessed the number!");
//                 correct_guess = true;
//             } else {
//                 attempts--;
//                 System.out.println("Wrong number, try again! Attempts left: " + attempts);
//                 if (user_guess < num_to_guess) {
//                     System.out.println("Hint: Number too low.");
//                 } else {
//                     System.out.println("Hint: Number too high.");
//                 }
           
//             }
          
//         }
//         System.out.println("Sorry, you've run out of attempts. The number was: " + num_to_guess);

//         System.out.println("Game Over! Thanks for playing.");
//         sc.close();
//     }   
// }


import java.util.Scanner;
import java.util.Random;

class RandomNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        boolean play = true; 
        int totalScore = 0; 

        while (play) {
            int num_to_guess = rn.nextInt(1000) + 1; 
            int attempts = 10; 
            boolean correct_guess = false;

            System.out.println("Guess the number between 1 and 1000.");
            while (attempts > 0 && !correct_guess) {
                System.out.println("Enter your guess:");
                int user_guess = sc.nextInt();
                if (user_guess < 1 || user_guess > 1000) {
                    System.out.println("Out of range! Please guess a number between 1 and 1000.");
                    continue;
                }
                if (user_guess == num_to_guess) {
                    System.out.println("Congratulations! You've guessed the number!");
                    correct_guess = true;
                    totalScore += attempts; 
                } else {
                    attempts--;
                    System.out.println("Wrong number, try again! Attempts left: " + attempts);
                    if (user_guess < num_to_guess) {
                        System.out.println("Number too low.");
                    } else {
                        System.out.println(" Number too high.");
                    }
                }
            }
            if (!correct_guess) {
                System.out.println("Sorry, you've run out of attempts. The number was: " + num_to_guess);
            }
            System.out.println("Your current total score is: " + totalScore);
            System.out.println("Do you want to play again? (y/n)");
            String response = sc.next();
            play = response.equalsIgnoreCase("y");
        }
        System.out.println("Game Over! final score: " + totalScore);
        sc.close();
    }
}