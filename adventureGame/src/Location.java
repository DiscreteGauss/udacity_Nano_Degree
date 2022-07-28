import java.util.Random;

public class Location {

    private String[] locations = {"Field", "Cave", "House", "Forest", "Castle", "Old Pier", "Grassy Knoll"};
    //private String[] usedLocation = {};

    public String getALocation(){
        Random random = new Random();
        int indexChooser = random.nextInt(locations.length);
        String choiceloc = locations[indexChooser];
        return choiceloc;
    }
}
