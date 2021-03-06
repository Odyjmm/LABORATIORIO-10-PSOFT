package lab10;

public class Grande extends SituacaoMario {
	@Override
	public int getSituacao() {
		return MARIO_GRANDE;
	}

	@Override
	public DadosRetorno pegarCogumelo() {
		return new DadosRetorno(MARIO_GRANDE, 1000);
	}

	@Override
	public DadosRetorno pegarFlor() {
		return new DadosRetorno(MARIO_FLOR, 0);
	}

	@Override
	public DadosRetorno levarDano() {
		return new DadosRetorno(MARIO_PEQUENO, 0);
	}
}