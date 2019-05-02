package CoreJava;

public class ReverseDemo {


    public static void main(String[] args) {

//        String s = "Evgenia";
//
//        for (int i = s.length()-1; i>=0; i--){
//
//            System.out.println(s.charAt(i));
//
//        }

        String string="whatever";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);




    }


}
