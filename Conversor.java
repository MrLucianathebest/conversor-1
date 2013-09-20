public class Conversor {
	
	double celsiusParaFahrenheit(double celsius){
		return celsius*1.8+32;
	}
	
	double celsiusParaKelvin(int celsius){
		return celsius+273.15;
	}
	
	double fahrenheitParaCelsius(int fahrenheit){
		return (fahrenheit-32)/1.8 ;
	}
	
	double fahrenheitParaKelvin(int fahrenheit){
		return ((fahrenheit-32)/1.8)+273.15;
	}
	
	
	double kelvinParaCelsius(int kelvin){
		return kelvin-273.15;
	}
	
	double kelvinParaFahrenheit(int kelvin){
		return (kelvin - 273.15)*1.8+32;
	}		
}