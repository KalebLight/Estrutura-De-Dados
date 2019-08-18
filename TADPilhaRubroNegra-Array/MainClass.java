import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) throws EPilhaVazia {
		
		int menu;
		boolean loop = true;
		Scanner input = new Scanner(System.in);
		Pilha p = new Pilha();
		Object in;
		
		while(loop) {			
			System.out.println("Sair ------------- [0] \nPush(RED) -------- [1] \nPush(Black) ------ [2] \nPop(RED) --------- [3]\nPop(Black) -------"
					+ " [4]\nTop(RED) --------- [5] \nTop(Black) ------- [6]\nEmpty?(RED) ------ [7]\nEmpty?(Black) ---- "
					+ "[8]\nSize(RED) -------- [9]\nSize(Black) ----- [10]\n ");
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
				try {
					System.out.print("Foi tirado da PILHA vermelha ->" + p.pop_Red() + "\n");
				}
				catch(EPilhaVazia e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 4://pop black
				try {
					System.out.print("Foi tirado da PILHA PRETA ->" + p.pop_Black() + "\n");	
				}
				catch(EPilhaVazia e) {
					System.out.println(e.getMessage());
				}				
				break;
				
			case 5://top red
				try {
					System.out.print("O top da PILHA VERMELHA é: " + p.top_Red() + "\n");
				}
				catch(EPilhaVazia e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 6://top black
				try {
					System.out.print("O top da PILHA PRETA é: " + p.top_Black() + "\n");
				}
				catch(EPilhaVazia e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 7://isEmptyRed
					if(p.isEmpty_Red()) {
						System.out.println("A PILHA VERMELHA está vazia" + "\n");
					}
					else {
						System.out.println("Tem alguma coisa na PILHA VERMELHA" + "\n");
					}
				break;

			case 8://isEmptyBlack
				if(p.isEmpty_Black()) {
					System.out.println("A PILHA PRETA está vazia" + "\n");
				}
				else {
					System.out.println("Tem algo na PILHA PRETA" + "\n");
				}
				break;
			
			case 9://sizeRed
				try {
					System.out.print("O tamanho da PILHA VERMELHA é: " +p.size_Red() + "\n");	
				}
				catch(EPilhaVazia e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 10://sizeBlack
				try {
					System.out.print("O tamanho da PILHA PRETA é: " + p.size_Black() + "\n");
				}
				catch(EPilhaVazia e) {
					System.out.println(e.getMessage());
				} 
				break;
				
			}//end of switch
			
		}//eol

	
	
	}//end of daqule role lá
}//eoc
