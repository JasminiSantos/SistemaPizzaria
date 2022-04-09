
public class Pizza {
	private String tamanho;
	private Double preco;
	private String sabor;
	
	public Pizza(String tamanho, Double preco, String sabor) {
		this.tamanho = tamanho;
		this.preco = preco;
		this.sabor = sabor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
}
