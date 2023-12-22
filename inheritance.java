public class inheritance {
    public static void main(String args[]) {
        Fish fish1 = new Fish();
        fish1.eats();
        fish1.name="Shark";
        System.out.println(fish1.name);
    
    }
}

class Animal {
    String name;

    void Skin() {
        System.out.print("Eats");
    }

    void eats() {
        System.out.println("It eats");
    }
}

class Fish extends Animal {
    String fins;

    void Swim() {
        System.out.println("It swims");
    }
}
