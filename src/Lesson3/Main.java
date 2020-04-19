package Lesson3;

/*
  Author: Kudriashov Stanislav

  1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
  Посчитать, сколько раз встречается каждое слово.
  2.Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
  В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
  Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] list = {"Hi","No", "Java","Python","SQL", "Android", "IOS", "Java", "Kotlin", "PHP", "C++", "IOS"};
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: list) {
            Integer count = map.get(word);
            map.put(word, count == null ? 1 : count + 1);
        }
        System.out.println(map);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Viktor","8888");
        phoneBook.add("Dimon","9999");
        phoneBook.add("Alex","7777");
        phoneBook.add("Dimon","5555");

        System.out.println(phoneBook.get("Dimon"));

    }
}
