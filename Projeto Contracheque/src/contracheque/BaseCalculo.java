package contracheque;

public class BaseCalculo {
	String nome;
	double salario;
	double produtividade;
	
	/////////////////////////////////////////////////
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getProdutividade() {
		return produtividade;
	}

	public void setProdutividade(double produtividade) {
		this.produtividade = produtividade;
	}
	
	//////////////////////////////////////////////////////////
    //M�todos
	
	///////////////////////////////////////////////////////////
		public double getValorBruto() {
		return this.salario += this.produtividade;
	}
	
	/////////////////////////////////////////////////////////
	//estou errando nesse ponto
		
		public double getDesconto() {
			var valorBruto = this.getValorBruto();
			var percentual = 30.0 / 100;
			var resultado = valorBruto -= percentual;
			return resultado;
	}	
		
	////////////////////////////////////////////////////////////
		public double getLiquido() {
			return this.getValorBruto() -  this.getDesconto();
	}	
	///////////////////////////////////////////////
	
	
}
