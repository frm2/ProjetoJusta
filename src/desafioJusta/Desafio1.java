package desafioJusta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class Desafio1 {

	public static void main(String[] args) throws IOException{
		System.out.println("Desafio #1: "
				+ "\nA função deste programa é de receber um array com duas strings contendo números, e devolver quais números pertencem a ambos,"
				+ "\nFormato válido exemplo: [\"1, 3, 4, 7, 13\", \"1, 2, 4, 13, 15\"]"
				+ "\nPor favor, digite o array a ser analizado:");
		
		inputValidator("[\"1, 3, 4, 7, 13\", \"1, 2, 4, 13, 15\"]");
		
//		// Criando um buffer para poder receber a input.
//		BufferedReader reader = new BufferedReader(
//				new InputStreamReader(System.in));
//
//		// Lendo a entrada
//		String name = reader.readLine();
//
//		// Printing the read line
//		System.out.println(name);
	}
	
	/**
	 * Esse método serve para assegurar que a string usada como entrada esteja propriamente formatada.
	 * @param input
	 * @return
	 */
	private static String[] inputValidator(String input){
	
		String[] output = new String[2];

		//Remove espaços, pois não são relevantes para analisar a String
		input = input.replace(" ","");
			
		//Estou criando uma expressão regular para validar a entrada
		String regex = "\\[\\\"([0-9],)*[0-9]*\\\",\\\"([0-9]*,)*[0-9]*\\\"\\]";
		
		System.out.println(regex);
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		System.out.println(matcher.matches());
		
		return output;
	}
}
