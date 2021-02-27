package Program;

public class main {
    public static void main(String[] args){
        Zoo zoo=new Zoo();
        Lup l1= new Lup("Lup1");
        Lup l2= new Lup("Lup2");

        zoo.addAnimal(l1);
        zoo.addAnimal(l2);

        zoo.feedAllAnimal();
    }
}
