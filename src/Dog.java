public class Dog extends Animal{


    @Override
    public void MakeSound() {
        System.out.println("WOOF WOOF");
    }

    @Override
    public boolean eatFood(String foodType) {
        return true;
    }

    @Override
    public String showMood(Boolean mood) {
        if (mood){
            System.out.println("logrer");}
        else if(!mood){
            System.out.println("knurrer");}

        return null;
    }

    @Override
    public void jumpFeature(double distance) {

    }
}
