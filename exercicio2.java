package atividades;

public class exercicio2 {

	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		} catch(Throwable erro) {
			System.out.print("Excess�o: ");
			System.out.println(erro);
		} finally {
			System.out.println("Ops! voc� n�o pode dividir um n�mero por 0!");
		}
	}
w
}