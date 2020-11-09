package lab10;

public class Flor extends SituacaoMario {
	@Override
	public int getSituacao() {
		return MARIO_FLOR;
	}

	@Override
	public DadosRetorno pegarCogumelo() {
		return new DadosRetorno(MARIO_FLOR, 1000);
	}

	@Override
	public DadosRetorno pegarFlor() {
		return new DadosRetorno(MARIO_FLOR, 1000);
	}

	@Override
	public DadosRetorno levarDano() {
		return new DadosRetorno(MARIO_GRANDE, 0);
	}
}