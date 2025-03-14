class Animal {
    String name;
    int age;

    //Constructor
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void makeSound(){
        System.out.println(name+" makes the sound!!");
    }

}
//Subclass
class Dog extends Animal{

    Dog(String name, int age){
        super(name,age);
    }

    void makeSound(){
        System.out.println(name+" barks: Woof!");
    }
}
//Subclass
class Cat extends Animal{

    Cat(String name, int age){
        super(name,age);
    }

    void makeSound(){
        System.out.println(name+" meows: Meow!");
    }
}
//Subclass
class Bird extends Animal{

    Bird(String name, int age){
        super(name,age);
    }

    void makeSound(){
        System.out.println(name+" chirps: Tweet!");
    }
}

public class Voice{
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy", 3);
        Animal myCat = new Cat("Whiskers", 2);
        Animal myBird = new Bird("Tweety",1);

        myDog.makeSound();
        myCat.makeSound();
        myBird.makeSound();
    }
}



