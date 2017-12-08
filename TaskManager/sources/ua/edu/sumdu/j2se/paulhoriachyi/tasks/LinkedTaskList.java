package ua.edu.sumdu.j2se.paulhoriachyi.tasks;

public class LinkedTaskList<T> extends TaskList implements Iterable<Object> {

    Node<Task> head;
    Node<Task> tail;

    int size = 0;

    public LinkedTaskList() {
        head = new Node<Task>(null, null, tail);
        tail = new Node<Task>(null, head, null);
    }

    public void add(Task e) {

        if(head.getNext() == null) {
            Node<Task> prev;
            prev = tail;
            head.setNext(prev);
            prev.setItem(e);
            tail = new Node<Task>(null, prev, null);
            prev.setNext(tail);
            
        } else {
            Node<Task> prev;
            prev = tail;
            prev.setItem(e);
            tail = new Node<Task>(null, prev, null);
            prev.setNext(tail);
            
        }
        size++;
    }


    @Override
    public boolean remove(Task task) {

        Node<Task> target = head.getNext();

        //System.out.println("it is a task " + task.item);
        while(target != tail){
            System.out.println(target);
            if (target.item.equals(task)) {
                if (target.getNext() == tail) {
                    Node<Task> prev = target.getPrev();
                    tail.setPrev(prev);
                    prev.setNext(tail);
                    size--;
                    return true;
                } else {
                    Node<Task> prev = target.getPrev();
                    Node<Task> next = target.getNext();
                    prev.setNext(next);
                    next.setPrev(prev);
                    size--;
                    return true;
                }   
            }
            target = getNextElement(target);
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public Task getTask(int index) {

        if (index >= size()) {
            System.err.println("Index is out of List range");
            throw new NullPointerException();
        }

        Node<Task> target = head.getNext();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getItem();
    }


    Node<Task> getNextElement(Node<Task> element) {
        return element.getNext();
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node (T element, Node<T> prev, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        public T getItem () { return item; }

        public void setItem(T item) { this.item = item; }

        public void setNext(Node<T> next) { this.next = next; }

        public void setPrev(Node<T> prev) { this.prev = prev; }

        public Node<T> getNext() { return next; }

        public Node<T> getPrev() { return prev; }
    }
}
