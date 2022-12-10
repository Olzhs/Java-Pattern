// Паттерен Build помогает тем что не нужно создовать кучу лишних конструкторов и путаться в них и задать точный параметры
public class Bulder {
    public static void main(String[] args){
        Car car =  new CarBuild().setModel("Hyndai Elantra").setYears(2022).setVolume(1.6).build();
        car.print();
    }
}
class Car {
    String model;
    int years;
    double volume;
    public void print(){
        System.out.println("Модель: " + model + "\nГод выпуска: " + years + "\nОбъем: " + volume);
    }
}
interface CarBulder{
    CarBulder setModel(String model);
    CarBulder setYears(int years);
    CarBulder setVolume(double volume);
    Car build();
}
class CarBuild implements CarBulder {
    Car car = new Car();
    @Override
    public CarBulder setModel(String model) {
        car.model = model;
        return this;
    }

    @Override
    public CarBulder setYears(int years) {
        car.years = years;
        return this;
    }

    @Override
    public CarBulder setVolume(double volume) {
        car.volume = volume;
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}