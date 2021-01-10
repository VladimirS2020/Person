public class Student extends Person {
    private int tasksDoneByTheStudent;
    private static int tasksDoneByAllTheStudents;
    private Mentor mentor;
    private boolean allTheTasksAreDone;

    public Student(String name, int age, Mentor mentor, boolean allTheTasksAreDone) {
        super(name, age);
        this.mentor = mentor;
        this.allTheTasksAreDone = allTheTasksAreDone;
    }

    public void doTasks(int tasks, Task[] task) {
        if (allTheTasksAreDone) {
            System.out.println("Все задачи решены");
        } else {
            System.out.println("Не все задачи решены");
        }
    }

    // в задаче указано, что метод должен быть private, но чтобы из класса Person иметь доступ к этому методу,
    // я сделал этот метод public
    public void doTask(Task task) {
        while (true) {
            if (task instanceof Autochecked) {
                System.out.println("Задание выполнено");
                tasksDoneByTheStudent++;
                tasksDoneByAllTheStudents++;
                break;
            } else {
                checkTask(task); // как написать код, чтобы метод checkTask вызывался у конкретного ментора?
            }
        }
    }

    public int getTasksDoneByTheStudent() {
        return tasksDoneByTheStudent;
    }

    public void setTasksDoneByTheStudent(int tasksDoneByTheStudent) {
        this.tasksDoneByTheStudent = tasksDoneByTheStudent;
    }

    public int getTasksDoneByAllTheStudents() {
        return tasksDoneByAllTheStudents;
    }

    public void setTasksDoneByAllTheStudents(int tasksDoneByAllTheStudents) {
        this.tasksDoneByAllTheStudents = tasksDoneByAllTheStudents;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isAllTheTasksAreDone() {
        return allTheTasksAreDone;
    }

    public void setAllTheTasksAreDone(boolean allTheTasksAreDone) {
        this.allTheTasksAreDone = allTheTasksAreDone;
    }
}