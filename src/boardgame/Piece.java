package boardgame;



public abstract class Piece {
	
	protected Position position; //nao quero q essa posicao seja visivel na camada de xadrez
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Posicao de uma peça recem criada é nulo
	}

	protected Board getBoard() { //nao uso o set pq nao vou permitir q meu tabuleiro seja alterado, alem disso deixo ele protected pra somente classes dentro do mesmo pacote e subclasse vao acessar o tabuleiro de uma peça
		return board;
	}


	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
