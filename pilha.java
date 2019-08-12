public class Pilha {
	
	
	
	int elementos[];
	int t;


	public Pilha(){
		elementos = new int[3];
		t = -1;
	}
		
	public void push(int e) {
		if(t == elementos.length - 1) {
			int elementos2[];
			
			elementos2 = new int[elementos.length * 2];
			for(int i = 0; i < elementos.length; i++) {
				elementos2[i] = elementos[i];
			}	
				elementos = elementos2;
				t++;
				elementos[t] = e;
		}
		else {
			t++;
			elementos[t] = e;
		}
	}
	
	public int pop() throws EPilhaVazia{
		if(isEmpty()) {
			throw new EPilhaVazia("Ta vazio!");
		}
		int e;
		e = elementos[t];
		t--;
		return e;
	}
		
	public boolean isEmpty() {
		if (t == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(t == elementos.length - 1) {
			return true;
		}
		else {
			return false;
		}
	}
			
	public int top() throws EPilhaVazia {
		if(isEmpty()) {
			throw new EPilhaVazia("Ta vazio!");
		}
		return elementos[t];
	}
	
}//eoc
