public class MainProgram {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();    // -> 'Food'
        dog.sounds(); // -> 'Barks'

        Cat cat = new Cat();

        cat.eat();   //  -> 'Food'
        cat.sounds(); // -> 'Meows'
    }
}
