import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) throws EPilhaVazia {
		
		int menu;
		boolean loop = true;
		Scanner input = new Scanner(System.in);
		Pilha p = new Pilha();
		Object in;
		
		while(loop) {			
			System.out.println("\nPush(Red) -------- [1] \nPush(Black) ------ [2] \nPop(Red) --------- [3]\nPop(Black) ------- [4]\nTop(Red) --------- [5] "
					+ "\nTop(Black) ------- [6]\nEmpty?(Red) ------ [7]\nEmpty?(Black) ----- [8]");
			menu = input.nextInt();
			
			switch(menu) {			
			case 1://push red
				System.out.println("Digite oq irá para a PILHA VERMELHA: ");
				in = input.next();
				p.push_Red(in);
				break;		
				
			case 2://push black
				System.out.println("Digite oq irá para a PILHA PRETA: ");
				in = input.next();
				p.push_Black(in);
				break;
				
			case 3://pop red
				System.out.print("Foi tirado da PILHA vermelha ->" + p.pop_Red());
				break;
				
			case 4://pop black
				System.out.print("Foi tirado da PILHA PRETA ->" + p.pop_Black());
				break;
				
			case 5://top red
				System.out.print("O top da PILHA VERMELHA é: " + p.top_Red());
				break;
				
			case 6://top black
				System.out.print("O top da PILHA PRETA é: " + p.top_Black());
				break;
				
			case 7://isEmptyRed
					if(p.isEmpty_Red()) {
						System.out.println("A PILHA VERMELHA está vazia");
					}
					else {
						System.out.println("Tem alguma coisa na PILHA VERMELHA");
					}
				break;

			case 8://isEmptyBlack
				if(p.isEmpty_Black()) {
					System.out.println("A PILHA PRETA está vazia");
				}
				else {
					System.out.println("Tem algo na PILHA PRETA");
				}
			
				
			
			}//end of switch
			
		}//eol

	
	
	}//end of daqule role lá
}//eoc
