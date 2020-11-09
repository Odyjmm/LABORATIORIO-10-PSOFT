package lab10;

import java.util.ArrayList;

public class Mario {
	public SituacaoMario situacao;
	public long pontuacao;
	public ArrayList<SituacaoMario> situacoesPossiveis;
	
	public Mario() {
		this.situacao = new Pequeno();
		this.pontuacao = 0;
		this.situacoesPossiveis = new ArrayList<SituacaoMario>();
		this.situacoesPossiveis.add(new Pequeno());
		this.situacoesPossiveis.add(new Grande());
		this.situacoesPossiveis.add(new Flor());
	}
	
	public void pegarCogumelo() {
		DadosRetorno novosDados = this.situacao.pegarCogumelo();
		int aux = novosDados.getSituacao() - 1;
		
		this.situacao = situacoesPossiveis.get(aux);
		this.pontuacao += novosDados.getPontuacao();
	}
	
	public void pegarFlor() {
		DadosRetorno novosDados = this.situacao.pegarFlor();
		int aux = novosDados.getSituacao() - 1;
		
		this.situacao = situacoesPossiveis.get(aux);
		this.pontuacao += novosDados.getPontuacao();
	}
	
	public void levarDano() throws Exception {
		DadosRetorno novosDados = this.situacao.levarDano();
		int aux = novosDados.getSituacao() - 1;
		
		if (aux == 0) {
			throw new Exception("Mario morreu.");
		}
		
		this.situacao = situacoesPossiveis.get(aux);
		this.pontuacao += novosDados.getPontuacao();
	}
}