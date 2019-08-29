package Classes;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) throws EFilaVazia{
		Scanner input = new Scanner(System.in);
		int menu;
		Boolean loop = true;
		Object in;
		Fila f = new Fila();
		
		while(loop) {
			System.out.println("Sair --------- [0] \nQueue  ------  [1] \nEnqueue -----  [2] \nComeço ------- [3] \nFim ---------- [4]"
					+ " \nSize --------- [5]");
			menu = input.nextInt();
			switch(menu) {
			case 1://queue
				System.out.println("O que vc quer botar na fila?");
				in = input.next();
				f.queue(in);
				break;
				
			case 2://enqueue
				try{
					System.out.print("O que saiu da fila é: " + f.enqueue() + "\n");	
				}
				catch(EFilaVazia e) {
					System.out.println(e.getMessage());
				}				
				break;
				
			case 3://Começo da fila
				try {
					System.out.println("O começo da fila é: " + f.comeco() + "\n");	
				}
				catch(EFilaVazia e) {
					System.out.println(e.getMessage());
				}				
				break;
				
			case 4://Fim da fila
				try {
					System.out.println("O final da fila é: " + f.fim() + "\n");	
				}
				catch(EFilaVazia e) {
					System.out.println(e.getMessage());
				}				
				break;
				
			case 5://Tamanho
				System.out.println("O tamanho da fila é de: " + f.tamanho() + "\n");
				break;
				
			case 0:
				loop = false;
				break;
				
			}//switch
		}//while(loop)
		
	}//end daquele rolé lá
	
	
}//eoc
