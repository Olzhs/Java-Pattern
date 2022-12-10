//Мост — это структурный паттерн проектирования, который разделяет один или несколько классов на две отдельные иерархии —
// абстракцию и реализацию, позволяя изменять их независимо друг от друга.
public class Brige {
    public static void main(String[] args){
    Vehicle vehicle = new Carss(new Toyota());
    vehicle.drive();
    Vehicle vehicle1 = new Track(new Audi());
    vehicle1.drive();
    }
}
abstract class Vehicle{
    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}
class Carss extends Vehicle{
    public Carss(Model model) {
        super(model);
    }
    @Override
    void drive() {
        model.drive("drive car");
    }
}
class Track extends Vehicle{
    public Track(Model model) {
        super(model);
    }
    @Override
    void drive() {
        model.drive("drive track");
    }
}
interface Model{
    void drive(String str);
}
class Audi implements Model{
    @Override
    public void drive(String str) {
        System.out.println(str + " Audi");
    }
}
class Toyota implements Model{
    @Override
    public void drive(String str) {
        System.out.println(str + " Toyota");
    }
}
