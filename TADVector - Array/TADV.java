package Classes;

public class TADV {
	Object elements[];
			
	public TADV() {
		elements = new Object[3];
	}
	
	public Object set(Object value, int place) {
		if(elements[place] != null) {
			Object v_temp = elements[place];
			elements[place] = value;
			return v_temp;
		}
		else {
			elements[place] = value;
			return true;	
		}
	}//Fim do Set
	
	
}//eoc
