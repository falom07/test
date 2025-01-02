package Patterns.FabricPattern;

public class SecondBurgerIMpl extends Restrourant{
        @Override
        Burger createBurger() {
            return new FirstBurger();
}
}
