package br.com.ericobalboa.livraria;

public class Livro {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;

	public Livro(String nome, String descricao, double valor, String isbn, Autor autor) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.isbn = isbn;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
/*	public boolean aplicarDescontoDe(double porcentagem){
		boolean aplicouDesconto = false;
		if(impresso){
			if(porcentagem <= 30){
				aplicouDesconto = true;
				this.valor *= (100 - porcentagem)/100;
			}
		} else {
			if(porcentagem <= 15){
				aplicouDesconto = true;
				this.valor *= (100 - porcentagem)/100;
			}
		}
		return true;
	}*/	
}
