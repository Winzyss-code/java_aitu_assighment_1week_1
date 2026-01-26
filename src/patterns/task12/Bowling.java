package patterns.task12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class Bowling {
    private final Queue<Track> tracks = new LinkedList<>();
    private final Queue<PairOfShoes> shoesShelf = new LinkedList<>();

    public Bowling(int tracksNumber) {
        // Заполняем очередь дорожек
        for (int i = 1; i <= tracksNumber; i++) {
            tracks.add(new Track(i));
        }

        // Заполняем очередь обуви (50 пар, размеры от 38 до 45)
        for (int i = 0; i < 50; i++) {
            int size = 38 + (i % 8); // Размеры от 38 до 45
            shoesShelf.add(new PairOfShoes(size));
        }
    }

    public synchronized Track acquireTrack() {
        Track track = tracks.poll();
        if (track != null) {
            int price = 100 - tracks.size() * 10;
            track.setPrice(price);
        }
        return track;
    }

    public synchronized void releaseTrack(Track track) {
        System.out.printf("С дорожки №%d сняли бронь\n", track.getNumber());
        tracks.add(track);
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        if (shoesShelf.size() < number) {
            return null;
        }

        Set<PairOfShoes> shoes = new HashSet<>();
        for (int i = 0; i < number; i++) {
            shoes.add(shoesShelf.poll());
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        System.out.printf("В гардероб вернули %d пар обуви\n", shoes.size());
        shoesShelf.addAll(shoes);
    }
}
