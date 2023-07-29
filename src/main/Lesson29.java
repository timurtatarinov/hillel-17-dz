public class Lesson29 {

    public static void main(String[] args) {

        Animal1 animal = new Animal1();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

    }

    public static void test(Animal1 animal) {
        animal.eat();
    }

}