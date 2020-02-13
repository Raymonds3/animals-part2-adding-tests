public class Dog extends Animal {
    private static String name = "Rax";

    public Dog() {
        super(name);
    }

    public String sounds() {
        System.out.println("Barks");
        return "Barks";
    }
}
