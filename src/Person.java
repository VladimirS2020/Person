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

        Test[] test = new Test[40]; // ИДЕЯ выдавала ошибку и писала: "'Task' is abstract; cannot be initialized",
        for (int i = 0; i < test.length; i++) { // поэтому я заменил массив с заданиями (Task) на массив с тестами (Test).
            test[i] = new Test(i, "A", Test.answers); // Здесь ИДЕЯ выдает ошибку: "Non-static field 'answers' cannot be referenced from a static context".
            // Но не делать же answers статичным
        }

        DragAndDrop[] dragAndDrop = new DragAndDrop[40];
        for (int i = 0; i < dragAndDrop.length; i++) {
            dragAndDrop[i] = new DragAndDrop(i, "A", DragAndDrop.options);// ИДЕЯ выдает ошибку: "Non-static field 'answers' cannot be referenced from a static context".
            // Но не делать же options статичным
        }

        Code[] code = new Code[40];
        for (int i = 0; i < code.length; i++) {
            code[i] = new Code(i, "A", Code.code); // ИДЕЯ выдает ошибку: "Non-static field 'answers' cannot be referenced from a static context".
            // Но не делать же code статичным
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

        for (int i = 0; i < random.nextInt(50); i++) {
            for (int s = 0; s < student.length - 1; s++) {
                student[s].doTask(test[i]); // Поскольку выше я заменил массив с заданиями (Task) на массив с тестами (Test),
                // то теперь переменная task не видна из этого цикла.
                // Я ведь могу заменить task на test, учитывая, что Test наследуется от Task? В этом случае метод doTask()
                // будет принимать на вход поле test(при том, что этот метод записан вот так: public void doTask(Task task))?
            }
        }
    }
}