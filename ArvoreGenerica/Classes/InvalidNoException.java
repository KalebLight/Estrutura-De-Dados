package Classes;
public class InvalidNoException extends Exception{

	private static String msg;

	public InvalidNoException() {
		super(msg);
	}
	public void insert(Object value, int place) {
		if(this.size == elements.length) {
			Object [] temp_elements = new Object[elements.length * 2];
			for(int i = 0; i <= elements.length; i++) {
				temp_elements[i] = elements[i];
				this.elements = temp_elements;
			}			
		}	   
       if(elements[place] != null) { 
    	   for (int i = (this.elements.length-1); i < place; i--){
    		   this.elements[i] = this.elements[i-1];
    		   i--;
        	}
        }        
        this.elements[place] = value;
        size++;
	}//Fim do insert
	
	public Object set(Object value, int place) {
		if(elements[place] != null) {
			Object v_temp = elements[place];
			elements[place] = value;
			return v_temp;
		}
		else {
			elements[place] = value;
			size++;
			return true;
			}	
	}//Fim do Set
	
	public Object remove(int place) {
		Object v_temp = elements[place];
		elements[place] = null;
		size--;
		for(int i = place; i < (this.elements.length - 1); i++)
	       {
	            this.elements[i] = this.elements[i+1];
	            this.elements[i+1] = null;
	       }
		return v_temp;
	}
}
