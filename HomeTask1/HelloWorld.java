public class HelloWorld {
	
	public static void drawHorizontLine(int amount) {
		int quantity = amount;
		for(int i = 0; i < quantity; i++) {
			System.out.print("*");
		}
		System.out.print('\n');
	}
	//Drawing only one vertical line
	public static void drawOneLine(int amount) {	
		int quantity = amount;
		for(int i = 0; i < quantity; i++) {
			System.out.print("*\n");
		}
	} 	
	//Drawing two vertical lines
	public static void drawVerticalLine(int amount) { 
		int quantity = amount;
		for(int i = 0; i < quantity; i++) {
			System.out.print("*\t*\n");
		}
	} 
	public static void printH () {
		drawVerticalLine(3);
		drawHorizontLine(9);
		drawVerticalLine(3);
		System.out.println();
	}
	public static void printA () {
		System.out.print("     *\n");
		System.out.print("    * * \n");
		System.out.print("   *   * \n");
		System.out.print("  ******* \n");
		System.out.print(" *       * \n");
		System.out.print("*         * \n");
		System.out.println();	
	}
	public static void printB () {
		drawHorizontLine(8);
		drawVerticalLine(3);
		drawHorizontLine(8);
		drawVerticalLine(3);
		drawHorizontLine(8);
		System.out.println();		
	}
	public static void printC () {
		System.out.print(" ");
		drawHorizontLine(7);
		drawOneLine(4);
		System.out.print(" ");
		drawHorizontLine(7);
		System.out.println();		
	}
	public static void printD () {
		drawHorizontLine(8);
		drawVerticalLine(4);
		drawHorizontLine(8);
		System.out.println();		
	}
	public static void printE () {
		drawHorizontLine(8);
		drawOneLine(3);
		drawHorizontLine(8);
		drawOneLine(3);
		drawHorizontLine(8);
		System.out.println();		
	}
	public static void printF () {
		drawHorizontLine(8);
		drawOneLine(3);
		drawHorizontLine(8);
		drawOneLine(3);
		System.out.println();		
	}
	public static void printG () {
		System.out.print(" ");
		drawHorizontLine(7);
		drawOneLine(2);
		System.out.print("*   ");
		drawHorizontLine(4);
		drawVerticalLine(2);
		System.out.print(" ");
		drawHorizontLine(7);
		System.out.println();		
	}
	public static void printI () {
		System.out.print("   ");
		drawHorizontLine(5);
		System.out.print("     ");
		drawOneLine(1);
		System.out.print("     ");
		drawOneLine(1);
		System.out.print("     ");
		drawOneLine(1);
		System.out.print("     ");
		drawOneLine(1);
		System.out.print("   ");
		drawHorizontLine(5);
		System.out.println();		
	}
	public static void printJ () {
		System.out.print("        ");
		drawOneLine(1);
		System.out.print("        ");
		drawOneLine(1);
		System.out.print("        ");
		drawOneLine(1);
		System.out.print("        ");
		drawOneLine(1);
		drawVerticalLine(2);
		System.out.print("  ");
		drawHorizontLine(6);	
		System.out.println();	
	}
	public static void printK () {
		System.out.print("*   *\n");
		System.out.print("*  *\n");
		System.out.print("* *\n");
		System.out.print("*  *\n");
		System.out.print("*   *\n");
		System.out.println();		
	}
	public static void printL () {
		drawOneLine(5);
		drawHorizontLine(6);
		System.out.println();		
	}
	public static void printM () {
		System.out.println("*       *");		
		System.out.println("* *   * *");
		System.out.println("*   *   *");
		System.out.println("*       *");
		System.out.println();
	}
	public static void printN () {
		System.out.println("*     *");		
		System.out.println("* *   *");
		System.out.println("*   * *");
		System.out.println("*     *");
		System.out.println();
	}
	public static void printO () {
		System.out.print(" ");
		drawHorizontLine(7);
		drawVerticalLine(4);
		System.out.print(" ");
		drawHorizontLine(7);
		System.out.println();
	}
	public static void printP () {
		drawHorizontLine(5);
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*     *");
		drawHorizontLine(5);
		drawOneLine(3);
		System.out.println();
	}
	public static void printQ () {
		System.out.print(" ");
		drawHorizontLine(7);
		drawVerticalLine(4);
		System.out.print(" ");
		drawHorizontLine(9);
		System.out.println("         *");
		System.out.println();
	}
	
	public static void printR () {
		drawHorizontLine(7);
		drawVerticalLine(2);
		drawHorizontLine(7);	
		drawVerticalLine(3);
		System.out.println();
	}
	public static void printS () {
		System.out.print(" ");
		drawHorizontLine(5);
		drawOneLine(2);
		System.out.print(" ");
		drawHorizontLine(5);
		System.out.println("      *");
		System.out.println("      *");
		System.out.print(" ");
		drawHorizontLine(5);
		System.out.println();
	}
	public static void printT () {
		drawHorizontLine(7);
		System.out.print("   ");
		drawOneLine(1);
		System.out.print("   ");
		drawOneLine(1);
		System.out.print("   ");
		drawOneLine(1);
		System.out.print("   ");
		drawOneLine(1);
		System.out.println();
	}
	public static void printU () {
		drawVerticalLine(4);
		System.out.print(" ");
		drawHorizontLine(7);
		System.out.println();
	}
	public static void printV () {
		System.out.println("*     *");
		System.out.println(" *   *");
		System.out.println("  * *");
		System.out.println("   *");
		System.out.println();
	}
	public static void printW () {
		System.out.println("*           *");
		System.out.println(" *    *    *");
		System.out.println("  * *   * *");
		System.out.println("   *     *");
		System.out.println();
	}
	public static void printX () {
		System.out.println("*     * ");
		System.out.println(" *   *  ");
		System.out.println("   *    ");
		System.out.println(" *   *  ");
		System.out.println("*      * ");
		System.out.println();
	}
	public static void printY () {
		System.out.println(" *     * ");
		System.out.println("  *   *  ");
		System.out.println("    *    ");
		System.out.println("    *    ");
		System.out.println("    *    ");
		System.out.println();
	}
	public static void printZ () {
		drawHorizontLine(6);
		System.out.println("      *");
		System.out.println("    *  ");
		System.out.println("  *  ");
		System.out.println("*  ");
		drawHorizontLine(6);
		System.out.println();
	}
	
	public static void checkLetter(String name) {
		
		String bio = name.toLowerCase();
		char[] argument = bio.toCharArray();

		for(int i = 0; i < argument.length; i++) {
			switch(argument[i]) {
		  case 'a':
				printA();
				break;
		  case 'b':
				printB();
				break;
		  case 'c':
				printC();
				break;
		  case 'd':
				printD();
				break;
		  case 'e':
				printU();
				break;
		  case 'f':
				printF();
				break;
		  case 'g':
				printG();
				break;
		  case 'h':
				printH();
				break;
		  case 'i':
				printI();
				break;
		  case 'j':
				printJ();
				break;
		  case 'k':
				printK();
				break;
		  case 'l':
				printL();
				break;
		  case 'm':
				printM();
				break;
		  case 'n':
				printN();
				break;
		  case 'o':
				printO();
				break;
		  case 'p':
				printP();
				break;
		  case 'q':
				printQ();
				break;
		  case 'r':
				printR();
				break;
		  case 's':
				printS();
				break;
		  case 't':
				printT();
				break;
		  case 'u':
				printU();
				break;
		  case 'v':
				printV();
				break;
		  case 'w':
				printW();
				break;
		  case 'x':
				printX();
				break;
		  case 'y':
				printY();
				break;
		  case 'z':
				printZ();
				break;
			}
		 }
	}
	
	public static void main(String[] args) {
		System.out.print("Hello, ");
		System.out.print(args[0] + '\n');
		checkLetter(args[0]);
	}
}
	
	
