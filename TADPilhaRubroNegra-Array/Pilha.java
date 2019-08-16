public class Pilha {
	
	Object elementos[];
	int top_Red, top_Black;
	
	public Pilha() {
		elementos = new Object[4];
		top_Red = -1;
		top_Black = elementos.length;
	}
	
	public void push_Red(Object in) {
		top_Red++;
		elementos[top_Red] = in;
	}
	
	public void push_Black(Object in) {
		top_Black--;
		elementos[top_Black] = in;
	}
	
	public Object top_Red() {
		return elementos[top_Red];
	}
	
	public Object top_Black() {
		return elementos[top_Black];
	}
	
	public Object pop_Red() {
		Object e = elementos[top_Red];
		top_Red--;		
		return e;
	}
	
	public Object pop_Black() {
		Object e = elementos[top_Black];
		top_Black++;
		return e;
	}
	
	
	public boolean isEmpty_Red() {
		if(top_Red == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty_Black() {
		if(top_Black == elementos.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
}//end of class
