import java.util.ArrayList;

public class Home {
    ArrayList<Animal> list = new ArrayList<>();

    public void adoptPet(Animal a) {
        list.add(a);
    }
    public void makeAllSounds() {
        for (Animal pet: list) {
            pet.sounds();
        }
    }
}
