public class Example {
    public static void main(String[] args) {
        System.out.println(Dog.genus);

        Dog rex = new Dog("Rex");
        Dog fluffy = new Dog("Fluffy");

        rex.printName();
        fluffy.printName();

    }
}
