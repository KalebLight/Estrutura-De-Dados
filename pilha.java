public class Pilha {
	
	
	
	Object elementos[];
	int t;


	public Pilha(){
		elementos = new Object[3];
		t = -1;
	}
		
	public void push(Object e) {
		if(t == elementos.length - 1) {
			Object elementos2[];			
			elementos2 = new Object[elementos.length * 2];
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
	
	public Object pop() throws EPilhaVazia{
		if(isEmpty()) {
			throw new EPilhaVazia("Ta vazio!");
		}
		Object e;
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
			
	public Object top() throws EPilhaVazia {
		if(isEmpty()) {
			throw new EPilhaVazia("Ta vazio!");
		}
		return elementos[t];
	}
	
}//eoc
