package patterns.task12;

// Track.java (без изменений, для справки)
public class Track {
    private final int number;
    private int price;

    public Track(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
