package boardgame;

public class Piece {
	
	protected Position position; //nao quero q essa posicao seja visivel na camada de xadrez
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Posicao de uma peça recem criada é nulo
	}

	protected Board getBoard() { //nao uso o set pq nao vou permitir q meu tabuleiro seja alterado, alem disso deixo ele protected pra somente classes dentro do mesmo pacote e subclasse vao acessar o tabuleiro de uma peça
		return board;
	}


	
	

}
