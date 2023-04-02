package lr11.n8;

public class Node {
    public int value; // значение
    public Node next; // поле-ссылка (указатель) на следующий узел

    Node(int value, Node next){ // конструктор класса
        this.value = value;
        this.next = next;
    }

    public void createHead(Integer value){
        Node newNode = new Node(this.value, this.next);
        this.value = value;
        this.next = newNode;
    }

    public void createTail(Integer value){
        // создается новый элемент со значением 123 – будущий хвост
        Node newTail = new Node(value, null);

        // для перемещения по списку используется вспомогательная переменная ref,
        // которой в качестве начальной ссылки передается указатель на «голову»
        Node ref = this;
        while (ref.next != null) { // пока не последний элемент
            ref = ref.next;
        }

        // указателю последнего элемента присваиваем новый «хвост» (элемент)
        ref.next = newTail;
    }

    public String toString(){
        String ret = "";

        Node ref = this;

        do{ // пока не последний элемент
            ret += ref.value + " ";
            ref = ref.next;
        } while (ref != null);

        return ret;
    }

    public void AddFirst(int value){
        // Не очень понял, чем должен отличаться данный метод от createHead
        createHead(value);
    }

    public void AddLast(int value){
        // Не очень понял, чем должен отличаться данный метод от createTail
        createTail(value);
    }

    public void Insert(int pos, int value){
        // создается новый элемент со значением 44 – для вставки
        Node newNode = new Node(value, null);

        Node ref = this;    // используем временную переменную
        int k=1;   // счетчик элементов

        // поиск нужного положения узла для вставки
        while (ref.next!= null && (k < pos)) {
            ref = ref.next;
            k++;
        }

        // переброска ссылок при вставке элемента
        //newNode.next=ref.next.next;
        //ref.next=newNode;
        newNode.next = ref.next;
        ref.next = newNode;
    }

    public void RemoveFirst(){
        Node newHead = this.next;
        this.value = newHead.value;
        this.next = newHead.next;
        newHead.next = null;
    }

    public void RemoveLast(){
        // создаем вспомогательную переменную
        Node ref = this;
        // перемещаемся на предпоследний элемент
        while (ref.next.next != null) {
            ref = ref.next;
        }
        // полю next предпоследнего элемента присваиваем null
        ref.next=null;
    }

    public void Remove(int pos){
        Node ref = this; // создаем вспомогательную переменную
        int k = 1;

        // поиск положения узла, предшествующего удаляемому
        while (ref.next != null && (k < pos)) {
            ref = ref.next;
            k++;
        }
        // переброска ссылки для исключения ненужного элемента из списка
        ref.next = ref.next.next;
    }
}
