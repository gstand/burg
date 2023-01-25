public class Burger {
    boolean ketchup;
    boolean lettuce;
    boolean tomato;
    boolean cheese;
    int patties;

    public Burger() {
        ketchup = false;
        lettuce = false;
        tomato = false;
        cheese = false;
        patties = 1;
    }
    public boolean getKetchup() {
        return ketchup;
    }
    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }
    public boolean getLettuce() {
        return lettuce;
    }
    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }
    public boolean getTomato() {
        return tomato;
    }
    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }
    public boolean getCheese() {
        return cheese;
    }
    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }
    public int getPatties() {
        return patties;
    }
    public void setPatties(int patties) {
        if (patties > 3) {
            throw new IllegalArgumentException("Too many patties");
        }
        this.patties = patties;
    }
    public float getPrice() {
        float price = 4;
        if (tomato) {
            price += .25;
        }
        if (cheese) {
            price += .50;
        }
        price += patties - 1;
        return price;
    }
    public String toString() {
        return "Burger with " + patties + (patties > 1 ? " patties" : " patty") + (tomato ? ", tomato" : "") + (cheese ? ", cheese" : "") + (ketchup ? ", ketchup" : "") + (lettuce ? ", lettuce" : "");
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Burger)) {
            return false;
        }
        Burger burger = (Burger) obj;
        return burger.getKetchup() == ketchup && burger.getLettuce() == lettuce && burger.getTomato() == tomato && burger.getCheese() == cheese && burger.getPatties() == patties;
    }
}