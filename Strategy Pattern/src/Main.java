/*
 *  In simpler terms, the Strategy Design Pattern provides a way to extract the behavior of an object
 *  into separate classes that can be swapped in and out at runtime.
 * This enables the object to be more flexible and reusable,
 * as different strategies can be easily added or modified without changing the object's core code.
 */

public class Main {
    public static void main(String[] args) {
        DuckSimulator mallardDuck = new MallardDuck();
        DuckSimulator decoyDuck = new DecoyDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        decoyDuck.setFlyBehaviour(new FlyWithWings());
        decoyDuck.performFly();
    }
}