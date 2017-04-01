package br.com.caelum.argentum.grafico;

import org.primefaces.model.chart.ChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

import br.com.caelum.argentum.indicadores.MediaMovelSimples;
import br.com.caelum.argentum.modelo.SerieTemporal;

public class GeradorModeloGrafico {
	private SerieTemporal serie;
	private int comeco;
	private int fim;
	private LineChartModel grafico;
	
	public GeradorModeloGrafico(SerieTemporal serie, int comeco, int fim) {
		this.serie = serie;
		this.comeco = comeco;
		this.fim = fim;
		this.grafico = new LineChartModel();
	}
	
	public void plotaMediaMovelSimples() {
		MediaMovelSimples indicador = new MediaMovelSimples();
		LineChartSeries chartSerie = new LineChartSeries("MMS - Fechamento");
		
		for (int i = this.comeco; i <= this.fim; i++) {
			double valor = indicador.calcula(i, serie);
			chartSerie.set(i, valor);
		}
		this.grafico.addSeries(chartSerie);
		this.grafico.setLegendPosition("w");
		this.grafico.setTitle("Indicadores");
	}
	
	public ChartModel getModeloGrafico() {
		return this.grafico;
	}
}
