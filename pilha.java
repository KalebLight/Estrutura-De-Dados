public class pilha {
	int elementos[];
	int t;


	public pilha(){
		elementos = new int[10];
		t = -1;
	}
	
	public void push(int e) {
		if(isFull()) {
			throw new RunTimeException("Ta full otário!")
		}
		t++;
		elementos[t] = e;
	}
	
	public int pop(){
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
		if(t == elementos.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int top() {
		return elementos[t];
	}
	
}//eotc
