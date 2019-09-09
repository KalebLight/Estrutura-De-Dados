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
			System.out.println("1 - Replace \n");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.println("O que você quer inserir?");
				value = input.next();
				System.out.println("Em qual posição?");
				place = input.nextInt();
				vector.set(value, place);
				break;
			
			}//fim do switch/case
			
		}//fim do laço
		
	}//fim daquele troço
}//fim da main
