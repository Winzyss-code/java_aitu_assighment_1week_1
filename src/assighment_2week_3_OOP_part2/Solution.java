package assighment_2week_3_OOP_part2;

public class Solution {
    public static void main(String[] args) {
        String s1 = "JavaITU";
        // s1 = "JavaENU";
        String s2 = "JavaENU";
        // s2 = new String("JavaITU");
        String s3 = "JavaENU";
        s3 = "JavaITU";

        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
