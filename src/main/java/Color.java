public class Color extends ColorPrototype {

    public Color(String name) {
        this.name = name;
    }

    @Override
    public Color clone() {
        return new Color(this.name);
    }

}
