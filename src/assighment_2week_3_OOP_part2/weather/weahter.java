package assighment_2week_3_OOP_part2.weather;

public class weahter {
    public static void showWeather(City city) {
        System.out.println("In the city of " + city.getName() + " today, the temperature is " + city.getTemperature());
    }

    public static void main(String[] args) {
        City dubai = new City("Dubai", 40);
        showWeather(dubai);
    }
}


