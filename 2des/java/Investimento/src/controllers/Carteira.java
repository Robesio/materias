package controllers;

public class Carteira {

	private int id;
	private String nome;
	private double lucroEsperado, prejuisoMaximo;
	private String perfilDeInvestimento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLucroEsperado() {
		return lucroEsperado;
	}
	public void setLucroEsperado(double lucroEsperado) {
		this.lucroEsperado = lucroEsperado;
	}
	public double getPrejuisoMaximo() {
		return prejuisoMaximo;
	}
	public void setPrejuisoMaximo(double prejuisoMaximo) {
		this.prejuisoMaximo = prejuisoMaximo;
	}
	public String getPerfilDeInvestimento() {
		return perfilDeInvestimento;
	}
	public void setPerfilDeInvestimento(String perfilDeInvestimento) {
		this.perfilDeInvestimento = perfilDeInvestimento;
	}
	
	public String toHTML() {
		return "<td>" + id + "</td><td>" + nome + "</td><td>" + lucroEsperado + "</td><td>"
				+ prejuisoMaximo + "</td><td>" + perfilDeInvestimento + "</td>";
	}
}
