package desafioJusta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desafio2 {

	public static void main(String[] args) throws IOException{
		System.out.println("Desafio #2: "
				+ "\nA função deste programa é de receber uma string, e retornar a palavra nesta string com maior tamanho (ignorando números)."
				+ "\n (Caso hajam múltiplas strings com o tamanho correto, a primeira será mostrada)"
				+ "\nPor favor, digite a string a ser analizada:");
		

		// Criando um buffer para poder receber a input.
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		while(true) {
			// Lendo a entrada
			String entry = reader.readLine();

			System.out.println(desafio2(entry));
			
		}
		
	}
	private static String desafio2(String input) {
		
		//Separa a String num array, usando os espaços para separar os elementos.
		String[] arrayString = input.split(" ");
		
		String output = "ERRO";
		int length = 0;
		
		for (String string : arrayString) {
			if (removeDigits(string).length() > length) {
				length = removeDigits(string).length();
				output = string;
			}
		}
		
		return output;
	}
	
	/**
	 * Remove os números da String para que seu tamanho possa ser comparado apenas com as letras e outros componentes.
	 * @param input
	 * @return
	 */
	private static String removeDigits(String input) {
		// \d refere-se a um dígito em termos de expressão regular, então replaceAll("\\d", "") substitue 
		// todos os dígitos de uma string com a string vazia, efetivamente os removendo
		return input.replaceAll("\\d", "");
	}
	
}
