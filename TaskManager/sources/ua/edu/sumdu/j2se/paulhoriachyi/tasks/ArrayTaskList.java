package ua.edu.sumdu.j2se.paulhoriachyi.tasks;

import java.util.Arrays;

public class ArrayTaskList extends TaskList implements Cloneable {

    public ArrayTaskList() {
        modCount = 1;
    }

    public void add(Task task) throws Exception {
        if(task.equals(null))
            throw new NullPointerException();

        else if (size >= defaultSize - 1) {
            interSize = defaultSize + (size >> 1);
            defaultObj = Arrays.copyOf(defaultObj, interSize);
        }
        defaultObj[size] = task;
        size++;
    }

    public boolean remove(Task task) {

        for (int i = 0; i < size(); ++i) {
            if(task.equals(defaultObj[i])) {

                int var2 = this.size - i;
                if (var2 > 0) {
                    System.out.println(i + " this is i");
                    System.arraycopy(this.defaultObj, i + 1, this.defaultObj, i, var2);
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public Task getTask(int index) {
        if (index < size())
            return defaultObj[index];
        else
            return null;
    }
}