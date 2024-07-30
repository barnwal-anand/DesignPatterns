
public class DuckSimulator {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    DuckSimulator(){}

    DuckSimulator(FlyBehaviour fb, QuackBehaviour qb) {
        flyBehaviour = fb;
        quackBehaviour = qb;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void display() {
        System.out.println("This is Duck Simulator");
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
}
