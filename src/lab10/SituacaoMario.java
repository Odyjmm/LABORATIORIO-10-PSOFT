package lab10;

public abstract class SituacaoMario {
	public static final int MARIO_PEQUENO = 0;
	public static final int MARIO_GRANDE = 1;
	public static final int MARIO_FOGO = 2;
	
	public abstract int getSituacao();
}