public class Dog extends Animal{


    @Override
    public void MakeSound() {
        System.out.println("WOOF WOOF");
    }

    @Override
    public boolean eatFood(String foodType) {
        return true;
    }
}
