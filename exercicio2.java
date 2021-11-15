package atividades;

public class exercicio2 {

	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		} catch(Throwable erro) {
			System.out.print("Excessão: ");
			System.out.println(erro);
		} finally {
			System.out.println("Ops! você não pode dividir um número por 0!");
		}
	}
w
}