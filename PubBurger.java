public class PubBurger extends Burger {
    String FancySauce;
    String FancyBun;

    public PubBurger() {
        super();
        FancySauce = "Mayo";
        FancyBun = "Whole-Grain";
    }
    // public PubBurger
    public String getFancySauce() {
        return FancySauce;
    }
    public void setFancySauce(String FancySauce) {
        this.FancySauce = FancySauce;
    }
    public String getFancyBun() {
        return FancyBun;
    }
    public void setFancyBun(String FancyBun) {
        this.FancyBun = FancyBun;
    }
    public float getPrice() {
        float price = super.getPrice();
        price += 2;
        return price;
    }
    public String toString() {
        return super.toString() + ", is a Pub Burger with " + FancySauce + " sauce, " + FancyBun + " bun";
    }
    public boolean equals(Object o) {
        if (o instanceof PubBurger) {
            PubBurger burger = (PubBurger) o;
            return super.equals(burger) && FancySauce.equals(burger.FancySauce) && FancyBun.equals(burger.FancyBun);
        }
        return false;
    }
}
