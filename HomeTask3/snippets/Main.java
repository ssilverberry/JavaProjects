public class Main {
    public static void main(String[] args) {
        Hobby[] arr = { new Football("football"),
                        new Basketball("basketball"),
                        new Fishing("fishing")};
        for(Hobby i : arr ) {
            i.intro();
            i.greetings();
        }
    }
}