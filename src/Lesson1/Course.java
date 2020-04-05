package Lesson1;

public class Course {
    private Let[] obstacles;

    public Course(Let... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        Movable[] players = team.getTeamMates();
        for (Movable o: players) {
            for (Let b: obstacles) {
                b.tryPass(o);
                if (!o.goNext()) break;
            }
        }
    }
}
