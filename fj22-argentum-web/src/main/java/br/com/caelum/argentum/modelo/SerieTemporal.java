package br.com.caelum.argentum.modelo;

import java.util.List;

public class SerieTemporal {
	
	private final List<Candle> candles;
	
	public SerieTemporal(List<Candle> candles) {
		if(candles == null) {
			throw new IllegalArgumentException("SerieTemporal(): Nao eh possivel gerar uma SerieTemporal com uma lista nula!");
		}
		this.candles = candles;
	}
	
	public Candle getCandle(int i) {
		return candles.get(i);
	}
	
	public int getUltimaPosicao() {
		return this.candles.size() - 1;
	}
}
