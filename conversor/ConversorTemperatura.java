package conversor;

public class ConversorTemperatura {
	//Métodos

	public double celsiusParaFahrenheit(double valorCelsius){
		return valorCelsius * 1.8 + 32;
	}

	public double celsiusParaKelvin(double valorCelsius){
		return valorCelsius + 273.15;
	}	

	public double fahrenheitParaCelsius(double valorFahrenheit){
		return (valorFahrenheit - 32) / 1.8;
	}

	public double fahrenheitParaKelvin(double valorFahrenheit){
		return ((valorFahrenheit - 32) / 1.8) + 273.15;
	}

	public double kelvinParaCelsius(double valorKelvin){
		return valorKelvin - 273.15;
	}

	public double kelvinParaFahrenheit(double valorKelvin){
		return (valorKelvin - 273.15) * 1.8 + 32;
	}	
}