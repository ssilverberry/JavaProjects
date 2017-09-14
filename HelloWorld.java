public class HelloWorld {
	
	public static void DrawHorizontLine(int d) {
		int quantity = d;
		for(int i = 0; i < quantity; i++) {
			System.out.print("*");
		}
		System.out.print('\n');
	}
	
	public static void DOVL(int q) {	/*Drawing only one vertical line*/
		int quantity = q;
		for(int i = 0; i < quantity; i++) {
			System.out.print("*\n");
		}
	} 	

	public static void DrawVerticalLine(int q) { /*Drawing two vertical lines*/
		int quantity = q;
		for(int i = 0; i < quantity; i++) {
			System.out.print("*\t*\n");
		}
	} 
	
	public static void printH () {
		DrawVerticalLine(3);
		DrawHorizontLine(9);
		DrawVerticalLine(3);
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
		DrawHorizontLine(8);
		DrawVerticalLine(3);
		DrawHorizontLine(8);
		DrawVerticalLine(3);
		DrawHorizontLine(8);
		System.out.println();		
	}
	public static void printC () {
		System.out.print(" ");
		DrawHorizontLine(7);
		DOVL(4);
		System.out.print(" ");
		DrawHorizontLine(7);
		System.out.println();		
	}
	public static void printD () {
		DrawHorizontLine(8);
		DrawVerticalLine(4);
		DrawHorizontLine(8);
		System.out.println();		
	}
	public static void printE () {
		DrawHorizontLine(8);
		DOVL(3);
		DrawHorizontLine(8);
		DOVL(3);
		DrawHorizontLine(8);
		System.out.println();		
	}
	public static void printF () {
		DrawHorizontLine(8);
		DOVL(3);
		DrawHorizontLine(8);
		DOVL(3);
		System.out.println();		
	}
	public static void printG () {
		System.out.print(" ");
		DrawHorizontLine(7);
		DOVL(2);
		System.out.print("*   ");
		DrawHorizontLine(4);
		DrawVerticalLine(2);
		System.out.print(" ");
		DrawHorizontLine(7);
		System.out.println();		
	}
	public static void printI () {
		System.out.print("   ");
		DrawHorizontLine(5);
		System.out.print("     ");
		DOVL(1);
		System.out.print("     ");
		DOVL(1);
		System.out.print("     ");
		DOVL(1);
		System.out.print("     ");
		DOVL(1);
		System.out.print("   ");
		DrawHorizontLine(5);
		System.out.println();		
	}
	public static void printJ () {
		System.out.print("        ");
		DOVL(1);
		System.out.print("        ");
		DOVL(1);
		System.out.print("        ");
		DOVL(1);
		System.out.print("        ");
		DOVL(1);
		DrawVerticalLine(2);
		System.out.print("  ");
		DrawHorizontLine(6);	
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
		DOVL(5);
		DrawHorizontLine(6);
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
		DrawHorizontLine(7);
		DrawVerticalLine(4);
		System.out.print(" ");
		DrawHorizontLine(7);
		System.out.println();
	}
	public static void printP () {
		DrawHorizontLine(5);
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*     *");
		DrawHorizontLine(5);
		DOVL(3);
		System.out.println();
	}
	public static void printQ () {
		System.out.print(" ");
		DrawHorizontLine(7);
		DrawVerticalLine(4);
		System.out.print(" ");
		DrawHorizontLine(9);
		System.out.println("         *");
		System.out.println();
	}
	
	public static void printR () {
		DrawHorizontLine(7);
		DrawVerticalLine(2);
		DrawHorizontLine(7);	
		DrawVerticalLine(3);
		System.out.println();
	}
	public static void printS () {
		System.out.print(" ");
		DrawHorizontLine(5);
		DOVL(2);
		System.out.print(" ");
		DrawHorizontLine(5);
		System.out.println("      *");
		System.out.println("      *");
		System.out.print(" ");
		DrawHorizontLine(5);
		System.out.println();
	}
	public static void printT () {
		DrawHorizontLine(7);
		System.out.print("   ");
		DOVL(1);
		System.out.print("   ");
		DOVL(1);
		System.out.print("   ");
		DOVL(1);
		System.out.print("   ");
		DOVL(1);
		System.out.println();
	}
	public static void printU () {
		DrawVerticalLine(4);
		System.out.print(" ");
		DrawHorizontLine(7);
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
		DrawHorizontLine(6);
		System.out.println("      *");
		System.out.println("    *  ");
		System.out.println("  *  ");
		System.out.println("*  ");
		DrawHorizontLine(6);
		System.out.println();
	}
	
	public static void CheckLetter(String name) {
		String bio = name.toLowerCase();
		//System.out.println(bio);
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
		CheckLetter(args[0]);
	}
}
	
	
