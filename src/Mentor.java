import java.util.Random;

public class Mentor extends Person {
    static boolean mood;
    Random random; // не уверен, что верно

    // Конструктор должен по умолчанию вызывать родительский конструктор и присваивать ментору хорошее настроение
    public Mentor(String name, int age, boolean mood) {
        super(name, age);
    }

    public void helpStudent(Student student) {
        System.out.println("Приободряющее сообщение");
    }

    // не уверен, что верно
    public static boolean checkTask(Task task) {
        Random random = new Random();
        random.nextInt();
        if (random.nextInt() > 1000) {
            mood = true;
            return true;
        } else {
            mood = false;
            System.out.println("Задача " + task + " не принимается");
            return false;
        }
    }
}