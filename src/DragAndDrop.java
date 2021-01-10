public class DragAndDrop extends Task implements Autochecked {
    String[][] options;

    public DragAndDrop(int number, String text, String[][] options) {
        super(number, text);
        options = new String[][]{{"aa", "ab", "ac"}, {"ba", "bb", "bc"}};
    }
}