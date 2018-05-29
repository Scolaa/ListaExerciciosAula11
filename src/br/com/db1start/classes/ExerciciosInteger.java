package br.com.db1start.classes;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosInteger {

	private Integer valor1;
	private Integer valor2;

	public ExerciciosInteger(Integer valor1, Integer valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public ExerciciosInteger(int i) {
	
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public Integer Somar() {
		return valor1 + valor2;
	}
	
	public Integer Subtrair() {
		return valor1 - valor2;
	}
	
	public Integer Dividir() {
		return valor1 / valor2;
	}
	
	public Integer Multiplicar() {
		return valor1 * valor2;
	}
	
	public Boolean isPar() {
		if(valor1 % 2 == 1) {
			return false;
		}
		return true;
	}
	
	public Integer retornaMaiorValor() {
		return Math.max(valor1, valor2);
	}
	
	public List<Integer> retornaValoresImpares() {
		List<Integer> listaDeImpares = new ArrayList<>();
		for (Integer contador = valor1; contador <= 100; contador++) {
			if (contador % 2 == 1) {
				listaDeImpares.add(contador);
				System.out.println(contador + "é impar!");
			}
		}
		return listaDeImpares;
	}

	
}
