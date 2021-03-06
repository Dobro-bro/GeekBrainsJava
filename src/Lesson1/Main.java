package Lesson1;

/*
Author: Кудряшов Станислав.

1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий. Если участник не смог пройти одно из препятствий,
то дальше по списку он препятствий не идет.
4. Добавить класс Team, который будет содержать: название команды, массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать),
 метод для вывода информации о членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
5. Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод который будет просить команду пройти всю полосу;
 */
public class Main {
    public static void main(String[] args) {
        Course course = new Course(new Wall(1), new Track(500));
        Team team = new Team("First", new Robot("Ivan"), new Cat("Barsik"), new Human("Boris"), new Human("Oleg"));

        course.doIt(team);
        team.showResult();
    }
}
