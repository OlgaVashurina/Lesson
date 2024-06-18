package lesson_25.linked_list;

public class MyLinkedList<T> {
    private int size;
    private Node<T> first; // голова - будет ссылатся на null
    private Node<T> last;  // хвост  будет ссылатся на null - поэтому конструктор не нужен


    // метод добавления элемента в конец списка
    public void add(T value) {
        if (first == null) {
            // не сущ не одного узла
            // создаем новый обьект и в ссылку ферст записываем ссылку на этот обьект
            first = new Node<>(value, null, null);
        } else if (last == null) {
            last = new Node<>(value, first, null);
            // следующая узел за ферст будет равен чему то
            first.next = last;
        } else {
            Node<T> temp = last;
            last = new Node<>(value, temp, null);
            temp.next = last;
        }
        size++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (first != null) {
            sb.append(first.value);
            Node<T> cursor = first.next;
            while (cursor != null) {
                sb.append(", ");
                sb.append(cursor.value);
                cursor = cursor.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }


    private class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;
        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
}
