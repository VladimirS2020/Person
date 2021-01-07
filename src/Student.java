public class Student extends Person {
    private int tasksDoneByTheStudent;
    private int tasksDoneByAllTheStudents;
    private Mentor mentor;
    private boolean allTheTasksAreDone;

    // Конструтор для всех полей, кроме количества решенных задач (оно для каждого нового струдента равно 0)
    public Student(String name, int age, Mentor mentor, boolean allTheTasksAreDone) {

    }

    // метод "решить задачи". Здесь скорее всего требуется код написать как-то по-другому
    public void doTasks(int tasks, Task[] task) {
        if (allTheTasksAreDone) {
            System.out.println("Все задачи решены");
        } else {
            System.out.println("Не все задачи решены");
        }
    }

    // метод "решить задачу"
    private void doTask(Task task) {
        while (true) { // цикл while(true) скорее всего неверен. этим циклом я попытался предусмотреть, что задание отправляется до тех пор, пока оно не будет зачтено
            if () { // Не знаю, как прописать: "если задание проверяется автоматически"
                System.out.println("Задание выполнено");
                tasksDoneByTheStudent++;
                tasksDoneByAllTheStudents++;
            } else {
                Mentor.checkTask(task);
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