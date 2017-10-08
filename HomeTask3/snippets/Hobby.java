public class Hobby {
    private int a, b, c;
    
    Hobby() {}
    public void intro(){
        System.out.println("Hello!");
    }
    public void greetings() {
        a = 10;
        b = 5;
        c = a + b;
        System.out.println("I do sport for >> " + c);
    }
}