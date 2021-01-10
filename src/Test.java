public class Test extends Task implements Autochecked {
    String[] answers;

    public Test(int number, String text, String[] answers) {
        super(number, text);
        answers = new String[]{"a", "b", "c"};
    }
}