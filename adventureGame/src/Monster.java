import java.util.Random;
public class Monster {

    private String[] monsters = {"Dragon", "Troll", "Goblin", "Imp", "Wolf", "Bear", "Black Widow",
            "Harpy", "Stone Guardian"};
    //private String[] usedMonster = {};

    public String getAMonster(){
        Random random = new Random();
        int indexChooser = random.nextInt(monsters.length);
        String monsterChoice = monsters[indexChooser];
        return monsterChoice;
    }
}
