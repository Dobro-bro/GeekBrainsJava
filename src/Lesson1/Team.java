package Lesson1;

public class Team {
    private String teamName;
    private Movable[] teamMates;
    private boolean result;

    public Team(String teamName, Movable... teamMates) {
        this.teamName = teamName;
        this.teamMates = teamMates;
    }

    public String getTeamName() {
        return teamName;
    }

    public Movable[] getTeamMates() {
        return teamMates;
    }

    public void showResult() {
        System.out.println("_________________________");

        for (Movable o : teamMates) {
            if (o.goNext()) {
                result = true;
            } else result = false;
        }
        System.out.println(getTeamName() + " team's result: " + result);
        System.out.println("_________________________");
    }

}