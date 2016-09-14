import java.util.Scanner;
public class GameRunner
	{
		static int row;
		static String first;
		static String end;
		static int column;
		static int row2;
		static int column2;
		public static void main(String[] args)
			{
				//Board();
				shipLocations();
			}
		public static void Board()
		{
			System.out.println("    1      2      3      4      5");
			System.out.println("   ____   ____   ____   ____   ____");
			System.out.println(" A| " + "  " + "  |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
			System.out.println("  |  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
			System.out.println("   ____   ____   ____   ____   ____");
			System.out.println(" B|  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
			System.out.println("  |  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
			System.out.println("   ____   ____   ____   ____   ____");
			System.out.println(" C|  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
			System.out.println("  |  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
			System.out.println("   ____   ____   ____   ____   ____");
			System.out.println(" D|  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
			System.out.println("  |  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
			System.out.println("   ____   ____   ____   ____   ____");
			System.out.println(" E|  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
			System.out.println("  |  " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   " + "" + "   |   ");
			System.out.println("   ____   ____   ____   ____   ____");
		}
		public static void shipLocations()
		{
			boolean [][] ships = new boolean[5][5];
			Scanner input = new Scanner(System.in);
			System.out.println("Where do you want your aircraft carrier to start?");
			first = input.nextLine();
			firstCoordinatesToNumbers();
			System.out.println("Where do you want your aircraft carrier to end?");
			end = input.nextLine();
			endCoordinatesToNumbers();
			System.out.println("row equals" + row);
			System.out.println("row2 equals" + row2);
			if (row == row2)
				{
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
			for (int i = 0; i < ships.length; i++)
				{
					for (int j = 0; j < ships.length; j++)
						{
							System.out.print(ships[i][j] + " ");
						}
					System.out.println();
				}
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
	}

