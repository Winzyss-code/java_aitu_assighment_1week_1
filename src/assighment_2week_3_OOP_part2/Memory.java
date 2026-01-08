package assighment_2week_3_OOP_part2;
import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int writeIndex = 0;

        // Move all non-null elements to the beginning
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[writeIndex] = array[i];
                writeIndex++;
            }
        }

        // Fill the rest with nulls
        for (int i = writeIndex; i < array.length; i++) {
            array[i] = null;
        }
    }
}
