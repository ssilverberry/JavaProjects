import java.util.Scanner;

public class DataType {

    //function for interrupting Test
    static boolean exitBreak() {
        boolean quit = false;
        Scanner inapt = new Scanner(System.in);
        String answrUser;

        System.out.println("Do you want to stop the test (Y/N) ? ");
        answrUser = inapt.nextLine();
        quit = answrUser.equals("Y".toLowerCase()) || quit;

        return quit;
    }

    //function for taking a survey
    static void startTest() {
        Scanner input = new Scanner(System.in);
        String userAns;
        String [] questArr = {"Does primitive type \'byte\' have values range from -128...127 ? ",
                            "What type is lower than \'int\' and bigger than \'byte\' ?",
                            "Byte length of \'int\' is ?",
                            "Byte length of \'long\' is ?",
                            "Byte length of \'char\' is ?",
                            "Byte length of \'float\' is ?",
                            "Byte length of \'double\' is ?"};
        String yesAnswr = "Y";
        String rghtAns = "Congrats, you are right !";
        String wrngAns = "Sorry, you aren't right !!! ";
        String mdlAns = ") Enter a number -> ";

        int intAnswr;
        int i = 0;

        out:for(;;) {
            for (; i < questArr.length; i++) {
                if (i == 0) {
                    System.out.println(i + ") Yes or No question? enter Y(yes) or N(no) -> " + questArr[i]);
                    userAns = input.next().toLowerCase();

                    if(userAns.equals(yesAnswr.toLowerCase()))
                        System.out.println(rghtAns);
                     else
                        System.out.println(wrngAns);
                    if (exitBreak())
                        break out;
                    else
                        continue;
                }
                if (i == 1) {
                    System.out.println(i + ") Enter name of primitive data type -> " + questArr[i]);
                    userAns = input.next();
                    if(userAns.equals("Short".toLowerCase()))
                        System.out.println(rghtAns);
                     else
                        System.out.println(wrngAns);
                    if (exitBreak())
                        break out;
                    else
                        continue;
                }
                if (i == 2) {
                    System.out.println(i + mdlAns + questArr[i]);
                    intAnswr = input.nextInt();
                    if(intAnswr == 4 ) 
                        System.out.println(rghtAns);
                     else 
                        System.out.println(wrngAns);
                    if (exitBreak())
                        break out;
                    else
                        continue;
                }
                if (i == 3) {
                    System.out.println(i + mdlAns + questArr[i]);
                    intAnswr = input.nextInt();
                    if(intAnswr == 8 ) 
                        System.out.println(rghtAns);
                     else 
                        System.out.println(wrngAns);
                    if (exitBreak())
                        break out;
                    else
                        continue;
                }
                if (i == 4) {
                    System.out.println(i + mdlAns + questArr[i]);
                    intAnswr = input.nextInt();
                    if(intAnswr == 2 ) 
                        System.out.println(rghtAns);
                     else 
                        System.out.println(wrngAns);
                    if (exitBreak())
                        break out;
                    else
                        continue;
                }
                if (i == 5) {
                    System.out.println(i + mdlAns + questArr[i]);
                    intAnswr = input.nextInt();
                    if(intAnswr == 4) 
                        System.out.println(rghtAns);
                     else 
                        System.out.println(wrngAns);
                    if (exitBreak())
                        break out;
                    else
                        continue;
                }
                if (i == 6) {
                    System.out.println(i + mdlAns + questArr[i]);
                    intAnswr = input.nextInt();
                    if(intAnswr == 8) 
                        System.out.println(rghtAns);
                     else 
                        System.out.println(wrngAns);
                    if (exitBreak())
                        break out;
                }
                i = -1;
            }
        }
    }

    public static void main(String[] args) {
        startTest();
    }
}
