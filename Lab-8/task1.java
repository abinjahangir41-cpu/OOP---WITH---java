class Animal {
    public void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        genericAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}