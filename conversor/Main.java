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
		
		//Criando variável para o resultado
		double resultadoConversao = 0;
		
		//Executando métodos de acordo com a opção digitada pelo usuário
		if (opcaoLida == 1){
			resultadoConversao = meuConversor.celsiusParaFahrenheit(valorDigitado);
			System.out.println(valorDigitado + " graus celsius convertido é igual a " + resultadoConversao + " graus fahrenheit.");
		
		}else if(opcaoLida == 2){
			resultadoConversao = meuConversor.fahrenheitParaCelsius(valorDigitado);
			System.out.println(valorDigitado + " graus fahrenheit convertido é igual a " + resultadoConversao + " graus celsius.");
			
		}else if(opcaoLida == 3){
			resultadoConversao = meuConversor.celsiusParaKelvin(valorDigitado);
			System.out.println(valorDigitado + " graus celsius convertido é igual a " + resultadoConversao + " graus kelvin.");
			
		}else if(opcaoLida == 4){
			resultadoConversao = meuConversor.kelvinParaCelsius(valorDigitado);
			System.out.println(valorDigitado + " graus kelvin convertido é igual a " + resultadoConversao + " graus celsius.");
			
		}else if(opcaoLida == 5){
			resultadoConversao = meuConversor.fahrenheitParaKelvin(valorDigitado);
			System.out.println(valorDigitado + " graus fahrenheit convertido é igual a " + resultadoConversao + " graus kelvin.");
			
		}else if(opcaoLida == 6){
			resultadoConversao = meuConversor.kelvinParaFahrenheit(valorDigitado);
			System.out.println(valorDigitado + " graus kelvin convertido é igual a " + resultadoConversao + " graus fahrenheit.");
			
		}else{
			System.out.println("Opção inválida");
		}
		
	}
}
		
		
		

