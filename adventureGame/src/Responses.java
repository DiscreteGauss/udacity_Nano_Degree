import java.util.Random;

public class Responses {

    private String[] choiceOne = {"You narrowly escape with minor cuts and bruises. This could have gone way worse! ",
            "You emerge victorious!  You have overcome defiantly! ",
            "This could have gone better, but you emerge none the less. ",
            "Barely making it out alive is an understatement. ",
            "You did it!  You really did it! "};
    private String[] choiceTwo = {"You decide to try and escape to live another day, successfully. ",
            "Running isn't always for cowards, and you live to tell the tale this time. ",
            "Your skills help you evade this situation. ",
            "Run, run run! ",
            "You cowardly escape. "};

    //private String[] usedChoiceOne = {};
    //private String[] usedChoiceTwo = {};



    public String getChoiceOne(){
        Random random = new Random();
        int indexChooser = random.nextInt(choiceOne.length);
        String choiceLocOne= choiceOne[indexChooser];
        return choiceLocOne;
    }
    public String getChoiceTwo(){
        Random random = new Random();
        int indexChooser = random.nextInt(choiceTwo.length);
        String choiceLocTwo = choiceTwo[indexChooser];
        return choiceLocTwo;

    }
}

