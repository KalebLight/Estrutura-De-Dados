import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;
		int menu;
		
		pilha p = new pilha();
		int in;
		
				
		while(loop) {
			System.out.println("\n Push  -  [1] \n Pop   -  [2] \n Vazia? - [3] \n Cheia? - [4]"
					+ " \n Topo  -  [5] \n Sair - [0] ");
			menu = input.nextInt();
			switch(menu) {
			
			case 1://push
				System.out.println("\n Digite o número a ir pra pilha \n");
				in = input.nextInt();
				p.push(in);
				break;			
			
			case 2://pop
				if(p.isEmpty()) {
					System.out.println("A pilha está vazia.");
				}
				else {
					System.out.printf("O número %d foi descartado da pilha", p.pop());
				}
				break;
				
			case 3://isEmpty
				if(p.isEmpty()) {
					System.out.println("A pilha ta vazia.");
				}
				else {
					System.out.println("Tem algo na pilha.");
				}
				break;
				
			case 4://isFull	
				if(p.isFull()) {
					System.out.println("A pilha tá cheia");
				}
				else {
					System.out.println("A pilha não ta cheia.");
				}
				break;
				
			case 5://top
				if(p.isEmpty()){
					System.out.println("A pilha ta vazia");
				}
				else {
					System.out.printf("O topo da pilha é: %d ", p.top());	
				}
				
				break;
				
			case 0:
				loop = false;
				
				break;
			}
				
		}//end of loop
		
	}
}