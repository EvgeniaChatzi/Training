package CoreJava;

public class ExceptionDemo {






    public static void main(String[] args) {

        int a = 4;

        int b = 0;


        try {

            int k = a/b;

            System.out.println(k);


        } catch(ArithmeticException c){

            System.out.println("catched the arithmetic one");
        }

        catch (Exception e) {

            System.out.println("error!!");


        }

        finally {

            System.out.println("i am the final");

        }

//        ExceptionDemo ex = new ExceptionDemo();


    }
}
