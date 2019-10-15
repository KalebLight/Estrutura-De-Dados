package Classes;

import java.util.Iterator;
import java.util.Vector;

public class ArvoreGenerica
{
	//Atributos da arvore
	No raiz;
	int tamanho;
	
	//Construtor
	public ArvoreGenerica(Object o)
	{
		raiz = new No(null, o);
		tamanho = 1;
	}
	
	/** Retorna a raiz da  árvore */
	public No root()
	{
		return raiz;
	}
	
	/** Retorna o No pai de um No */
	public No parent(No v)
	{
		return (v.parent());
	}

	/** retorna os filhos de um No */
	public Iterator children(No v)
	{
		return v.children();
	}
	
	/** Testa se um No é interno */
	public boolean isInternal(No v)
	{
		return (v.childrenNumber() > 0);
	}
	
	/** Testa se um No é externo*/
	public boolean isExternal(No v)
	{
		return (v.childrenNumber() == 0);
	}
	
	/** Testa se um No eh a raiz */
	public boolean isRoot(No v)
	{
		return v == raiz;
	}
	
	/** Adiciona um filho a um No */
	public void addChild(No v, Object o)
	{
		No novo = new No(v, o);
		v.addChild(novo);
		tamanho++;
	}
	/** Remove um No
	 *  Só pode remover Nos externos e que tenham um pai (Noo seja raiz)
	*/
	public Object remove(No v) throws InvalidNoException
	{
		No pai = v.parent();
		if (pai != null || isExternal(v))
			pai.removeChild(v);
		else
			throw new InvalidNoException();
		Object o = v.element();
		tamanho--;
		return o;
	}
	/** Troca dois elementos de posicao */
	public void swapElements(No v, No w)
	{
		/* Metodo que serve de exercicio
		 * Este metodo devera fazer com que o objeto
		 * que estava na posicao V fique na posicao W
		 * e fazer com que o objeto que estava na posicao W
		 * fique na posicao V
		 */  
		
	}
	/** Retorna a profundidade de um No */
	public int depth(No v)
	{
		int profundidade = profundidade(v);
		return profundidade;
	}
	private int profundidade(No v)
	{
		if (v == raiz)
			return 0;
		else
			return 1 + profundidade(v.parent());
	}
	/** Retorna a altura da árvore */
	public int height()
	{
		// Metodo que serve de exercício
		int altura = 0;
		return altura;
	}
	/** Retorna um iterator com os elementos armazenados na árvore */
	public Iterator elements()
	{
		// Método Noo implementados --- Coleguinha fique a vontade para fazê-los
		return null;
	}
	/** Retorna um iterator com as posicoes (Nos) da arvore */
	public Iterator Nos()
	{
		// Metodo Noo implementados --- Coleguinha fique a vontade para faze-los
		return null;
	}
	/** Retorna o Nomero de Nos da árvore
	 */
	public int size()
	{
		return 0;
	}
	/** Retorna se a avore esta vazia. Sempre vai ser falso, pois Noo permitimos remover a raiz
	 */
	public boolean isEmpty()
	{
		return false;
	}
	public Object replace(No v, Object o)
	{
		// Metodo de exercicio
		return null;
	}
}
	/* INocio da classe aninhada para armazenar o No*/
	
