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

        Task[] task = new Task[15];
        for (int i = 0; i < task.length; i++) {
            Test[] test = new Test[5];
            for (int j = 0; j < 4; j++) {
                test[j] = new Test(j + 1, "testText", new String[j]);
            }
            DragAndDrop[] dragAndDrop = new DragAndDrop[5];
            for (int j = 0; j < 4; j++) {
                dragAndDrop[j] = new DragAndDrop(j + test.length + 1, "dragAndDropText", new String[j + 1][j + 1]);
            }
            Code[] code = new Code[5];
            for (int j = 0; j < 4; j++) {
                code[j] = new Code(j + test.length + dragAndDrop.length + 1, "codeText", "codeTest");
            }
        }

        Mentor Nikita = new Mentor("Nikita", 25, true);
        Mentor Vasya = new Mentor("Vasya", 29, true);
        Mentor Petya = new Mentor("Petya", 30, true);

        Mentor[] mentors = new Mentor[3];
        mentors[0] = Nikita;
        mentors[1] = Vasya;
        mentors[2] = Petya;

        String[] names = new String[6];
        names[0] = "Viktor";
        names[1] = "Oleg";
        names[2] = "Pavel";
        names[3] = "Kolya";
        names[4] = "Nina";
        names[5] = "Sveta";

        Random random = new Random();

        Student[] student = new Student[12];
        for (int i = 0; i < student.length; i++) {
            int minForNames = 0;
            int maxForNames = 5;
            int diffForNames = maxForNames - minForNames;
            int minForAge = 21;
            int maxForAge = 49;
            int diffForAge = maxForAge - minForAge;
            int minForMentors = 0;
            int maxForMentors = 2;
            int diffForMentors = maxForMentors - minForMentors;
            student[i] = new Student(names[random.nextInt(diffForNames + 1)], random.nextInt(diffForAge + 1), mentors[random.nextInt(diffForMentors + 1)], false);
        }

        for (int i = 0; i < random.nextInt(15); i++) {
            for (int s = 0; s < student.length - 1; s++) {
                student[s].doTasks(i, task); // метод doTask заменил на метод doTasks
            } // цикл получается бесконечным: работа не завершается
        }
    }
}