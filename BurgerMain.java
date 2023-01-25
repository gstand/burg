public class BurgerMain {
    public static void main(String[] args){
        System.out.println("Burger demo");
        Burger burger = new Burger();
        System.out.println("Initial burger: " + burger);
        System.out.println("Price: " + burger.getPrice());
        burger.setCheese(true);
        burger.setTomato(true);
        burger.setPatties(3);
        System.out.println("Loaded burger: " + burger);
        System.out.println("Price: " + burger.getPrice());
        PubBurger pubBurger = new PubBurger();
        System.out.println("Initial pub burger: " + pubBurger);
        System.out.println("Price: " + pubBurger.getPrice());
        pubBurger.setCheese(true);
        pubBurger.setTomato(true);
        pubBurger.setPatties(3);
        pubBurger.setFancyBun("Sesame");
        pubBurger.setFancySauce("Mustard");
        System.out.println("Loaded pub burger: " + pubBurger);
        System.out.println("Price: " + pubBurger.getPrice());
        System.out.println("pubBurger equals burger: " + pubBurger.equals(burger));
        PubBurger loadedBurger2 = new PubBurger();
        loadedBurger2.setCheese(true);
        loadedBurger2.setTomato(true);
        loadedBurger2.setPatties(3);
        loadedBurger2.setFancyBun("Sesame");
        loadedBurger2.setFancySauce("Mustard");
        System.out.println("Loaded pub burger 2: " + loadedBurger2);
        System.out.println("pubBurger equals loadedBurger2: " + pubBurger.equals(loadedBurger2));
        Burger burger2 = new Burger();
        burger2.setCheese(true);
        burger2.setTomato(true);
        burger2.setPatties(3);
        System.out.println("Loaded burger 2: " + burger2);
        System.out.println("burger equals burger2: " + burger.equals(burger2));

    }
}
