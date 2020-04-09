package Lesson2;
/*
Author: Кудряшов Станислав
 */
/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось
(например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в как1ой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.

 */

public class Array {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            int result = arraySum(array);
            System.out.println(result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            //e.printStackTrace();
            System.out.println(e);
        }
    }

    public static int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        if (array.length != 4) throw new MyArraySizeException("The wrong size. It must be 4X4");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException("The wrong size. It must be 4X4");
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("The wrong array's element format in " + i + "X" + j);
                }
            }
        }
        return result;
    }
}
