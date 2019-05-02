package CoreJava;
import java.util.*;

import java.util.Arrays;

public class MultidimensionalArrays {

    public static void main(String[] args) {

        int[][] b = {{1, 5, -5}, {5, 8, 6}, {2,7,5}};
        int min = b[0][0];
        int mincolumn;



        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (min > b[i][j]) {
                   min = b[i][j];
//                   mincolumn = j;



                }




            }
        }




        System.out.println("max number is " + min);

    }
}

