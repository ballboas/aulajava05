package br.com.ericobalboa.livraria;

public class Ebook extends Livro {

	private String marcadagua;

	public Ebook(String nome, String descricao, double valor, String isbn, Autor autor, String marcadagua) {
		super(nome, descricao, valor, isbn, autor);
		this.marcadagua = marcadagua;
	}

	public String getMarcadagua() {
		return marcadagua;
	}

	public void setMarcadagua(String marcadagua) {
		this.marcadagua = marcadagua;
	}

	public boolean aplicarDescontoDe(double porcentagem) {
		if (porcentagem > 15) {
			return false;
		}
		setValor(getValor() * (100 - porcentagem) / 100);
		return true;
	}

}
