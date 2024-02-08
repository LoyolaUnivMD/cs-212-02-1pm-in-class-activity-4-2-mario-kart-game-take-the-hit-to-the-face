// MarioKartGame.java
// Programmer: Gigi Li
// Course:  CS 212, Mr. John
// Due Date: 2/8/23
// In-Class Assignment: Mario Kart Game
// Problem Statement: Create a program for a Mario Kart Game Pt2
// Inputs: none
// Output: player's name, character's name, speed
// Credits: none

public class MarioKartGame { //Create Mario Kart Class
    // Create main method for 2 characters
    public static void main(String[] args) {
        // Princess Peach Object
        MarioKartPlayer princessPeach = new MarioKartPlayer("Debbie", "Princess Peach", 3);
        princessPeach.displayInfo();
        princessPeach.boost();
        System.out.println("We have boosted " + princessPeach.character + "'s speed!");
        System.out.println(princessPeach.character + " now has " + princessPeach.speed + " speed.");
        System.out.println();

        // Luigi Object
        MarioKartPlayer luigi = new MarioKartPlayer("Vanessa", "Luigi", 4);
        luigi.displayInfo();
        luigi.boost();
        System.out.println("We have boosted " + luigi.character + "'s speed!");
        System.out.println(luigi.character + " now has " + luigi.speed + " speed.");
        System.out.println();

        System.out.println("Thank you for using this program.");
    }// End of main method
}
