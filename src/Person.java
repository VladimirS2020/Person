import java.util.Random;

public class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Task[] task = new Task[40];
        for (int i = 0; i < task.length; i++) {
            task[i] = new Task[] (i, "A"); // поскольку в конструкторе Task содержатся переменные int number, String text,
            // я подумал, что как-то так надо определить эти переменные в массиве. Но судя по всему, что-то я сделал неправильно...
            // Не пойму, как в цикле заполнить массив, если это не интовый массив
        }

        Mentor Nikita = new Mentor("Nikita", 25, true);
        Mentor Vasya = new Mentor("Vasya", 29, true);
        Mentor Petya = new Mentor("Petya", 30, true);

        Student[] student = new Student[12];
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student("Alex", 21 + i, Nikita, false); // Можно ли как-то
            // В ЦИКЛЕ заполнить массив студентов так, чтобы не у всех были одинаковые имя, ментор и инфа о решенных задачах?
        }

        Random random = new Random();

        for (int i = 0; i < random.nextInt(50); i++) { // Рандомно выбераем количество задач, которые необходимо решить
            for (int s = 0; s < student.length - 1; s++) {
                Student.doTask(); // не знаю, как здесь написать
            }
        }
    }
}