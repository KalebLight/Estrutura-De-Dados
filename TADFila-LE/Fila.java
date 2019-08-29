package Classes;

public class Fila {
	private int tamanho = 0;
	private No start = null;
	private No end = null;
	
	public Fila() {		
	}
	
	public void queue(Object in) {
		if (this.start == null) {
			this.start = new No(in, null);
			this.tamanho++;
			return;
		}
		if (this.end == null){
			this.end = new No(in, null);
			this.start.setProximo(this.end);
			tamanho++;
			return;
		}
		
		else {
			No noTemp = new No(in,null);
			this.end.setProximo(noTemp);
			this.end = noTemp;
			this.tamanho++;
		}
	}	
	
	public Object enqueue() throws EFilaVazia{
		if(tamanho == 0) {
			throw new EFilaVazia("Tá vazia!");
		}
		else {
			Object lul = start.getValor();
			start = start.getProximo();
			tamanho--;
			return lul;	
		}				
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public Object comeco() throws EFilaVazia {
		if(tamanho == 0) {
			throw new EFilaVazia("Tá vazia!");
		}
		else {
			return start.getValor();	
		}		
	}
	
	public Object fim() throws EFilaVazia{
		if(tamanho == 0) {
			throw new EFilaVazia("Tá Vazia");
		}
		else {
			return end.getValor();	
		}		
	}
	
}//eoc
