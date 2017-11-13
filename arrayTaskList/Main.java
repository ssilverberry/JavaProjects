package com.horiachiy.paul;

public class Main {

    public static void main(String[] args) {
	    ArrayTaskList a = new ArrayTaskList();
	    Task[] i = {new Task("title4", 10), new Task("title3", 10),new Task("title2", 10),
                new Task("title1", 10), new Task("title0", 10), new Task("title6", 10)};

	    a.add(i[0]);
	    a.add(i[1]);
	    a.add(i[2]);
	    a.add(i[3]);

        a.remove(new Task("asdasd", 10));
        System.out.println(a.getTask(0));
        System.out.println(a.size());
    }
}
