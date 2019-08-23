public class Pilha {
	
	Object elementos[];
	int top_Red, top_Black;
	
	public Pilha() {
		elementos = new Object[2];
		top_Red = -1;
		top_Black = elementos.length;
	}
		
	public void push_Red(Object in) {
		int aux = (this.elementos.length * 2) - 1;
		
		if(top_Black - top_Red == 1) {
			Object elementos2[];
			elementos2 = new Object[elementos.length * 2];
						
			//Copying list: RED
			for(int i = 0; i < this.top_Red + 1; i++) {
				elementos2[i] = elementos[i];
			}
				
			//Copying list: BLACK
		    for(int i = (this.elementos.length - 1); i >= this.top_Black; i--) {
		    elementos2[aux] = this.elementos[i];
		    	aux--;
		    }
		   
		    this.top_Black = (this.elementos.length * 2) - (this.elementos.length - this.top_Black);
		    elementos = elementos2;			
		}//End of condition		
		top_Red++;
		elementos[top_Red] = in;		
	}
	
	public void push_Black(Object in) {
		int aux = (this.elementos.length * 2) - 1;
		
		if(top_Black - top_Red == 1) {
			Object elementos2[];
			elementos2 = new Object [elementos.length * 2];
			
			//Copying the list: VERMELHA
			for(int i = 0; i < this.top_Red + 1; i++) {
				elementos2[i] = elementos[i];
			}
			
			//Copying the list: PRETA	
			for(int i = (this.elementos.length - 1) ; i >= this.top_Black ; i--) {
				elementos2[aux] = this.elementos[i];
				aux--;
			}
			
			this.top_Black = (this.elementos.length * 2) - (this.elementos.length - this.top_Black);
		    elementos = elementos2;			
		}//End of condition		
		top_Black--;
		elementos[top_Black] = in;
	}
	
	public Object top_Red() throws EPilhaVazia{
		if(this.isEmpty_Red()) {
			throw new EPilhaVazia("A pilha está vazia");
		}
		else {
			return elementos[top_Red];	
		}		
	}
	
	public Object top_Black() throws EPilhaVazia{
		if(this.isEmpty_Black()) {
			throw new EPilhaVazia("A pilha está vazia");
		}
		else {
			return elementos[top_Black];
		}
	}
	
	public Object pop_Red() throws EPilhaVazia{
		if(this.isEmpty_Red()) {
			throw new EPilhaVazia("A pilha está vazia!");
		}
		else {
			Object e = elementos[top_Red];
			top_Red--;		
			return e;	
		}
	}
	
	public Object pop_Black() throws EPilhaVazia{
		if(this.isEmpty_Black()) {
			throw new EPilhaVazia("A pilha está vazia!");
		}
		else {
			Object e = elementos[top_Black];
			top_Black++;
			return e;
		}		
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
	
	public int size_Red() throws EPilhaVazia{
		if(this.isEmpty_Red()) {
			throw new EPilhaVazia("Ta vazia!");			
		}
		else {
			return top_Red + 1;	
		}		
	}
	
	public int size_Black() throws EPilhaVazia{
		if(this.isEmpty_Black()) {
			throw new EPilhaVazia("Ta vazia!");
		}
		else {
			return elementos.length - top_Black;
		}
	}		
}//end of class
