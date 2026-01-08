package assighment_2week_3_Functions;

public class assighment_2_3task {
    public static void main(String[] args) {
        String firstName = "Olga";
        String lastName = "Kipriyanovna";
        String favoriteDish = "Dumplings";
        printPersonInfo(firstName, lastName, favoriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("Brief Dossier:");
        System.out.println("Name: " + name);
        System.out.println("LastName: " + surname);
        System.out.println("Favorite dish: " + meal);
    }
}
