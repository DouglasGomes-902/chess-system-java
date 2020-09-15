package aplication;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.chessPosition;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.print("Source: ");
		chessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.print("Target: ");
		chessPosition target = UI.readChessPosition(sc);
		
		
		ChessPiece capturedPiece  = chessMatch.performChessMove(source , target);
		
		
		}
		
		
	}

}
