package chess;

import Boardgame.Position;

public class chessPosition {

	private char column;
	private int row;
	public chessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8 ) {
			throw new ChessException ("Error instantiating ChessPosition. Valid value are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	
	protected Position toPosition () {
		return new Position(8 - row, column - 'a');
	}
	
	protected static chessPosition fromPosition(Position position) {
		return new chessPosition((char)('a' -position.getColumn()), 8 - position.getRow());
	}
	
	@Override 
	public String toString() {
		return "" + column + row;
	}
	
}
