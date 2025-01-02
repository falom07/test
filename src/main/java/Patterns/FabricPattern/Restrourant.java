package Patterns.FabricPattern;

public abstract class Restrourant {
    public void orderBurger() {
        Burger burger = createBurger();
        burger.prepare();

    }
    abstract Burger createBurger();
}
