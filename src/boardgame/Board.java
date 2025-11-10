package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces; //Matriz de peças
	
	public Board(int rows, int columns) { //crio o construtor sem a matriz, vai receber so linhas e colunas
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	

}
