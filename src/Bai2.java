class Animal {
    public void sound(){
        System.out.println("Tieng keu cua dong vat");
    }
}
class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("Gau Gau");
    }
}
class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println("Meo Meo");
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Dog chos = new Dog();
        Cat meof = new Cat();

        Animal sv = new Cat();

        chos.sound();
        meof.sound();
        sv.sound();
    }
}
