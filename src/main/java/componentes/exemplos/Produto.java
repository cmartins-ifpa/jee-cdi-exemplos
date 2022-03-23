package componentes.exemplos;

import java.io.Serializable;

public class Produto implements Serializable {
    private String nome;
    private Integer   quantEstoque;
    
    public Produto() {}
    public Produto(String nome, int quant) {
		super();
		this.nome = nome;
		this.quantEstoque = quant;
	}
	// Getters e Setters    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantEstoque() {
		return quantEstoque;
	}
	public void setQuantEstoque(Integer quantEstoque) {
		this.quantEstoque = quantEstoque;
	}
	public void baixarEstoque(Integer quantPedido) {
		this.quantEstoque = this.quantEstoque - quantPedido;
	}
}
