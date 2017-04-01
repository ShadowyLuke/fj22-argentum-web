package br.com.caelum.argentum.geradores;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candle;
import br.com.caelum.argentum.modelo.SerieTemporal;

public class GeradorDeSerie {

	/**
	 * Serve para ajudar a fazer os testes
	 * 
	 * Recebe uma sequencia de valores e cria candles com abertura, fechamento, 
	 * minimo e maximo iguais, mil de volume e data de hoje. Finalmente, devolve
	 * tais candles encapsuladas em uma Serie Temporal
	 * @param values Valor a ser inserido em uma instancia de Candle
	 * @return uma Serie Temporal composto por Candlesticks de valores repetitivos
	 */
	public static SerieTemporal criaSerie(double... values) {
		List<Candle> candles = new ArrayList<>();
		for (double d : values) {
			candles.add(new Candle(d, d, d, d, 1000, Calendar.getInstance()));
		}
		return new SerieTemporal(candles);
	}

}
