import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num = Arrays.asList(3, 5, 6, 9, 25);
		List<String> name = Arrays.asList("Lucas", "Joao", "Marcos");

		ImprimeLista(num);
		ImprimeLista(name);

	}

	public static void ImprimeLista(List<?> list) {

		for (Object t : list) {
			System.out.println(t);
		}
	}

}
