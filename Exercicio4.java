import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		String nome;
		System.out.println("Digite seu nome");
		nome = scann.nextLine();
		for (int i = 0; i <= 10; i++) {
			System.out.println(nome);
		}

	}

}
