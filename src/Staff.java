public interface Staff {
    public static void helpStudent(Student student) {

    }

    default void giveAdditionalMaterials() {
        System.out.println("Ознакомьтесь с материалами на Хабре: ...");
    }
}