public class Cat extends Animal{
    @Override
    public void MakeSound() {
        System.out.println("meeeeeeeeeow");
    }

    @Override
    public boolean eatFood(String foodType) {
        return true;
    }

    @Override
    public String showMood(Boolean mood) {
        if (mood){
            System.out.println("spinder");}
        else if (!mood){
            System.out.println("hvæser");}
        return null;
        }
    }
