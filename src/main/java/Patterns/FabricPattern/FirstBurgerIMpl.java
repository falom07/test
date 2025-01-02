package Patterns.FabricPattern;

public class FirstBurgerIMpl extends Restrourant{
    @Override
    Burger createBurger() {
        return new FirstBurger();
    }
}
