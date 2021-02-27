package Program;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private  ZooKeeper zooKeeper;
    private List<Animal> animals;

    public Zoo() {
        this.animals=new ArrayList<>();
        this.zooKeeper= new ZooKeeper("Gica");
    }

    public Zoo(ZooKeeper zooKeeper, List<Animal> animals) {
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }

    public void addAnimal(Animal animal)
    {
        this.animals.add(animal);
    }

    public void feedAllAnimal(){
        for(Animal a: animals){
            zooKeeper.feed(a);
        }
    }


}
