public class DragAndDrop extends Task implements Autochecked {
    String[][] options;

    // Конструтор по умолчанию вызывает конструтор родителя и массиву
    // присваивает ссылку на новый двумерный массив, заполненный значениями по вашему усмотрению
    public DragAndDrop(int number, String text, String[][] options) {
        super(number, text);
        options = {{"aa", "ab", "ac"}, {"ba", "bb", "bc"}}; // аналогично ИДЕЯ пишет, что инициализация массива здесь невозможна и подчеркивает красным
    }
}