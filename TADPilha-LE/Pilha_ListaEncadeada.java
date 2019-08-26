package Classe;

public class Pilha_ListaEncadeada {

	public Pilha_ListaEncadeada() {
	    
	}
	    private No first = null;
	    private int size = 0;

	
	    public void push(Object valor)	    {
	        if(this.first != null){
	            
	            No noTemp = new No(valor, null);
	            // SETANDO O noTemp PARA O PRIMEIRO ELEMENTO DO NO
	            noTemp.setProximo(this.first);

	            // first VAI APONTAR PARA O PRIMEIRO ELEMENTO DO NÓ
	            this.first = noTemp;
	            this.size++;
	            return;
	        }

	        // CRIANDO O OBJ INICIAL DA LL
	        this.first = new No(valor, null);
	        // INTEIRO Q REPRESENTA O TAMANHO DA PILHA
	        this.size++;
	    }

	    public Object pop() throws EPilhaVazia {

	        // VERIFICAR SE A PILHA ESTA VAZIA
	        if(this.isEmpty() == true) throw new EPilhaVazia("Pilha Vazia");	        
	        Object intTemp = this.first.getValor();
	        this.first = this.first.getProximo();

	        this.size--;
	        return intTemp;
	    }

	    public Object top() throws EPilhaVazia {

	        // VERIFICAR SE A PILHA ESTA VAZIA
	        if(this.isEmpty() == true) throw new EPilhaVazia("Pilha Vazia");

	        // RETORNAR O ULTIMO VALOR INSERIDO
	        return this.first.getValor();
	    }

	    public int size()
	    {
	        return this.size;
	    }

	    public boolean isEmpty()
	    {
	        return (this.first != null) ? false : true;
	    }

	
	
	
	
	
	
	
	
	
	
	
}//EOC
