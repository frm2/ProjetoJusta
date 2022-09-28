package desafioJusta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.*;

public class Desafio1 {

	public static void main(String[] args) throws IOException{
		System.out.println("Desafio #1: "
				+ "\nA função deste programa é de receber um array com duas strings contendo números, e devolver quais números pertencem a ambos."
				+ "\nExemplo de formato válido: [\"1, 3, 4, 7, 13\", \"1, 2, 4, 13, 15\"]"
				+ "\nPor favor, digite o array a ser analizado:");
		

		// Criando um buffer para poder receber a input.
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));

		while(true) {
			// Lendo a entrada
			String entry = reader.readLine();

			desafio1(entry);
			
		}
	}
	
	private static void desafio1(String input) {
		if(inputValidator(input))
			System.out.println(returnMatching(input));
		else {
			System.out.println("Formato inválido");
		}
	}

	/**
	 * Esse método serve para assegurar que a string usada como entrada esteja propriamente formatada.
	 */
	private static boolean inputValidator(String input){

		//Remove espaços, pois não são relevantes para analisar a String
		input = input.replace(" ","");
		
		//Estou criando uma expressão regular para validar a entrada com o formato dado pelo desafio
		String regex = "\\[\\\"([0-9]*,)*[0-9]*\\\",\\\"([0-9]*,)*[0-9]*\\\"\\]";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		return matcher.matches();
	}

	/**
	 * Retorna um array de inteiros com os números que estão em ambos arrays dados como entrada.
	 */
	private static ArrayList<String> returnMatching(String input) {
		input = input.replace(" ","");
		
		//Tratando a String de entrada para eventualmente converter em dois arraylists de int
		String[] stringArray = input.split("\",\"");
		
		
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = stringArray[i].replace("[", "");
			stringArray[i] = stringArray[i].replace("]", "");
			stringArray[i] = stringArray[i].replace("\"", "");
		}
		
		String[] firstArray = stringArray[0].split(",");
		String[] secondArray = stringArray[1].split(",");

		ArrayList<String> output = new ArrayList<String>();
		
		//Coloca na output os valores que se encontram em ambos arrays.
		for (String string1 : firstArray) {
			for (String string2 : secondArray) {
				if(string1.equals(string2))
					output.add(string1);
			}
		}
		
		return output;
	}
}
