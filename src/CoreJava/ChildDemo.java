package CoreJava;

public class ChildDemo extends ParentDemo {

    String name = "otinanai";

    public ChildDemo() {

        super();

        System.out.println("child constractor");


    }



    public void getStringData() {

        System.out.println(name);
        System.out.println(super.name);


    }

    public void getData() {

        System.out.println("I am in child class");
        super.getData();
    }

    public static void main(String[] args) {

        ChildDemo cd = new ChildDemo();

        cd.getStringData();
        cd.getData();

    }
}
