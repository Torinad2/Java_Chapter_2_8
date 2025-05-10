/********************************************************
 * Cookie Calories Calculator                           *
 * This program calculates the total number of calories *
 * consumed based on the number of cookies the user ate.*
 ********************************************************/

import java.util.Scanner;

public class CookieCalories {

    /********************************************************
     * Main Method                                          *
     * Prompts the user to enter the number of cookies they *
     * ate, calculates the total calories, and displays it. *
     ********************************************************/
    public static void main(String[] args) {

        //**********************************************
        // Constant Declarations                       *
        // These are fixed values that do not change   *
        //**********************************************
        final int COOKIES_IN_ONE_BAG = 40;          // Total number of cookies in one bag
        final int SERVING_IN_ONE_BAG = 10;          // Number of servings in one bag
        final int CALORIES_IN_ONE_SERVING = 300;    // Calories in one serving

        //**********************************************
        // Variable Declarations                       *
        // To store user input and calculated values   *
        //**********************************************
        int numberOfCookiesUserAte;                 // User's input: number of cookies eaten
        int totalCaloriesUserAte;                   // Total calories consumed
        int caloriesInOneCookie;                    // Calories per one cookie

        //**********************************************
        // Input Section                               *
        // Prompting the user to enter the number of   *
        // cookies they ate                            *
        //**********************************************
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the amount of cookies you ate: ");
        numberOfCookiesUserAte = keyboardInput.nextInt();

        //**********************************************
        // Calculation Section                         *
        // Calculate calories per cookie and total     *
        // calories consumed                           *
        //**********************************************
        caloriesInOneCookie = (SERVING_IN_ONE_BAG * CALORIES_IN_ONE_SERVING) / COOKIES_IN_ONE_BAG;
        totalCaloriesUserAte = numberOfCookiesUserAte * caloriesInOneCookie;

        //**********************************************
        // Output Section                               *
        // Display the total number of calories         *
        //**********************************************
        System.out.println("Total Calories consumed: " + totalCaloriesUserAte);

        //**********************************************
        // Developer Credit                             *
        //**********************************************
        System.out.println("\nDeveloped by: Nikita Baiborodov");

        //**********************************************
        // Resource Cleanup                             *
        //**********************************************
        keyboardInput.close();
        System.exit(0);
    }
}

