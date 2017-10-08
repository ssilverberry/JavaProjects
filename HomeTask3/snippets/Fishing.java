public class Fishing extends Hobby {
    private String name;
    private String b;
    private int a = 10;

    public Fishing ( String name) {
        this.name = name;
    }

    @Override
    public void intro() {
        System.out.print("\nMy hobby is  just \'" + name + "\'");
        System.out.print(". And I don't like to do sport \n");
    }
    @Override
    public void greetings() {
        b = "I do \'" + name + "\' for " + a + " days";
        System.out.println(b);
    }
}