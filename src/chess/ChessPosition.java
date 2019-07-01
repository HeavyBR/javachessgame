package chess;

import boardgame.Position;

public class ChessPosition {

	private char colunm;
	private int row;

	public ChessPosition(char colunm, int row) {
		if (colunm < 'a' || colunm > 'h' || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Invalid positions.");
		}
		this.colunm = colunm;
		this.row = row;
	}

	protected Position toPosition() {
		return new Position(8 - row, colunm - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColunm()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + colunm + row;
	}

}
