package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces; //Matriz de peças
	
	public Board(int rows, int columns) { //crio o construtor sem a matriz, vai receber so linhas e colunas
		if(rows <1 || columns <1) { //verificando se os dados sao invalidos
			throw new BoardException("Error creating board: thre must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column) {
		if(!positionExists(row,column) ) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position) ) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	
	}
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on a position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece; // pegando a matriz na posicao dada e atribuindo a ela a peça q informei
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		if(piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	private boolean positionExists(int row, int column) {
		return row >=0 && row < rows && column >=0 && column < columns;  //linha tem  q ser maior q zero e menor q a altura do tabuleiro e mesma faço o msm com colunas 
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	} 
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position) ) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}

}
