package br.com.db1start.testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.db1start.classes.ExerciciosInteger;

public class IntegerTeste {

	@Test
	public void testeInteger() {
		ExerciciosInteger valores = new ExerciciosInteger(20, 2);
		ExerciciosInteger valor = new ExerciciosInteger(12);
		ExerciciosInteger maiorValor = new ExerciciosInteger(50, 30);
		ExerciciosInteger retornaImpares = new ExerciciosInteger(0);

		Assert.assertEquals(22, valores.Somar().intValue());
		Assert.assertEquals(18, valores.Subtrair().intValue());
		Assert.assertEquals(10, valores.Dividir().intValue());
		Assert.assertEquals(40, valores.Multiplicar().intValue());

		Assert.assertEquals(Boolean.FALSE, valor.isPar().booleanValue());

		Assert.assertEquals(50, maiorValor.retornaMaiorValor().intValue());

		Assert.assertEquals(50, retornaImpares.retornaValoresImpares().size());

	}

}
