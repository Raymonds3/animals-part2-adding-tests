public class Cat extends Animal {
    private static String name = "Stormy";

    public Cat() {
        super(name);
    }

    public String sounds() {
        System.out.println("Meows");
        return "Meows";
    }
}
