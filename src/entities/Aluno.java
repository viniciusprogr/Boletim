package entities;

public class Aluno {

	public String nome;
	public Double n1;
	public Double n2;
	public Double n3;
	public Double Double;
	public Double media;

	public Double calcularTotal() {
		return n1 + n2 + n3;
	}

	public Double FaltaDePontos() {
		if (calcularTotal() < 60.00) {
			return 60.00 - calcularTotal();
		} else {
			return null;
		}
	}
	
}
