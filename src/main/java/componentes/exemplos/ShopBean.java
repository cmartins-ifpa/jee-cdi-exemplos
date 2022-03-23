package componentes.exemplos;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ShopBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Produto produto;
    private List<Produto> produtos;
    private Integer quantPedido = 1;

    public String fazerPedido() {
    	 this.produto.baixarEstoque(this.quantPedido);
    	 return "";
    }
    public ShopBean() {
		// inicializa um produto
    	this.produto = new Produto("CANETA BIC", 250);
    	System.out.println("Produto Criado!");
	}

    // Getters e Setters    
    public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Integer getQuantPedido() {
		return quantPedido;
	}
	public void setQuantPedido(Integer quantPedido) {
		this.quantPedido = quantPedido;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
        
}