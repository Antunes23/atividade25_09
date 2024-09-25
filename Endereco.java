package Modificadores;

public class Endereco {

	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private Cidade cidade;
	
	public Endereco(String rua, int numero, String bairro, String cep, Cidade cidade) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}

	public String getrua() {
		return rua;
	}
	public void setrua (String rua) {
		this.rua = rua; 
	}
	public int getnumero() {
		return numero;
	}
	public void setnumero (int numero) {
		this.numero = numero;
	}
	public  String getbairro() {
		return bairro;
	}
	public void setbairro (String bairro) {
		this.bairro = bairro;
	}
	public String getcep() {
		return cep;
	}
	public void setcep (String cep) {
		this.cep = cep;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade (Cidade cidade) {
		this.cidade = cidade;
	}

}
