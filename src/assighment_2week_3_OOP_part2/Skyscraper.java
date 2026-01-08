package assighment_2week_3_OOP_part2;

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Skyscraper is built. The number of floors - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Skyscraper is built. Developer - ";
    private int floorsCount;
    private String developer;

    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }


    public Skyscraper(int floors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    public Skyscraper(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public Skyscraper(int floorsCount, String developer) {

        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Unknown");

    }
}
