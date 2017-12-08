package ua.edu.sumdu.j2se.paulhoriachyi.tasks;
/**
 * This is a main class for <b>"Task Manager"</b> program.
 * Here is a logical part of code for creating a task with parametres.
 *
 * @author paulhoriachyi
 * @version 1.0
 */
public class Task {
    private String title = null;

    private int time;
    private int start;
    private int end;
    private int interval;
    
    private boolean active;
    private boolean repeated;
    

    /**
     * Class constructor for not repeated task.
     *
     * @param title set task name.
     * @param time  set task execution time.
     */
    public Task(String title, int time) {
        this.title = title;
        this.time = time;
    }

    /**
     * Class constructor for repeated task.
     *
     * The first two param are the same to previous
     * class constructor for not repeated task.
     * 
     * @param title     set task name.
     * @param start     set task start execution point.
     * @param end       set task end execution point.
     * @param interval  set task execution frequency.
     */
    public Task(String title, int start, int end, int interval) {
        this.title = title;
        this.start = start;
        this.end   = end;
        this.interval = interval;
        this.repeated = true;
    }

    /**
     * ...method getTitle is a task name getter...
     *
     * @return  task name value.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * ...method setTitle is a task name setter...
     * 
     * @param title it's a task name
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ...method isActive is a task state getter...
     *
     * @return active task state value
     */
    public boolean isActive() {
        return this.active;
    }

    /**
     * ...method setActive is a task state setter...
     *
     * @param active it's a task active state
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * ...method getTime is a time getter for not repeated task...
     * 
     * @return time is a task start execution point
     */
    public int getTime() {
        if (isRepeated())
            return this.start;
        else
            return this.time;
    }

    /**
     * ...method setTime is a time setter for not repeated task...
     *
     * @param time task start execution point
     */
    public void setTime(int time) {
        if (isRepeated())
            this.repeated = false;
        this.time = time;
    }

    /**
     * ...method getStartTime is a start time getter for repeated task...
     *
     * @return time task start execution point
     */
    public int getStartTime() {
        if (!isRepeated())
            return this.time;
        else
            return this.start;
    }

    /**
     * ...method getEndTime is an end time getter for repeated task...
     *
     * @return time task end execution point
     */
    public int getEndTime() {
        if (!isRepeated())
            return this.time;
        else
            return this.end;
    }

    /**
     * ...method getRepeatInterval is a frequency getter for repeated task...
     *
     * @return time task end execution point
     */
    public int getRepeatInterval() {
        if (!isRepeated())
            return 0;
        else
            return this.interval;
    }

    /**
     * ...method setTime is a time setter for repeated task...
     *
     * @param start is a task start execution point
     * @param end is a task end execution point
     * @param interval is a task exe. frequency
     */
    public void setTime(int start, int end, int interval) {
        this.start = start;
        this.end = end;
        this.interval = interval;
        this.repeated = true;
    }

    /**
     * ...method setTime is a time setter for repeated task...
     *
     * @return repeated 
     */
    public boolean isRepeated() {
        return this.repeated;
    }

    /**
     * ...method nextTimeAfter is a tsk method for getting next task time
     *    after current time point...
     *
     * @param current is a current task time point
     * @return -1 if task is not active any more
     */
    public int nextTimeAfter(int current) {

        int i = start;
//        System.out.println(i + "it is a start");
        if (isActive()) {
            if (isRepeated()) {
                while (i <= end) {
                    if (current < i)
                        return i;
                    else if (current == i)
                        return i + interval;
                    i += interval;
                }
            } else if (this.interval == 0 && current < this.time)
                    return this.time;
               else
                    return -1;
            
        }
        return -1;
    }
    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
   
}
