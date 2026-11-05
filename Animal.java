package Day2;

public class Animal {
    String name;
    int age;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
    


    public static void main(String[] args) {

       
        Dog dog = new Dog();
        dog.name = "Tommy";
        dog.age = 3;

        System.out.println("DOG DETAILS:");
        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println();

        
        Cat cat = new Cat();
        cat.name = "Kitty";
        cat.age = 2;

        System.out.println("CAT DETAILS:");
        System.out.println("Name: " + cat.name);
        System.out.println("Age: " + cat.age);
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}



