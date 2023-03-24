//Com tipos curinga podemos fazer m�todos
//que recebem um gen�rico de "qualquer tipo":

package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			/*list.add(3); erro de compila��o
			Por�m n�o � poss�vel adicionar dados a uma
			cole��o de tipo curinga. O compilador n�o sabe 
			qual � o tipo espec�fico do qual a lista foi instanciada.
			*/
			System.out.println(obj);
		}
	}
}