
public class MallardDuck extends DuckSimulator{
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("This is mallard duck");
    }
}
