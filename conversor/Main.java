package conversor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//Preparação de leitura do teclado
		InputStreamReader leitorEntrada = new InputStreamReader(System.in);
		BufferedReader leitor = new BufferedReader(leitorEntrada);
		
		//Interação com o usuário
		System.out.println("Digite qual conversão deseja:");
		System.out.println("1- Celsius para Fahrenheit");
		System.out.println("2- Fahrenheit para Celsius");
		System.out.println("3- Celsius para Kelvin");
		System.out.println("4- Kelvin para Celsius");
		System.out.println("5- Fahrenheit para Kelvin");
		System.out.println("6- Kelvin para Fahrenheit");
		
		//Lendo a opção digitada pelo usuário
		int opcaoLida = Integer.parseInt(leitor.readLine());
		
		//Solicitando valor ao usuário
		System.out.println("Digite o valor que deseja converter:");
		
		//Lendo valor digitado pelo usuário
		double valorDigitado = Double.parseDouble(leitor.readLine());
		
		//Criando o conversor
		ConversorTemperatura meuConversor = new ConversorTemperatura();
		
		double resultadoConversao = 0;
		
		if (opcaoLida == 1){
			meuConversor.celsiusParaFahrenheit(valorDigitado);
		}
		if else (opcaoLida == 2){
			meuConversor.fahrenheitParaCelsius(valorDigitado)
		}
		if else(opcaoLida == 3){
			meuConversor.celsiusParaKelvin(valorDigitado)
		}
		if else(opcaoLida == 4){
			meuConversor.kelvinParaCelsius(valorDigitado);
		}
		if else(opcaoLida == 5){
			meuConversor.fahrenheitParaKelvin(valorDigitado);
		}
		if else(opcaoLida == 6){
			meuConversor.kelvinParaFahrenheit(valorDigitado);
		}
		
		
		
		
		
		
	}
}
		
		
		

