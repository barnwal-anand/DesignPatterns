
public class RedHeadDuck extends DuckSimulator{
    public RedHeadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Squeak();
    }

    public void display() {
        System.out.println("This is RedHead duck");
    }
}
