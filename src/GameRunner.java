import java.util.Scanner;
public class GameRunner
	{
		static int row;
		static String first;
		static String end;
		static int column;
		static int row2;
		static int column2;
		static Scanner input = new Scanner(System.in);
		static boolean [][] ships = new boolean[5][5];	
		static String shipType;
		static int shipLength;
		public static void main(String[] args)
			{
				Board.board();
//				shipLocations();
//				for (int i = 0; i < ships.length; i++)
//					{
//						for (int j = 0; j < ships.length; j++)
//							{
//								System.out.print(ships[i][j] + " ");
//							}
//						System.out.println();
//					}
			}
//		public static void Board()
//		{
//			System.out.println("    1      2      3      4      5");
//			System.out.println("   ____   ____   ____   ____   ____");
//			System.out.println(" A| " + "  " + "  |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
//			System.out.println("  |  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
//			System.out.println("   ____   ____   ____   ____   ____");
//			System.out.println(" B|  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
//			System.out.println("  |  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
//			System.out.println("   ____   ____   ____   ____   ____");
//			System.out.println(" C|  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
//			System.out.println("  |  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
//			System.out.println("   ____   ____   ____   ____   ____");
//			System.out.println(" D|  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
//			System.out.println("  |  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
//			System.out.println("   ____   ____   ____   ____   ____");
//			System.out.println(" E|  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
//			System.out.println("  |  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
//			System.out.println("   ____   ____   ____   ____   ____");
//		}
		public static void shipLocations()
		{
			shipType = "aircraft carrier";
			askForShip(shipType);
			endCoordinatesToNumbers();
			shipPlacing();
		}
		public static void firstCoordinatesToNumbers()
		{
			switch(first.substring(0,1))
			{
				case "A":
				{
					row = 0;
					break;
				}
				case "B":
				{
					row = 1;
					break;
				}
				case "C":
				{
					row = 2;
					break;
				}
				case "D":
				{
					row = 3;
					break;
				}
				case "E":
				{
					row = 4;
					break;
				}
			}
			column = Integer.parseInt(first.substring(1))-1;
		}
		public static void endCoordinatesToNumbers()
			{
				switch(end.substring(0,1))
				{
					case "A":
					{
						row2 = 0;
						break;
					}
					case "B":
					{
						row2 = 1;
						break;
					}
					case "C":
					{
						row2 = 2;
						break;
					}
					case "D":
					{
						row2 = 3;
						break;
					}
					case "E":
					{
						row2 = 4;
						break;
					}
				}
				column2 = Integer.parseInt(end.substring(1))-1;
			}
		public static void askForShip(String ship)
		{
			System.out.println("Where do you want your " + ship +  " to start?");
			first = input.nextLine();
			firstCoordinatesToNumbers();
			System.out.println("Where do you want your " + ship + " to end?");
			end = input.nextLine();
			endCoordinatesToNumbers();
		}
		public static void shipPlacing()
		{
			while (row != row2 && column != column2)
				{
					System.out.println("You cannot place ships diagonally. Type in new coordinates");
					askForShip(shipType);
				}
			if (row == row2)
				{
					while (Math.abs(column - column2) != shipLength || Math.abs(row - row2) != shipLength)
						{
							if (Math.abs(column - column2) != shipLength)
								{
									System.out.println("That is not the proper length for the aircraft carrier. Please type in new coordinates");
									askForShip(shipType);
								}
						}
					for ( int i = 0; i <= Math.abs(column2 - column); i++)
						{
							if (column < column2)
								{
									ships[row][column + i] = true;
								}
							else
								{
									ships[row][column2 + i] = true;
								}
						}
				}
			else if (column == column2)
				{
					while (Math.abs(row - row2) != shipLength || Math.abs(row - row2) != shipLength)
						{
							System.out.println("That is not the proper length for the aircraft carrier. Please type in new coordinates");
							askForShip(shipType);
						}
					for ( int i = 0; i <= Math.abs(row - row2); i++)
						{
							if (column < column2)
								{
									ships[row + i][column] = true;
								}
							else
								{
									ships[row + i][column2] = true;
								}
						}
				}
		}
	}

