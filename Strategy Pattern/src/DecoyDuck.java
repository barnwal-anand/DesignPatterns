
public class DecoyDuck extends DuckSimulator{
    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    public void display() {
        System.out.println("This is decoy duck");
    }
}
