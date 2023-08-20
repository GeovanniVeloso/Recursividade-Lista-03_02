package controller;

public class RecursivaN2 {
	public RecursivaN2() {
		super();
	}
	
		/*Explicação: Recebe 2 valores, n1 e n2, separa o resto da divisão do número por 10 e o compara com o n2. Caso seja igual, soma + 1 ao resultado.
		  Tem como condição de parada se n1 for menor que dez, compara ele com n2 ( pois ele será o último dígito ).
		  Se n1 for igual a n2, ele soma +1 ao resultado, se não, mantém o valor padrão ao resultado*/
	
	public int retn (int n1, int n2, int result) {
			if(n1 < 10) {
				return n1 == n2 ? result + 1: result;
			}else {
				if (n1%10 == n2) {
					result = result + 1;
				}
				result = retn(n1/10, n2, result );
			}
			return result;
	}
}

