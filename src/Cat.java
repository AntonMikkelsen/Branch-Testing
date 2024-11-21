public class Cat extends Animal{
    @Override
    public void MakeSound() {
        System.out.println("meeeeeeeeeow");
    }

    @Override
    public boolean eatFood(String foodType) {
        return true;
    }
}
