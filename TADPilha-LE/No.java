package Classe;
public class No {
    private Object valor;
    private No proximo;

    public No(Object valor, No proximo)
    {
        this.valor = valor;
        this.proximo = proximo;
    }

    public Object getValor()
    {
        return this.valor;
    }

    public void setValor(Object valor)
    {
        this.valor = valor;
    }

    public No getProximo()
    {
        return this.proximo;
    }

    public void setProximo(No proximo)
    {
        this.proximo = proximo;
    }

   
}