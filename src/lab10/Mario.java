package lab10;

public class Mario {
	public SituacaoMario situacao = new Pequeno();
	public long pontuacao = 0;
	
	public void pegarCogumelo() {
		if (situacao.getSituacao() == 0) {
			situacao = new Grande();
		}

		else if (situacao.getSituacao() == 2|| situacao.getSituacao() == 3) {
			pontuacao+=1000;
		}
	}
	
	public void levarDano() throws Exception {
		if (situacao.getSituacao() == 0) {
			throw new Exception("Mario morreu.");
		}

		else if (situacao.getSituacao() == 1) {
			situacao = new Pequeno();
		}
		
		else if (situacao.getSituacao() == 3) {
			situacao = new Grande();
		}
	}
	
	public void pegarFlor() {
		if (situacao.getSituacao() == 0|| situacao.getSituacao() == 1) {
			situacao = new FlorDeFogo();
		}

		else if (situacao.getSituacao() == 2) {
			pontuacao+=1000;
		}
	}
}