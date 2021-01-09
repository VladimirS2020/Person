public interface Staff {
    void helpStudent(Student student) { // убрал операторы public и static. ИДЕЯ теперь пишет:
        // "Interface abstract methods cannot have body" и подчеркивает строку красным

    }

    default void giveAdditionalMaterials() {
        System.out.println("Ознакомьтесь с материалами на Хабре: ...");
    }
}