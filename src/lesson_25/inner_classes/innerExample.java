package lesson_25.inner_classes;

public class innerExample {
    public static void main(String[] args) {

        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();


        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerClass innerObject = outerClass1.new InnerClass();
        innerObject.display();

        OuterClass2 outerObject2 = new OuterClass2();
        outerObject2.myMethod();

    }
}
