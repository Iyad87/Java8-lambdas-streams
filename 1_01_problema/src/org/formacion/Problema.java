package org.formacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Problema {

	public static void main(String[] args) {

		List<String> nombres = Arrays.asList("Juan", "Antonia", "Pedro");

//		Comparator<String> comparadorLongitud = (o1, o2) -> o1.length() - o2.length();
//		Collections.sort(nombres, comparadorLongitud);

		
		List<String> nombresOrdered = nombres.stream().sorted((o1, o2) -> o1.length() - o2.length()).collect(Collectors.toList());
		
		System.out.println(nombresOrdered);
	}

}
