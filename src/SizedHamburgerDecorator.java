public class SizedHamburgerDecorator extends HamburgerDecorator{
    private BurgerSize size;

    public SizedHamburgerDecorator(Hamburger hamburger, BurgerSize size) {
        super(hamburger);
        this.size = size;
    }

    @Override
    public double getPrice() {
        double price = super.getPrice();
        switch (size) {
            case MEDIUM:
                price += 1.0;
                break;
            case LARGE:
                price += 2.0;
                break;
            // Small size has no additional cost
        }
        return price;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (" + size + ")";
    }
}
