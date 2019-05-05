package java.CoreJava;

public class Constructors {

    public Constructors() {

        System.out.println("I am in the constructor");
        System.out.println("I am in the constructor 2");


    }

    public Constructors (int a, int b) {

        System.out.println("params are " + a + b);


    }

    public Constructors (String str) {

        System.out.println("I am " + str);
    }

    public void getData() {

        System.out.println("I am the method");
    }

    public static void main(String[] args) {

//        Constructors con = new Constructors();
        Constructors con2 = new Constructors(2, 7);
        Constructors con3 = new Constructors("Evgenia");

    }


}
