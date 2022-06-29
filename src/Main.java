import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
				
		System.out.println("nome:");
		aluno.nome = sc.next();
		System.out.println("notas:");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		System.out.println("sua nota: " + aluno.calcularTotal());
		if(aluno.calcularTotal() >= 60) {
			System.out.println("aprovado");
		}
		else {
			System.out.println("reprovado, faltou: " + aluno.FaltaDePontos());
		}
		
		
		
		
		
		
		
		
		sc.close();
	}
}
