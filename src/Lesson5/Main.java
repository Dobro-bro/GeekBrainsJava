package Lesson5;

/*
    Author: Kudriashov Stanislav
 */

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;


    public static void main(String[] args) {
        System.out.print("First method's time: ");
        methodOne();
        System.out.println("Second method's time: ");
        methodTwo();
    }

    public static void methodOne() {
        float[] array = new float[SIZE];
        Arrays.fill(array, 1);
        long startTime = System.currentTimeMillis();                // Start time

        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - startTime); // End time
    }

    public static void methodTwo(){
        float[] array = new float[SIZE];
        Arrays.fill(array, 1);
        float[] array1 = new float[HALF];
        float[] array2 = new float[HALF];
        long startTime = System.currentTimeMillis();                // Start time
        System.arraycopy(array,0,array1,0,HALF);
        System.arraycopy(array,0,array2,0,HALF);

        threadCalculate(array1);    // Thread 1
        threadCalculate(array2);    // Thread 2

        System.arraycopy(array1,0,array,0,HALF);
        System.arraycopy(array2,0,array,HALF,HALF);

        System.out.println(System.currentTimeMillis() - startTime); // End time
    }

    private static void threadCalculate(float[] array) {
        Thread thread = new Thread(()->{
            for (int i = 0; i < array.length; i++) {
                array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println("I'm in "+Thread.currentThread().getName());
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
