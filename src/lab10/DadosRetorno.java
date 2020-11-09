package lab10;

public class DadosRetorno {
	private int situacao;
	private int pontuacao;
	
	public DadosRetorno(int situacao, int pontuacao) {
		this.situacao = situacao;
		this.pontuacao = pontuacao;
	}

	public int getSituacao() {
		return this.situacao;
	}

	public int getPontuacao() {
		return this.pontuacao;
	}
}