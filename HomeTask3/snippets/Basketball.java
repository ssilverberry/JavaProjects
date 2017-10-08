public class Basketball extends Hobby {
    private String name ;
    private String period = "100";
    
    public Basketball( String name) {
        this.name = name;
    }
    @Override
    public void intro() {
        System.out.print("\nMy hobby is " + "\'" + name + "\'");
        System.out.println(". And I do sport for " + "\'" + period + "\' days");
    }
    @Override
    public  void greetings() {
        System.out.print("Hi!");
        System.out.println(" Easy breezy, let's play \'"+ name + "\'");
    }
}
