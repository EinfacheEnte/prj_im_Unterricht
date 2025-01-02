package ttt;

import java.util.Scanner;

public class TicTacToe {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] Gameboard = new String[3][3];
		Gameboard[0][0] = "1";
		Gameboard[0][1] = "2";
		Gameboard[0][2] = "3";
		Gameboard[1][0] = "4";
		Gameboard[1][1] = "5";
		Gameboard[1][2] = "6";
		Gameboard[2][0] = "7";
		Gameboard[2][1] = "8";
		Gameboard[2][2] = "9";
		
		
		do 
		{
			for(int i=0;i<=2;i++) {
				System.out.println();
				for(int j=0;j<=2;j++) {
					System.out.print("|"+Gameboard[i][j] +"|");
				
				}
			}
			
			int oneTonineX = sc.nextInt();
			
			switch(oneTonineX) {
			case 1: Gameboard[0][0] = "x";
			break;
			
			case 2: Gameboard[0][1] = "x";
			break;
			
			case 3: Gameboard[0][2] = "x";
			break;
		
			case 4: Gameboard[1][0] = "x";
			break;
		
			case 5: Gameboard[1][1] = "x";
			break;
		
			case 6: Gameboard[1][2] = "x";
			break;
			
			case 7: Gameboard[2][0] = "x";
			break;
			
			case 8: Gameboard[2][1] = "x";
			break;
			
			case 9: Gameboard[2][2] = "x";
			break;
			default: System.out.println("Try again invalid field");
					 System.out.println("because your brain is small your enemy now has the move L");
		}	
			
			if ((Gameboard[0][0] == Gameboard[0][1] && Gameboard[0][1] == Gameboard[0][2] && Gameboard[0][0] != "") || 
			    (Gameboard[1][0] == Gameboard[1][1] && Gameboard[1][1] == Gameboard[1][2] && Gameboard[1][0] != "") || 
			    (Gameboard[2][0] == Gameboard[2][1] && Gameboard[2][1] == Gameboard[2][2] && Gameboard[2][0] != "") || 
			    (Gameboard[0][0] == Gameboard[1][0] && Gameboard[1][0] == Gameboard[2][0] && Gameboard[0][0] != "") || 
			    (Gameboard[0][1] == Gameboard[1][1] && Gameboard[1][1] == Gameboard[2][1] && Gameboard[0][1] != "") || 
			    (Gameboard[0][2] == Gameboard[1][2] && Gameboard[1][2] == Gameboard[2][2] && Gameboard[0][2] != "") || 
			    (Gameboard[0][0] == Gameboard[1][1] && Gameboard[1][1] == Gameboard[2][2] && Gameboard[0][0] != "") || 
			    (Gameboard[0][2] == Gameboard[1][1] && Gameboard[1][1] == Gameboard[2][0] && Gameboard[0][2] != "")) 
			{
			    System.out.println("Player x has won!");
			    break;
			}
			if((Gameboard[0][0].equals("1"))||(Gameboard[0][1].equals("2"))||(Gameboard[0][2].equals("3"))||
			   (Gameboard[1][0].equals("4"))||(Gameboard[1][1].equals("5"))||(Gameboard[1][2].equals("6"))||
			   (Gameboard[2][0].equals("7"))||(Gameboard[2][1].equals("8"))||(Gameboard[2][2].equals("9"))) {
				System.out.println("X hat seinen zug gemacht jetzt is O dran");
				System.out.println();
			}
			else {
				System.out.println("Tie Well Played");
				break;
				}

			
			for(int i=0;i<=2;i++) {
		
			System.out.println();
			for(int j=0;j<=2;j++) {
				System.out.print("|"+Gameboard[i][j] +"|");
			}
			}
			
			int oneTonineO = sc.nextInt();
			
			switch(oneTonineO) {
			case 1: Gameboard[0][0] = "o";
			break;
			
			case 2: Gameboard[0][1] = "o";
			break;
			
			case 3: Gameboard[0][2] = "o";
			break;
		
			case 4: Gameboard[1][0] = "o";
			break;
		
			case 5: Gameboard[1][1] = "o";
			break;
		
			case 6: Gameboard[1][2] = "o";
			break;
			
			case 7: Gameboard[2][0] = "o";
			break;
			
			case 8: Gameboard[2][1] = "o";
			break;
			
			case 9: Gameboard[2][2] = "o";
			break;
			default: System.out.println("Try again invalid field");
			
		}	
			// check for a win after each player's move
			if ((Gameboard[0][0] == Gameboard[0][1] && Gameboard[0][1] == Gameboard[0][2] && Gameboard[0][0] != "") || 
			    (Gameboard[1][0] == Gameboard[1][1] && Gameboard[1][1] == Gameboard[1][2] && Gameboard[1][0] != "") || 
			    (Gameboard[2][0] == Gameboard[2][1] && Gameboard[2][1] == Gameboard[2][2] && Gameboard[2][0] != "") || 
			    (Gameboard[0][0] == Gameboard[1][0] && Gameboard[1][0] == Gameboard[2][0] && Gameboard[0][0] != "") || 
			    (Gameboard[0][1] == Gameboard[1][1] && Gameboard[1][1] == Gameboard[2][1] && Gameboard[0][1] != "") || 
			    (Gameboard[0][2] == Gameboard[1][2] && Gameboard[1][2] == Gameboard[2][2] && Gameboard[0][2] != "") || 
			    (Gameboard[0][0] == Gameboard[1][1] && Gameboard[1][1] == Gameboard[2][2] && Gameboard[0][0] != "") || 
			    (Gameboard[0][2] == Gameboard[1][1] && Gameboard[1][1] == Gameboard[2][0] && Gameboard[0][2] != "")) 
			{
			    System.out.println("Player o has won!");
			    break;
			}
			if((Gameboard[0][0].equals("1"))||(Gameboard[0][1].equals("2"))||(Gameboard[0][2].equals("3"))||
			   (Gameboard[1][0].equals("4"))||(Gameboard[1][1].equals("5"))||(Gameboard[1][2].equals("6"))||
			   (Gameboard[2][0].equals("7"))||(Gameboard[2][1].equals("8"))||(Gameboard[2][2].equals("9"))) {
				System.out.println("O hat seinen zug gemacht jetzt is X dran:");
				System.out.println();
			}
			else {
				System.out.println("Tie Well Played");
				break;
			}

			
		
		} while(true);
		
		

	
	
		
	

	}
}


