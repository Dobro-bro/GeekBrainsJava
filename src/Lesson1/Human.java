package Lesson1;

public class Human implements Movable {
    private String name;
    private int runRange;
    private int jumpRange;
    private boolean pass;

    public Human(String name) {
        this.name = name;
        this.runRange = 10000;
        this.jumpRange = 2;
    }
    @Override
    public void run(int range) {
        System.out.println("Human " + name + " is running");
        if (runRange >= range) {
            System.out.println("Human " + name + " passed it");
            pass = true;
        } else {
            System.out.println("Human " + name + " failed");
            pass = false;
        }
    }

    @Override
    public void jump(int range) {
        System.out.println("Human "+name+" is jumping");
        if (jumpRange >= range){
            System.out.println("Human "+name+" passed it");
            pass = true;
        } else {
            System.out.println("Human " + name + " failed");
            pass = false;
        }
    }

    @Override
    public boolean goNext() {
        return pass;
    }

    @Override
    public void info() {
        System.out.println(name+" "+pass);
    }
}
