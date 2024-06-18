package lesson_25.inner_classes;

public class OuterClass {
    private static int staticOuterfield = 42;
    private int instanceOuterField = 25;

    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class");
            System.out.println("Static outer field" + staticOuterfield);
          //ERROR нет доступа к не статике  System.out.println("Instance outer field " + instanceOuterField);
        }
    }
}
