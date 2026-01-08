package assighment_2week_3_Functions;
/*
Liverpool Four
*/
public class assighment_2_4task {
    public static void main(String[] args) {
        String navigator = "John";
        String pilot = "Gender";
        String secondPilot = "George";
        String flightEngineer = "Ringo";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
        System.out.println("The four to conquer space:");
        System.out.println("Navigator: " + navigator);
        System.out.println("Pilot: " + pilot);
        System.out.println("Co-pilot: " + secondPilot);
        System.out.println("Flight Engineer: " + flightEngineer);
    }
}
