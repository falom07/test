package Patterns.FabricPattern;

public class SecondBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing SecondBurger");
    }
}
