package Patterns.FabricPattern;

public class Main {
    public static void main(String[] args) {
        orderBurger("first");
    }
    public static void orderBurger(String order) {
        Restrourant restrourant = null;
        if(order.equals("first")) {
             restrourant = new FirstBurgerIMpl();
        }else if(order.equals("second")) {
             restrourant = new SecondBurgerIMpl();
        }
        restrourant.orderBurger();
        System.out.println("Your order ready");
    }
}
