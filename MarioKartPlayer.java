// MarioKartPlayer.java
// Programmer: Gigi Li
// Course:  CS 212, Mr. John
// Due Date: 2/8/23
// In-Class Assignment: Mario Kart Game
// Problem Statement:
// Inputs:
// Output:
// Credits: none


public class MarioKartPlayer{ //start of the player class
    //Data fields
    private String playerName;
    private String character;
    private int speed;

    //General Constructor (parameterized)
    public MarioKartPlayer(String playerName, String character, int speed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    //Default Constructor with default values
    public MarioKartPlayer(){
        this.playerName = "player";
        this.character = "unknown";
        this.speed = 0;
    }

    //Boosting speed method
    public int boost(){
        speed += 1;
        return speed;
    }

    //Displaying info method
    public String displayInfo(){
        System.out.println("Hi " + playerName + ", you will be playing " + character + ". Your current speed is " + speed + ".");
        return null;
    }

    //Create main method for 2 characters
    public static void main(String[] args) {
        //Princess Peach Object
        MarioKartPlayer princessPeach = new MarioKartPlayer("Debbie", "Princess Peach", 3);
        princessPeach.displayInfo();
        princessPeach.boost();
        System.out.println("We have boosted " + princessPeach.character + "'s speed!");
        System.out.println(princessPeach.character + " now has " + princessPeach.speed + " speed.");
        System.out.println();

        //Luigi Object
        MarioKartPlayer luigi = new MarioKartPlayer("Vanessa", "Luigi", 4);
        luigi.displayInfo();
        luigi.boost();
        System.out.println("We have boosted " + luigi.character + "'s speed!");
        System.out.println(luigi.character + " now has " + luigi.speed + " speed.");
        System.out.println();

    }//End of main method


}//end of MarioKartPlayer class