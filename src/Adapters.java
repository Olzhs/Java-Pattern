// Патеррен Adapter совмещает некоторые интерфейсы которые по сути не совместимы и взаймодействовать между собо
public class Adapters {
    public static void main(String[] args){
        AmericanSocKet socKet = new SimpleAmericanSocket();
        Radio radio = new Radio();
        EuroSocKet euroSocKet = new SocketAdapter(socKet);
        radio.listenMusic(euroSocKet);
    }
}
interface EuroSocKet{
    void getPower();
}
class SocketAdapter implements EuroSocKet{
    AmericanSocKet americanSocKet;

    public SocketAdapter(AmericanSocKet americanSocKet) {
        this.americanSocKet = americanSocKet;
    }

    @Override
    public void getPower() {
        americanSocKet.getPower();

    }
}
interface AmericanSocKet{
    void getPower();
}
class SimpleAmericanSocket implements AmericanSocKet{

    @Override
    public void getPower() {
        System.out.println("American 110 volt");
    }
}
class Radio{
    public void listenMusic(EuroSocKet euroSocKet){
        euroSocKet.getPower();
    }
}
