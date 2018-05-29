package br.com.db1start.testes;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.classes.ExerciciosString;

public class StringTeste {
	
	@Test
	public void testeString() {
		ExerciciosString array = new ExerciciosString("banana, maça, melancia");
		ExerciciosString textoMinusculo = new ExerciciosString("douglas scola lopes");
		ExerciciosString textoMaiusculo = new ExerciciosString("DOUGLAS SCOLA LOPES");
		ExerciciosString db1 = new ExerciciosString("DB1START");
		ExerciciosString texto = new ExerciciosString(" DB1START ");		
		ExerciciosString vogais = new ExerciciosString("vogal");

			Assert.assertEquals("DOUGLAS SCOLA LOPES", textoMinusculo.retornaMaiuscula());

			Assert.assertEquals("douglas scola lopes", textoMaiusculo.retornaMinuscula());

			Assert.assertTrue(8 == db1.retornaQuantidadeLetras());

			Assert.assertTrue(10 == texto.retornaQuantidadeLetras());

			Assert.assertEquals(8, texto.retornaTrin().intValue());

			Assert.assertEquals("doug", textoMinusculo.retornaQuatroLetras());

			Assert.assertEquals("uglas scola lopes", textoMinusculo.retornaDepoisDoTerceiroChar());

			Assert.assertEquals("OPES", textoMaiusculo.retornaQuatroUltimosChar());

			Assert.assertEquals("ALUNO SCOLA LOPES", textoMaiusculo.retornaAlteracaoPrimeiroNome());

			Assert.assertEquals(3, array.retornaSplit().length);

			Assert.assertEquals(2, vogais.retornaQuantidadeDeVogais().intValue());

			Assert.assertEquals("TRATS1BD", db1.retornaInvertido());

		}
	}

