package br.com.caelum.argentum.modelo;

import java.util.List;

import org.junit.Test;

public class SerieTemporalTest {

	@Test(expected=IllegalArgumentException.class)
	public void naoPodeReceberListNula() {
		List<Candle> candles = null;
		new SerieTemporal(candles);
	}

}
