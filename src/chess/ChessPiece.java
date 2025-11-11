package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() { //APAGO O SET PQ NAO QUERO Q A COR SEJA MODIFICADA
		return color;
	}




	
}
