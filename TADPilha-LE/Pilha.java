package Classes;

import Classes.EPilhaVazia;

public class Pilha {
	
	private int tamanho = 0;
	private No topo = null;
	private Object in;
	
	public Pilha() {
		
	}
	
	public void queue(Object in) {
		if (topo != null) {
			No lol = new No(in, null);
			lol.setProximo(topo);
			topo = lol;
			tamanho++;
		}
		else {
			topo = 	new No(in, null);
			tamanho++;
		}
	}
	
	public Object enqueue() throws EPilhaVazia {
		if(this.topo == null) {
			throw new EPilhaVazia("Pilha Vazia");
		}
		else {
			No temp = topo;
			Object lul = topo.getValor();
			topo = topo.getProximo();
			tamanho--;
			return lul;	
		}
		
	}
	
	
	public Boolean isEmpty() {
		if(tamanho == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Object topo() throws EPilhaVazia{
		if(this.isEmpty() == true) {
			throw new EPilhaVazia("Pilha Vazia");
		}
		else {
			return this.topo.getValor();	
		}
		
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	
	
}//EOC
