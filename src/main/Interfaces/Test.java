public class Test {
    public static void main(String[] args) {
        Animal1 animal1 = new Animal1(1);
        Person person1 = new Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}