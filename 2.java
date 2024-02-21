public class Main {

    public static void main(String[] args) {
        
        Truk myCar = new Truk();

        
        myCar.m1();

        
        myCar.m2();

        
        System.out.println(myCar.toString());
    }

}

class Car {

    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }

}
class Truk extends Car {

    public void m1() {
        System.out.println("Truk 1");
    }
}
