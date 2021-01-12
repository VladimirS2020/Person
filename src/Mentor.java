import java.util.Random;

public class Mentor extends Person {
    boolean mood;
    Random random;

    public Mentor(String name, int age, boolean mood) {
        super(name, age);
        this.mood = mood;
    }

    public void helpStudent(Student student) {
        System.out.println("Приободряющее сообщение");
    }

    public boolean checkTask(Task task) {
        random = new Random();
        random.nextInt();
        if (random.nextInt() > 1000) {
            mood = true;
            System.out.println("Задача " + task + " решена правильно. Принимается");
            return true;
        } else {
            mood = false;
            System.out.println("Задача " + task + " не принимается");
            return false;
        }
    }
}