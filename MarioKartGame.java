public class MarioKartGame {
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
