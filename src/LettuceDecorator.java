public class LettuceDecorator extends HamburgerDecorator{
    public LettuceDecorator(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Alface";
    }
}
