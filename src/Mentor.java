import java.util.Random;

public class Mentor extends Person {
    static boolean mood;
    Random random;

    // переменная mood в конструторе не определена. Нормально?
    public Mentor(String name, int age, boolean mood) {
        super(name, age);
    }

    public void helpStudent(Student student) {
        System.out.println("Приободряющее сообщение");
    }

    // ИДЕЯ пишет тут 1 related problem
    public boolean checkTask(Task task) {
        random = new Random();
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