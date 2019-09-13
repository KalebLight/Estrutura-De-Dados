package Classes;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		int menu, place;
		
		TADV vector = new TADV();
		Object value;
		
		
		while(loop) {
			System.out.println("1 - Replace \n2 - Insert\n3 - Get \n4 - Remove \n8 - Verificar Array");
			menu = input.nextInt();
			switch(menu) {
			
			case 1: //Set
				System.out.println("O que você quer inserir?");
				value = input.next();
				System.out.println("Em qual posição? \n");
				place = input.nextInt();
				vector.set(value, place-1);
				break;
			
			case 2://Insert
				System.out.println("O que você quer inserir?");
				value = input.next();
				System.out.println("Em qual posição? \n");
				place = input.nextInt();
				vector.insert(value, place-1);
				break;
							
			case 3://get
				System.out.println("Qual posição vc quer conferir? ");
				place = input.nextInt();
				System.out.println("Objeto na posição " + place+": " + vector.get(place));
				break;
				
			case 4: //Remove
				System.out.println("Quer apagar qual posição? \n");
				place = input.nextInt();
				System.out.println("Objeto removido: "+ vector.remove(place-1));
				break;
				
			case 8://Verificar Vetor
				System.out.println(vector);
				break;
			}//fim do switch/case
			
		}//fim do laço
		
	}//fim daquele troço
}//fim da main
