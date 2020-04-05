package Lesson1;

public class Cat implements Movable {
    private String name;
    private int runRange;
    private int jumpRange;
    private boolean pass;

    public Cat(String name) {
        this.name = name;
        this.runRange = 200;
        this.jumpRange = 10;
    }
    @Override
    public void run(int range) {
        System.out.println("Cat " + name + " is running");
        if (runRange >= range) {
            System.out.println("Cat " + name + " passed it");
            pass = true;
        } else {
            System.out.println("Cat " + name + " failed");
            pass = false;
        }
    }

    @Override
    public void jump(int range) {
        System.out.println("Cat "+name+" is jumping");
        if (jumpRange >= range){
            System.out.println("Cat "+name+" passed it");
            pass = true;
        } else {
            System.out.println("Cat " + name + " failed");
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