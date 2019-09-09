package Classes;

import java.util.Arrays;

public class TADV {
	Object elements[];
			
	public TADV() {
		elements = new Object[10];
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
	
	public Object remove(int place) {
		Object v_temp = elements[place];
		elements[place] = null;
		return v_temp;
	}
	
	public String toString() {
		return Arrays.toString(elements);
	}
	
}//eoc
