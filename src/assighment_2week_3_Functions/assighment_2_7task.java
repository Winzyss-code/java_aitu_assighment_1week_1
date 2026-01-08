package assighment_2week_3_Functions;

public class assighment_2_7task {
    public static void main(String[] args) {
    }

    public static void signIn(String username){
        if (username.equals("user")) {
            return;
        }
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
