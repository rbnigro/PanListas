package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Comparable> lista = new ArrayList<Comparable>();
		lista.add(77);
		lista.add("Ronney");
		lista.add(320.6);
		lista.add("mais um");
		System.out.println(lista);
		lista.remove("Ronney");
		System.out.println("Lista com elementos diferentes: " + lista);
		System.out.println("Lista com nome: " + lista.get(1));
		System.out.println("Lista com valores: " + lista.get(2));
		lista.clear();
		System.out.println("Lista vazia: " + lista);
		lista.forEach(System.out::println);
		System.out.println("--------------------");
		List<Integer> itens = Arrays.asList(11, 10, 16, 5, 85);
		itens.stream().filter(i -> i > 16).forEach(System.out::println);
	}
}
