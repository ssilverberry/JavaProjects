public class Fishing extends Hobby {
    @Override
    public void intro() {
        System.out.print("\nMy hobby is  just \'FISHING\'");
        System.out.print(". And I don't like to do sport \n");
    }
    @Override
    public void greetings() {
        int a = 10;
        String b = "I do \'fishing\' for " + a + " days";
        System.out.println(b);
    }
}