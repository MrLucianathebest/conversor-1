public class ConversorTemperatura {
	int celsiusParaFahrenheit(){
		return 9*40/5+32;
	}

	int celsiusParaFahrenheit(int valorCelsius){
		return 9*valorCelsius/5+32;
	}	
	
	double celsiusParaFahrenheit(double valorCelsius){
		return valorCelsius*1.8+32;
	}
	
	double celsiusParaKelvin(double valorCelsius){
		return valorCelsius+273.15;
	}
	
	double fahrenheitParaCelsius(double valorFahrenheit){
		return (valorFahrenheit-32)/1.8 ;
	}
	
	double fahrenheitParaKelvin(double fahrenheit){
		return ((valorFahrenheit-32)/1.8)+273.15;
	}
	
	
	double kelvinParaCelsius(double valorKelvin){
		return valorKelvin-273.15;
	}
	
	double kelvinParaFahrenheit(double valorKelvin){
		return (valorKelvin - 273.15)*1.8+32;
	}		
}
