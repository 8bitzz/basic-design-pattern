public class Main {
    public static void main(String[] args) {
        System.out.println( "Singleton Design Pattern!" );
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println("Hashcode of x is " + x.hashCode());
        System.out.println("Hashcode of y is " + y.hashCode());
        System.out.println("Hashcode of z is " + z.hashCode());

        if (x == y && y == z) {
            System.out.println("Three object point to the same memory location");
        } else {
            System.out.println("Three object DO NOT point to the same memory location");
        }
    }
}