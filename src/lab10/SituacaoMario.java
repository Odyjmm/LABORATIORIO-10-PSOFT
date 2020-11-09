package lab10;

public abstract class SituacaoMario {
	public static final int MARIO_MORTO = 0;
	public static final int MARIO_PEQUENO = 1;
	public static final int MARIO_GRANDE = 2;
	public static final int MARIO_FLOR = 3;
	
	public abstract int getSituacao();
	public abstract DadosRetorno pegarCogumelo();
	public abstract DadosRetorno pegarFlor();
	public abstract DadosRetorno levarDano();
}