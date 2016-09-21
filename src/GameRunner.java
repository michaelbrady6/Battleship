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
		static String [][] ships = {{" "," "," "," "," "," "," "," "," ",},{" "," "," "," "," "," "," "," "," ",},{" "," "," "," "," "," "," "," "," ",},{" "," "," "," "," "," "," "," "," ",},{" "," "," "," "," "," "," "," "," ",},{" "," "," "," "," "," "," "," "," ",},{" "," "," "," "," "," "," "," "," ",},{" "," "," "," "," "," "," "," "," ",},{" "," "," "," "," "," "," "," "," ",}};	
		static String shipType;
		static int shipLength;
		public static void main(String[] args)
			{
				Board.title();
				shipLocations();
//				for (int i = 0; i < ships.length; i++)
//					{
//						for (int j = 0; j < ships.length; j++)
//							{
//								System.out.print(ships[i][j] + " ");
//							}
//						System.out.println();
//					}
			}
		public static void shipLocations()
		{
			Board.board();
			shipType = "aircraft carrier";
			shipLength = 4;
			askForShip(shipType);
			endCoordinatesToNumbers();
			shipPlacing();
			Board.board();
			shipType = "battleship";
			shipLength = 3;
			askForShip(shipType);
			endCoordinatesToNumbers();
			shipPlacing();
			Board.board();
			shipType = "submarine";
			shipLength = 2;
			askForShip(shipType);
			endCoordinatesToNumbers();
			shipPlacing();
			Board.board();
			shipType = "light missile cruiser";
			shipLength = 2;
			askForShip(shipType);
			endCoordinatesToNumbers();
			shipPlacing();
			Board.board();
			shipType = "special operations";
			shipLength = 1;
			askForShip(shipType);
			endCoordinatesToNumbers();
			shipPlacing();
			Board.board();
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
				case "F":
				{
					row = 5;
					break;
				}
				case "G":
				{
					row = 6;
					break;
				}
				case "H":
				{
					row = 7;
					break;
				}
				case "I":
				{
					row = 8;
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
					case "F":
					{
						row2 = 5;
						break;
					}
					case "G":
					{
						row2 = 6;
						break;
					}
					case "H":
					{
						row2 = 7;
						break;
					}
					case "I":
					{
						row2 = 8;
						break;
					}
				}
				column2 = Integer.parseInt(end.substring(1))-1;
			}
		public static void askForShip(String ship)
		{
			System.out.println("Where do you want your " + ship +  " to start? (you have " + (shipLength + 1) +  " total spaces)");
			first = input.nextLine();
			first = first.toUpperCase();
			firstCoordinatesToNumbers();
			System.out.println("Where do you want your " + ship + " to end? (you have " + (shipLength + 1) +  " total spaces)");
			end = input.nextLine();
			end = end.toUpperCase();
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
					while (Math.abs(column - column2) != shipLength)
						{
							if (Math.abs(column - column2) != shipLength)
								{
									System.out.println("That is not the proper length for the "+ shipType + ". Please type in new coordinates");
									askForShip(shipType);
								}
						}
					for ( int i = 0; i <= Math.abs(column2 - column); i++)
						{
							if (column < column2)
								{
									ships[row][column + i] = "S";
								}
							else
								{
									ships[row][column2 + i] = "S";
								}
						}
				}
			else if (column == column2)
				{
					while (Math.abs(row - row2) != shipLength)
						{
							System.out.println("That is not the proper length for the "+ shipType + ". Please type in new coordinates");
							askForShip(shipType);
						}
					for ( int i = 0; i <= Math.abs(row - row2); i++)
						{
							if (column < column2)
								{
									ships[row + i][column] = "S";
								}
							else
								{
									ships[row + i][column2] = "S";
								}
						}
				}
		}
	}

