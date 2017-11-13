package com.horiachiy.paul;

public class ArrayTaskList {
    int s = 8;//(int)(5 * 0.75f) + 5;

    Task[] array = new Task[s];
    int size = 0;
    boolean bool;
    int sw = 0;

    public void add(Task task) {

        array[sw] = task;
        sw++;
        size += 1;
        for(int i = 0; i < 5; i++ )
            System.out.println("add + " + array[i]);

        System.out.println("-------------------------");
    }
    public boolean remove(Task task) {
        int last = size;
        System.out.println(size + "sss");
        Task a = null;
        for (int i = 0; i < size; i++) {

            if (array[i].getTitle().equals(task.getTitle())) {
                if ( i == (size-1)) {
                    a = array[i - 1];
                } else {
                    a = array[size-1];
                }
                array[i] = null;
                if(array[i] == null){
                    array[last] = array[i];
                    array[i] = a;
                    bool = true;
                    size -= 1;
                }
            }
            System.out.println(array[i]);
        }
        System.out.println(bool + " <- bool ");
        System.out.println("-------------------------");
        return bool;
    }
    public int size() {
        return size;
    }
    Task getTask(int index) {
        return array[index];
    }
}
