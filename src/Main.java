public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.MakeSound();
        cat.MakeSound();

        cat.eatFood("Tun");
        dog.eatFood("Hundekiks");

        cat.showMood(true);
        dog.showMood(false);
    }
}