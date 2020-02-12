import java.util.ArrayList;

public class Home {

    ArrayList<Animal> array= new ArrayList<>();

    public void adoptPet(Animal animal){

        array.add(animal);
    }

    public void makeAllSounds(){
        for(Animal animal:array){
            System.out.println(animal.sounds());
        }
    }
}
