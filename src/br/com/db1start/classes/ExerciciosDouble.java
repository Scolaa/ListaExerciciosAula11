package br.com.db1start.classes;

public class ExerciciosDouble {

	private Double valor1;
	private Double valor2;
	private Double valor3;

	public ExerciciosDouble(Double valor1, Double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public ExerciciosDouble(Double valor1, Double valor2, Double valor3) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double getValor3() {
		return valor3;
	}

	public void setValor3(Double valor3) {
		this.valor3 = valor3;
	}

	public Double menorValorEmDois() {
		return Math.min(valor1, valor2);
	}

	public Double menorValorEmTres() {
		Double menor1 = Math.min(valor1, valor2);
		Double menor2 = Math.min(menor1, valor3);
		return menor2;
	}

	public Double retornarMedia() {
		Double resultado = valor1 + valor2 + valor3;
		return resultado / 3;
	}

	public Double calcularAreaDoTriangulo() {
		return (valor1 * valor2) / 2;

	}

}
