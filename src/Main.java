public class Main {
    public static void main(String[] args) {
        Dog yorkie = new Dog();
        System.out.println(yorkie.genus); // prints "Canis", but even IntelliJ does not recommend this.
        System.out.println(Dog.genus); // prints "Canis", no warnings attached.
    }
}
