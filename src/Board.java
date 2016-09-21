public class Board
	{
		public static void title(){
			System.out.println("                   *** BATTLESHIP ***");
			System.out.println();
		}
		
		public static void board()
			{
				
				System.out.println("    1     2     3     4     5     6     7     8     9");
				System.out.println("   ____  ____  ____  ____  ____  ____  ____  ____  ____");
				System.out.println(" A|  " + GameRunner.ships[0][0] + "  |  "  + GameRunner.ships[0][1] + "  |  " + GameRunner.ships[0][2] + "  |  " + GameRunner.ships[0][3] + "  |  " + GameRunner.ships[0][4] + "  |  " + GameRunner.ships[0][5] + "  |  " + GameRunner.ships[0][6] + "  |  " + GameRunner.ships[0][7] + "  |  " + GameRunner.ships[0][8] + "  |  ");
				System.out.println("  |   " + "  |  "  + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  ");
				System.out.println("   ____  ____  ____  ____  ____  ____  ____  ____  ____");
				System.out.println(" B|  " + GameRunner.ships[1][0] + "  |  "  + GameRunner.ships[1][1] + "  |  " + GameRunner.ships[1][2] + "  |  " + GameRunner.ships[1][3] + "  |  " + GameRunner.ships[1][4] + "  |  " + GameRunner.ships[1][5] + "  |  " + GameRunner.ships[1][6] + "  |  " + GameRunner.ships[1][7] + "  |  " + GameRunner.ships[1][8] + "  |  ");
				System.out.println("  |   " + "  |  "  + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  ");
				System.out.println("   ____  ____  ____  ____  ____  ____  ____  ____  ____");
				System.out.println(" C|  " + GameRunner.ships[2][0] + "  |  "  + GameRunner.ships[2][1] + "  |  " + GameRunner.ships[2][2] + "  |  " + GameRunner.ships[2][3] + "  |  " + GameRunner.ships[2][4] + "  |  " + GameRunner.ships[2][5] + "  |  " + GameRunner.ships[2][6] + "  |  " + GameRunner.ships[2][7] + "  |  " + GameRunner.ships[2][8] + "  |  ");
				System.out.println("  |   " + "  |  "  + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  ");
				System.out.println("   ____  ____  ____  ____  ____  ____  ____  ____  ____");
				System.out.println(" D|  " + GameRunner.ships[3][0] + "  |  "  + GameRunner.ships[3][1] + "  |  " + GameRunner.ships[3][2] + "  |  " + GameRunner.ships[3][3] + "  |  " + GameRunner.ships[3][4] + "  |  " + GameRunner.ships[3][5] + "  |  " + GameRunner.ships[3][6] + "  |  " + GameRunner.ships[3][7] + "  |  " + GameRunner.ships[3][8] + "  |  ");
				System.out.println("  |   " + "  |  "  + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  ");
				System.out.println("   ____  ____  ____  ____  ____  ____  ____  ____  ____");
				System.out.println(" E|  " + GameRunner.ships[4][0] + "  |  "  + GameRunner.ships[4][1] + "  |  " + GameRunner.ships[4][2] + "  |  " + GameRunner.ships[4][3] + "  |  " + GameRunner.ships[4][4] + "  |  " + GameRunner.ships[4][5] + "  |  " + GameRunner.ships[4][6] + "  |  " + GameRunner.ships[4][7] + "  |  " + GameRunner.ships[4][8] + "  |  ");
				System.out.println("  |   " + "  |  "  + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  ");
				System.out.println("   ____  ____  ____  ____  ____  ____  ____  ____  ____");
				System.out.println(" F|  " + GameRunner.ships[5][0] + "  |  "  + GameRunner.ships[5][1] + "  |  " + GameRunner.ships[5][2] + "  |  " + GameRunner.ships[5][3] + "  |  " + GameRunner.ships[5][4] + "  |  " + GameRunner.ships[5][5] + "  |  " + GameRunner.ships[5][6] + "  |  " + GameRunner.ships[5][7] + "  |  " + GameRunner.ships[5][8] + "  |  ");
				System.out.println("  |   " + "  |  "  + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  ");
				System.out.println("   ____  ____  ____  ____  ____  ____  ____  ____  ____");
				System.out.println(" G|  " + GameRunner.ships[6][0] + "  |  "  + GameRunner.ships[6][1] + "  |  " + GameRunner.ships[6][2] + "  |  " + GameRunner.ships[6][3] + "  |  " + GameRunner.ships[6][4] + "  |  " + GameRunner.ships[6][5] + "  |  " + GameRunner.ships[6][6] + "  |  " + GameRunner.ships[6][7] + "  |  " + GameRunner.ships[6][8] + "  |  ");
				System.out.println("  |   " + "  |  "  + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  ");
				System.out.println("   ____  ____  ____  ____  ____  ____  ____  ____  ____");
				System.out.println(" H|  " + GameRunner.ships[7][0] + "  |  "  + GameRunner.ships[7][1] + "  |  " + GameRunner.ships[7][2] + "  |  " + GameRunner.ships[7][3] + "  |  " + GameRunner.ships[7][4] + "  |  " + GameRunner.ships[7][5] + "  |  " + GameRunner.ships[7][6] + "  |  " + GameRunner.ships[7][7] + "  |  " + GameRunner.ships[7][8] + "  |  ");
				System.out.println("  |   " + "  |  "  + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  ");
				System.out.println("   ____  ____  ____  ____  ____  ____  ____  ____  ____");
				System.out.println(" I|  " + GameRunner.ships[8][0] + "  |  "  + GameRunner.ships[8][1] + "  |  " + GameRunner.ships[8][2] + "  |  " + GameRunner.ships[8][3] + "  |  " + GameRunner.ships[8][4] + "  |  " + GameRunner.ships[8][5] + "  |  " + GameRunner.ships[8][6] + "  |  " + GameRunner.ships[8][7] + "  |  " + GameRunner.ships[8][8] + "  |  ");
				System.out.println("  |   " + "  |  "  + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  " + "" + "   |  ");
				System.out.println("   ____  ____  ____  ____  ____  ____  ____  ____  ____");
				System.out.println();
			}
	}
