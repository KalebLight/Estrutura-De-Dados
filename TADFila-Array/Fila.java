public class Fila {

	Object elementos[];
	int endOfDLine = -1;
	
	public Fila() {
		elementos = new Object[4];
	}
	
	public void queue(Object in) {
		this.elementos[endOfDLine] = in;
		this.endOfDLine++;
	}
	
	public Object dequeue() {
		this.endOfDLine--;
		return elementos[endOfDLine + 1];
		
	}
}
