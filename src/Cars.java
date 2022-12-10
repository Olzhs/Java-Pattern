import java.util.concurrent.ThreadPoolExecutor;

public class Cars {
    public static void main(String[] args){
        Ford ford = new FordAmerican();
        America america = new America();
        Hyndai hyndai = new World(ford);
        america.born(hyndai);

    }
}
interface Hyndai{
    void getPower();
}
class World implements Hyndai{
    Ford ford;

    public World(Ford ford) {
        this.ford = ford;
    }

    @Override
    public void getPower() {
        ford.getPower();
    }
}
interface Ford{
   void getPower();
}
 class FordAmerican implements Ford{
    public void getPower(){
        System.out.println("Перевозка только в Америку");
    }
 }
 class America{
    public void born(Hyndai hyndai){
        hyndai.getPower();
    }
 }