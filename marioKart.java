// Read the README.md
// Read it again
// Your code here
// Delete these 4 lines of comments

public class MarioKartPlayer{ //start of the player class
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

    //Princess Peach object
    public static void main(String[] args) {
        MarioKartPlayer princessPeach = new MarioKartPlayer("Debbie", "Princess Peach", 3);

    }

    //Luigi object
    public static void main(String[] args) {
        MarioKartPlayer princessPeach = new MarioKartPlayer("Vanessa", "Luigi", 4);

    }


}