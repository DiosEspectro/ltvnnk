package lr11.n4;

public class Node {
    public int value; // значение
    public Node next; // поле-ссылка (указатель) на следующий узел

    Node(int value, Node next){ // конструктор класса
        this.value = value;
        this.next = next;
    }
}