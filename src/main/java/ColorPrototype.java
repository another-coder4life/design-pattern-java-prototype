public abstract class ColorPrototype {

    protected String name;

    @Override
    public String toString() {
        return "Color: " + name;
    }

    public abstract ColorPrototype clone();

}
