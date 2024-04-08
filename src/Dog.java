public class Dog {
    static String genus = "Canis";
    private static String name;

    public Dog() {
    }

    public Dog(String name){
        Dog.name = name;
    }

    public void printName(){
        System.out.println("name = " + Dog.name);
    }
}
