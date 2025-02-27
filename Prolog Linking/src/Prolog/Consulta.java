package Prolog;

import java.util.Map;

import org.jpl7.Query;
import org.jpl7.Term;

public class Consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "consult('C:/Users/last0/Documents/Ejercicios Prolog Lenguajes Progamacion/ej2.pl')";
		Query query = new Query(string);
		System.out.println("El archivo a consultar existe: " + (query.hasSolution() ? "True" : "False"));
		
		System.out.println("\n*************************************************\n");
		
		String s2 = "abuelo(antonio, silvia)";
		Query q2 = new Query(s2);
		System.out.println(s2 + " " + (q2.hasSolution() ? "True" : "False"));
		
		System.out.println("\n*************************************************\n");
		
		String s = "padre(X,juan)";
		Query q = new Query(s);
		//respuesta es pedro
		System.out.println(s + " " + "X = " + (q.oneSolution().get("X")));
		
		System.out.println("\n*************************************************\n");
		
		String s3 = "progenitor(X, emilio)";
		Query q3 = new Query(s3);		
		Map<String, Term>[] respuestas =  q3.allSolutions();
		System.out.println("Padres de emilio: ");
		for(int i = 0; i < respuestas.length; i++)
		{
			//respuestas es:  eva y david
			System.out.println("X = "+ (respuestas[i].get("X")));
		}
 	}

}
