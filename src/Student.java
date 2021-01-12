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
            System.out.println("Все задачи решены"); // в задаче написано, что надо вернуть true. Я не вернул, поскольку метод void
        } else {
            System.out.println("Не все задачи решены");
            doTask(task[tasksDoneByTheStudent++]); // в задаче написано, что надо вернуть false. Я не вернул, поскольку метод void
        }
    }

    private void doTask(Task task) {
        while (true) {
            if (task instanceof Autochecked) {
                System.out.println("Задание выполнено");
                tasksDoneByTheStudent++;
                tasksDoneByAllTheStudents++;
                break;
            } else {
                mentor.checkTask(task);
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