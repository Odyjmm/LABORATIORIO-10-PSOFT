package lab10;

public class Pequeno extends SituacaoMario {
	@Override
	public int getSituacao() {
		return MARIO_PEQUENO;
	}

	@Override
	public DadosRetorno pegarCogumelo() {
		return new DadosRetorno(MARIO_GRANDE, 0);
	}

	@Override
	public DadosRetorno pegarFlor() {
		return new DadosRetorno(MARIO_FLOR, 0);
	}

	@Override
	public DadosRetorno levarDano() {
		return new DadosRetorno(MARIO_MORTO, 0);
	}
}