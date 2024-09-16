public class Main {
	public static void main(String[] args){
	ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
	
	lista.adicionarPessoa("José");
	lista.adicionarPessoa("Ana");
	lista.adicionarPessoa("Carlos");
    lista.adicionarPessoa("Abel");
    lista.adicionarPessoa("Angelo");
    lista.adicionarPessoa("Arnaldo");
    lista.adicionarPessoa("João");
    lista.adicionarPessoa("Juan");
    lista.adicionarPessoa("Odair");
    lista.adicionarPessoa("Otávio");

    System.out.println("Lista original:");
	lista.exibirLista();
	
	System.out.println("Lista atualizada:");
	lista.exibirLista();
	
	lista.removerPessoa("José");
	System.out.println("Lista após remover José:");
	lista.exibirLista();
	
	No encontrado = lista.localizarPessoa("José");
		if (encontrado != null) {
		System.out.println("José encontrado.");
		} else {
		System.out.println("José não encontrado.");
		}
	}
}
	