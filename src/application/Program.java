//Com tipos curinga podemos fazer métodos
//que recebem um genérico de "qualquer tipo":

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
			/*list.add(3); erro de compilação
			Porém não é possível adicionar dados a uma
			coleção de tipo curinga. O compilador não sabe 
			qual é o tipo específico do qual a lista foi instanciada.
			*/
			System.out.println(obj);
		}
	}
}