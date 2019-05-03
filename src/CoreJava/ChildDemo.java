package CoreJava;

public class ChildDemo extends ParentDemo {

    String name = "otinanai";



    public void getStringData() {

        System.out.println(name);
        System.out.println(super.name);


    }

    public static void main(String[] args) {

        ChildDemo cd = new ChildDemo();

        cd.getStringData();

    }
}
