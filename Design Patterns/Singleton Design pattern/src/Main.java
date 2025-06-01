public class Main {
    public static void main(String[] args) {
        Car c1 = Car.getCar();
        Car c2 = Car.getCar();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}