package Program;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feed(Animal animal){
        System.out.println(this.name+ " feeds " + animal.getName());
    }
}
