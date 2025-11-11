package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() { //qm sabe a dimensao do tabuleiro é o ChessMatch
		board = new Board(8, 8);
		initialSetup(); //Chamo o inicial setup pra iniciar
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
	
	private void initialSetup() { // iniciar a partida de xadrez
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
