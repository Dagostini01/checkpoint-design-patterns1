public class CheeseDecorator extends HamburgerDecorator {
    public CheeseDecorator(Hamburger hamburger) {
        super(hamburger);
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Queijo";
    }

}
