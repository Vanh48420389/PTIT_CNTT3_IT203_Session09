class Animals {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogs extends Animals {
    @Override
    public void sound() {
        System.out.println("Dog barks: Go Go");
    }

    public void watchHouse() {
        System.out.println("Dog is watching the house");
    }
}

public class Bai4 {
    public static void main(String[] args) {

        Animals animal = new Dogs();

        animal.sound();

        if (animal instanceof Dogs) {
            Dogs myDog = (Dogs) animal;

            myDog.watchHouse();
        } else {
            System.out.println("Không phải là chó, không thể trông nhà.");
        }
    }
}