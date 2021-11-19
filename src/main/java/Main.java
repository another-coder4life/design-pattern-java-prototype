public class Main {

    public static void main(String[] args) {
        Color redColor = new Color("Red");
        Color greenColor = new Color("Green");

        System.out.println(redColor);
        System.out.println(greenColor);

        Color redColorClone = redColor.clone();
        Color greenColorClone = greenColor.clone();

        System.out.println(redColorClone);
        System.out.println(greenColorClone);
    }

}
