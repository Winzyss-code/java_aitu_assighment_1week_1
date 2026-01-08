package assighment_2week_3_Functions;

import java.util.Arrays;

public class assighment_2_11task {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String sqrtText = "The square root for the number ";
        Arrays.stream(array).forEach(element -> {
            double elementSqrt = Math.sqrt(element);
            System.out.println(sqrtText + element + " equals " + elementSqrt);
        });
    }
}
