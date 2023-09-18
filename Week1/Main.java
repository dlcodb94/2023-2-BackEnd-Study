class Cal implements Calculator {
    public int plus(int a, int b) { return a+b;};
    public int minus(int a, int b) { return a-b;};
    public int mul(int a, int b) { return a*b;};
    public  int div(int a, int b) { return a/b;};
}
class Cat extends Animal {
    public void speak(){ System.out.println("cat says Meow!"); }
}

class Dog extends Animal {
    public void speak(){ System.out.println("dog says Woof!"); }
}
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Cal();

        System.out.println("1234 + 4321 = " + calculator.plus(1234, 4321));
        System.out.println("911 - 170 = " + calculator.minus(911, 170));
        System.out.println("2 * 3 = " + calculator.mul(2, 3));
        System.out.println("33 / 11 = " + calculator.div(33, 11));

        System.out.println("\n");

        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}