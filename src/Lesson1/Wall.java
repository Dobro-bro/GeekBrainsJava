package Lesson1;

public class Wall implements Let {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void tryPass(Movable players) {
        players.jump(height);
    }
}
