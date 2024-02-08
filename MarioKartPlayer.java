// MarioKartPlayer.java
// Programmer: Gigi Li
// Course:  CS 212, Mr. John
// Due Date: 2/8/23
// In-Class Assignment: Mario Kart Game
// Problem Statement: Create a program for a Mario Kart Game Pt1
// Inputs: none
// Output: player's name, character's name, speed
// Credits: none


class MarioKartPlayer { //Create Mario Kart Class
    // Data fields
    private String playerName;
    String character;
    int speed;

    // General Constructor (parameterized)
    public MarioKartPlayer(String playerName, String character, int speed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    // Default Constructor with default values
    public MarioKartPlayer() {
        this.playerName = "player";
        this.character = "unknown";
        this.speed = 0;
    }

    // Boosting speed method
    public void boost() {
        speed += 1;
    }

    // Displaying info method
    public void displayInfo() {
        System.out.println("Hi " + playerName + ", you will be playing " + character + ". Your current speed is " + speed + ".");
    }
} // end of MarioKartPlayer class

