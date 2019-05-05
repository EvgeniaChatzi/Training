package java.CoreJava;

public class ThisDemo {

    int a = 2;

    public void getData() {

        int a = 3;

        System.out.println(a);
        System.out.println(this.a);
        System.out.println(a + this.a);


    }



    public static void main(String[] args) {

        ThisDemo d = new ThisDemo();
        d.getData();




    }
}
