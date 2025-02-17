package view;
import controller.metodos;
public class principal {
	public static void main(String[] args){
		metodos m = new metodos();
		int vetor[] = {2,3,4,5,6,7,8,9,10};
		int tamanho = vetor.length;
		tamanho--;
		int qtd = 0;
		System.out.print(m.vetorPar(vetor, tamanho, qtd));
	}
}