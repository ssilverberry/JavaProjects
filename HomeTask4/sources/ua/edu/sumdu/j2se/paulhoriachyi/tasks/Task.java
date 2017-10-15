package ua.edu.sumdu;

class Task {
    
    private String title;
    
    private int time = 0;
    private int start = 0;
    private int end = 0;
    private int interval = 0;
    
    private boolean active = false;
    private boolean repeated;

    Task(String title, int time) {
        this.title = title;
        this.time = time;
        this.repeated = false;
        setActive(false);
    }
    
    Task(String title, int start, int end, int interval) {
        this.title = title;
        this.start = start;
        this.end   = end;
        this.interval = interval;
        this.repeated = false;
        setActive(false);
    }
    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getTime() {
        if (!isRepeated())
            return this.time;
        else 
            return this.start;
    }

    public void setTime(int time) {
        if(isRepeated())
            this.repeated = false;
        else 
            this.time = time;
    }
    
    public int getStartTime() {
        if(!isRepeated())
            return this.time;
        else
            return this.start; 
    }

    public int getEndTime() {
        if(!isRepeated())
            return this.time;
        else
            return this.end; 
    }

    public int getRepeatInterval() {
        if(!isRepeated())
            return this.time;
        else
            return 0; 
    }

    public void setTime(int start, int end, int interval) {
        this.start = start;
        this.end = end;
        this.interval = interval;
        this.repeated = true;
    }

    public boolean isRepeated() {
        return this.repeated;
    }

    public int nextTimeAfter(int current) {
        return -1;
    }

}
