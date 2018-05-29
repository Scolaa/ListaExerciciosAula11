package br.com.db1start.testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.db1start.classes.ExerciciosDouble;

public class DoubleTeste {

	@Test
	public void testeDouble() {
		ExerciciosDouble valores = new ExerciciosDouble(30d, 40d);
		ExerciciosDouble valores2 = new ExerciciosDouble(30d, 40d, 50d);

		Assert.assertTrue(30d == valores.menorValorEmDois());

		Assert.assertTrue(30d == valores2.menorValorEmTres());

		Assert.assertTrue(40d == valores2.retornarMedia());

		Assert.assertTrue(600d == valores.calcularAreaDoTriangulo());

	}

}
