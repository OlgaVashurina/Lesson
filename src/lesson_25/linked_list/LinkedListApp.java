package lesson_25.linked_list;

public class LinkedListApp {
    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        System.out.println(linkedList);
        linkedList.add(0);
        System.out.println(linkedList);

        linkedList.add(1);
        System.out.println(linkedList);

        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        MyLinkedList<String> stringList = new MyLinkedList<>();
        stringList.add("Java");
        System.out.println(stringList);

        stringList.add("2");
        System.out.println(stringList);
        stringList.add("Бегемот");
        System.out.println(stringList);






    }
}
