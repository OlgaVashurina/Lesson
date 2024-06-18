package lesson_25.inner_classes;

public class OuterClass1 {
    private static int staticOuterfield = 42;
    private int instanceOuterField = 25;

    class InnerClass {
        void display() {
            System.out.println("Inside inner class");
            System.out.println("Static outer field: " + staticOuterfield);
            System.out.println("Instance outer field: " + instanceOuterField);
        }
    }
}
