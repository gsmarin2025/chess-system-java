package chess;

import boardgame.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() { //qm sabe a dimensao do tabuleiro é o ChessMatch
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows();i++) { //percorrer matriz
		for (int j=0; j<board.getRows();j++) {
			mat[i][j] = (ChessPiece)board.piece(i,j); //fazendo downcasting pra interpreta como uma peça de xadrez
				
			}
		}
		return mat;
	}
}
