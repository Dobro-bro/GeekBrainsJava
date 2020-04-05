package Lesson1;

public class Robot implements Movable {
    private String name;
    private int runRange;
    private int jumpRange;
    private boolean pass;

    public Robot(String name) {
        this.name = name;
        this.runRange = 50000;
        this.jumpRange = 5;
    }

    @Override
    public void run(int range) {
        System.out.println("Robot " + name + " is running");
        if (runRange >= range) {
            System.out.println("Robot " + name + " passed it");
            pass = true;
        } else {
            System.out.println("Robot " + name + " failed");
            pass = false;
        }
    }

    @Override
    public void jump(int range) {
        System.out.println("Robot " + name + " is jumping");
        if (jumpRange >= range) {
            System.out.println("Robot " + name + " passed it");
            pass = true;
        } else {
            System.out.println("Robot " + name + " failed");
            pass = false;
        }
    }

    @Override
    public boolean goNext() {
        return pass;
    }

    @Override
    public void info() {
        System.out.println(name + " " + pass);
    }
}