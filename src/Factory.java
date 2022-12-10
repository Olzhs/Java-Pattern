//Factory примеру фабрика выпускающая однотипную продукцию
public class Factory {
    public static void main(String[] args){
    Facttory facttory = new Facttory();
    Caar mersedes = facttory.create("Mersedes");
    Caar nissan = facttory.create("Nissan");
    mersedes.drive();
    nissan.drive();
    }
}
interface Caar{
    void drive();
}
class Mersedes implements Caar{
    @Override
    public void drive() {
        System.out.println("Mersedes drive");
    }
}
class Nissan implements Caar{
    @Override
    public void drive() {
        System.out.println("Nissan drive");
    }
}
class Facttory{
    public Caar create(String typeOfCar){
        switch (typeOfCar){
            case "Mersedes": return new Mersedes();
            case "Nissan": return new Nissan();
            default: return null;

        }
    }
}