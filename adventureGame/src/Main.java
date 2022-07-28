public class Main {

    public static void main(String[] args) throws InterruptedException {
        //The below grabs a random location from a predefined list & method in Location class.
        Location storyLoc = new Location();

        //The below grabs a random monster from a predefined list & method in Monster class.
        Monster storyMon = new Monster();

        //The below utilizes the text delay class and grabs the method for delays.
        Text textDelay = new Text();

        //The below utilizes the choice class and grabs the choice from the user input.
        Choice userChoice = new Choice();

        //The below utilizes the Responses class and grabs the choice based on 1 or 2 from a list.
        Responses responses = new Responses();



        /** Welcome to Java Adventure by Michael Riano!**/

        System.out.println("*************************");
        System.out.println("*   Java Adventure!    *");
        System.out.println("*      M. Riano        *");
        System.out.println("*      Enjoy!          *");
        System.out.println("*************************");
        System.out.println(" ");
        System.out.println(textDelay.addDelay("Welcome to Java Adventure!"));
        System.out.println(textDelay.addDelay("You awaken to find yourself no longer in bed."));
        System.out.println(textDelay.addDelay("Confused and tired is the least of your worries."));
        System.out.println(textDelay.addDelay("Where are you?  Why are you here?"));
        System.out.println(textDelay.addDelay("Regardless of unanswered questions, it's time to move."));
        System.out.println(textDelay.addDelay("You can clearly see you are in a " + storyLoc.getALocation() + "."));
        System.out.println(textDelay.addDelay("The smell is off, you wonder what has happened."));
        System.out.println(textDelay.addDelay("There is a feeling of uneasiness, something just isn't right."));
        System.out.println(textDelay.addDelay("A " + storyMon.getAMonster() + " appears!"));
        System.out.println(textDelay.addDelay("You are way to tired and weak to really engage in battle, but"));
        System.out.println(textDelay.addDelay("You have a choice on your hands."));
        System.out.println(textDelay.addDelay("Do you 1 Engage in Battle or 2 run as fast as you can?"));
        userChoice.getChoice();
        if(userChoice.getChoice() == 1){
            System.out.println(textDelay.addDelay(responses.getChoiceOne()));}
        else if (userChoice.getChoice() == 2){
            System.out.println(textDelay.addDelay(responses.getChoiceTwo()));}
        System.out.println(textDelay.addDelay("Proceeding on you are now upon a " + storyLoc.getALocation()));
        System.out.println(textDelay.addDelay("You just want to go home at this point.  How much longer?"));
        System.out.println(textDelay.addDelay("You wonder why this happened to you?"));
        System.out.println(textDelay.addDelay("A " + storyMon.getAMonster() + " has arrived!"));
        System.out.println(textDelay.addDelay("Do you 1 Engage in Battle or 2 run as fast as you can?"));
        userChoice.getChoice();
        if(userChoice.getChoice() == 1){
            System.out.println(textDelay.addDelay(responses.getChoiceOne()));}
        else if (userChoice.getChoice() == 2){
            System.out.println(textDelay.addDelay(responses.getChoiceTwo()));}
        System.out.println(textDelay.addDelay("Proceeding forward, you realize you're not quite the artist" +
                " you thought you were."));
        System.out.println(textDelay.addDelay("You think about your job as a story teller."));
        System.out.println(textDelay.addDelay("You wished you had enough money to hire a novelist to write" +
                " your most recent program."));
        System.out.println(textDelay.addDelay("While thinking in the middle of a " + storyLoc.getALocation() + " a " +storyMon.getAMonster() + " decides to keep you company."));
        System.out.println(textDelay.addDelay("Do you 1 Engage in Battle or 2 run as fast as you can?"));
        if(userChoice.getChoice() == 1){
            System.out.println(textDelay.addDelay(responses.getChoiceOne()));}
        else if (userChoice.getChoice() == 2){
            System.out.println(textDelay.addDelay(responses.getChoiceTwo()));}
        System.out.println(textDelay.addDelay("A loud ringing is slamming your ear."));
        System.out.println(textDelay.addDelay("You suddenly wake up to being in your bed."));
        System.out.println(textDelay.addDelay("You are late for work and have been dreaming this whole time!"));
        System.out.println(textDelay.addDelay("Time to get up and do the grind."));
        System.out.println(textDelay.addDelay("Thank you for running Java Adventure!"));
    }
}
