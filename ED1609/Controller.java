class No{
	String nome;
	No anterior;
	No proximo;
	
public No(String nome){
	this.nome = nome;
	this.anterior = null;
	this.proximo = null;
	}
}

class ListaDuplamenteEncadeada{
	private No inicio;
	private No fim;
	
	public ListaDuplamenteEncadeada(){
	this.inicio = null;
	this.fim = null;
}

public void adicionarPessoa(String nome){
	No novoNo = new No(nome);
	
	if(inicio == null){
	inicio = fim = novoNo;
	} else {
	No atual = inicio;
	while(atual != null && atual.nome.compareTo(nome) < 0){
	atual = atual.proximo;
	}
	
	if(atual == null){
	fim.proximo = novoNo;
	novoNo.anterior = fim;
	fim = novoNo;
	} else if (atual == inicio) {
	novoNo.proximo = inicio;
	inicio.anterior = novoNo;
	inicio = novoNo;
	} else {
	novoNo.anterior = atual.anterior;
	novoNo.proximo = atual;
	atual.anterior.proximo = novoNo;
	atual.anterior = novoNo;
	}
}
}
	public No localizarPessoa(String nome){
	No atual = inicio;
	while(atual != null){
		if (atual.nome.equals(nome)){
		return atual;
		}
		atual = atual.proximo;
	}
	return null;
}

public void removerPessoa(String nome){
	No atual = localizarPessoa(nome);
	if (atual != null){
		if (atual == inicio){
		inicio = atual.proximo;
		if (inicio != null) {
		inicio.anterior = null;
		}
	} else if (atual == fim) {
		fim = atual.anterior;
		if (fim != null){
		fim.proximo = null;
		}
		} else {
		atual.anterior.proximo = atual.proximo;
		atual.proximo.anterior = atual.anterior;
		}
		} else {
		System.out.println("Pessoa não encontrada.");
		}
	}
	
	public void exibirLista(){
	No atual = inicio;
	while (atual != null) {
	System.out.print(atual.nome + " ");
	atual = atual.proximo;
	}
	System.out.println();
	}
}