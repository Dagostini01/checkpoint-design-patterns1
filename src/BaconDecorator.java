public class BaconDecorator extends HamburgerDecorator  {
    public BaconDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Bacon";
    }
}
