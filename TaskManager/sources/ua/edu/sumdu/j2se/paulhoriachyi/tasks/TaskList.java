package ua.edu.sumdu.j2se.paulhoriachyi.tasks;

import java.util.Iterator;

public abstract class TaskList implements Iterable<Object>, Cloneable {

    int defaultSize = 10;
    int interSize;
    int size = 0;
    int modCount = 0;

    Task[] defaultObj = new Task[defaultSize];

    public void add(Task task) throws Exception { }

    abstract boolean remove(Task element);

    public int size() { return this.size; }

    abstract Task getTask(int index);

    public TaskList incoming(int from, int to) throws Exception {
        TaskList listData = ((modCount > 0) ? new ArrayTaskList() : new LinkedTaskList()) ;
        if (from < 0 || to < 0) {
            System.err.print("You have entered wrong numbers. They should not be a negative !\n");
            return listData;
        } else {
            for (int i = 0; i < size(); i++) {
                if ( getTask(i).nextTimeAfter(from) != -1 && to >= getTask(i).nextTimeAfter(from)) {
                    listData.add(getTask(i));
                    //System.out.println(getTask(i));
                }
            }
            return listData;
        }
    }

    public Iterator iterator() {
        return new Iterator(){
            private int cursor = 0;
            private int lastRet = -1;

            public boolean hasNext() { return cursor < size();}

            public Task next() {
                if(!hasNext())
                    throw new IndexOutOfBoundsException();
                else {
                    int i = cursor;
                    Task next = getTask(i);
                    lastRet = i;
                    cursor = i + 1;
                    return next;
                }
            }

            public void remove() {
                if (lastRet < 0)
                    throw new IllegalStateException();
                TaskList.this.remove(TaskList.this.getTask(lastRet));
                if (lastRet < cursor)
                    cursor--;
                lastRet = -1;
            }
        };
    }
    @Override
    public int hashCode() {
        int coeff = 42;
        int result = 1;
        for (int i = 0; i < size(); i++) {
            result = coeff * result + size^2;
        }
        result = coeff * result + size();
        return result;
    }

    @Override
    public boolean equals(Object lst) {
        if (lst == null)
            return false;
        if (this == lst) 
            return true;
        if (this.getClass() == lst.getClass())
            return true;
               
        return false;
    }
    
    @Override
    public TaskList clone() throws CloneNotSupportedException {
        TaskList clone;
        try {
            clone = (TaskList) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException("superclass messed up", ex);
        }
        clone.defaultObj = this.defaultObj;
        clone.interSize = this.interSize;
        clone.size = this.size;
        clone.modCount = this.modCount;
        return clone;
    }
}
