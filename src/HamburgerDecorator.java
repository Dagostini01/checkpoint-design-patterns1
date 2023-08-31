public abstract class HamburgerDecorator implements Hamburger {
    protected Hamburger decoratedHamburger;

    public HamburgerDecorator(Hamburger hamburger) {
        this.decoratedHamburger = hamburger;
    }

    @Override
    public double getPrice() {
        return decoratedHamburger.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratedHamburger.getDescription();
    }
}
