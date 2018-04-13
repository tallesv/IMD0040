public abstract class Produto
{
	private String id;
	private String nome;
	private double prešo;
	private String marca;
	private String descrišao;
	private String dataDeFabricašao;

	public Produto (String idProduto, String nomeProduto, double prešoProduto, String marcaProduto,
				    String descrišaoProduto, String dataDeFabricašaoProduto) 
	{
		this.id = idProduto;
		this.nome = nomeProduto;
		this.prešo = prešoProduto;
		this.marca = marcaProduto;
		this.descrišao = descrišaoProduto;
		this.dataDeFabricašao = dataDeFabricašaoProduto;
	}

	public String getNome()
	{
		return this.nome;
	}

	public double getPrešo() 
	{
		return this.prešo;
	}

	public void imprimeProduto()
	{
		System.out.print("id: " + this.id + " Nome: " + this.nome + " Prešo: " + this.prešo + " Marca: " + this.marca +
						   " Descrišao: " + this.descrišao + " Data de fabricašao: " + this.dataDeFabricašao);
	}
	
	public abstract boolean disponivelParaVenda();
}