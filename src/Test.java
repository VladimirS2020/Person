public class Test extends Task implements Autochecked {
    String[] answers;

    // Конструтор по умолчанию вызывает конструтор родителя и массиву присваивает ссылку на массив {"a", "b", "c"}
    public Test(int number, String text, String[] answers) {
        super(number, text);
        answers = {"a", "b", "c"};
    }
}