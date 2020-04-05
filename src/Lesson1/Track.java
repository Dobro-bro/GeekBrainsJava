package Lesson1;

public class Track implements Let {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    @Override
    public void tryPass(Movable players) {
        players.run(distance);
    }
}
