import java.util.ArrayList;
import java.util.InputMismatchException;

// LINK DE AYUDA : http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/excepciones/excepciones.htm
class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
};


public class Ejercicios {

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		// Establesco una variable int que usare para la operacion
		int num = 0;
		try{ 
			//inicio con el try e introduzco la operacion
			num = (a/b);
		}catch(ArithmeticException e1)
		//El catch manejara la exception en caso de que se introduzca 0
		{
			System.out.print("ERROR: No se puede dividir entre 0");
			// Se imprime cual fue el error
		}
		//En caso de que no se encuentre error devuelve num
		return num;
	}
	
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{
		try{
			// Inicio con el try y devuelvo el arreglo tomando como valor pos
		return arreglo[pos];
		}catch(ArrayIndexOutOfBoundsException e2)
		// El catch encontrara si se excedio el limite del arreglo
		{
			System.out.print("ERROR: Fuera de limites");
			// Se imprime cual fue el error
		}
		//Si no hay error se devuelve el arreglo con el valor de pos
		return arreglo[pos];
	}
	
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{
		try{
		//Inicio el try devolviendo la x de mi_clase
		return  mi_clase.x;
		}catch(InputMismatchException e3)
		//el catch capturara si mi_clase da igual a Null
		{
			System.out.print("ERROR: Null");
		}
		//si no hay error se devuelve la x de mi clase
		return mi_clase.x;
	}
	
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	// en este ejercicio tome como apoyo los ejercicios hechos en clase
	{
		// Inicio con dos varibales: promedio y numsuma, promedio es la que devolvera el resultado y numsuma sera la suma de todos los elementos
		int promedio = 0;
		int numsuma = 0;
		//ciclo for con un contador de elementos de  mi_lista
		for (int i = 0; i < mi_lista.size(); i++)
		{
			//Aqui las operaciones. numsuma sera igual a lo que tenga + mi_lista con lo que tenga como valor i en ese momento
			numsuma = numsuma + mi_lista.get(i);
			//promedio sera igual a la suma de los elementos entre mi lista con lo que tenga como valor i
			promedio = numsuma/mi_lista.get(i);
		}
		//se devuelve el promedio
		return promedio;	
			
	}
	
	
	//Devuelve el numero mayor almacenado en 'mi_lista'
	static int getMayor(ArrayList<Integer> mi_lista)
	// LINK DE AYUDA : http://www.javaya.com.ar/detalleconcepto.php?codigo=92&inicio= 
	{
		// inicio con la variable mayor
		int mayor = 0;
		// la variable mayor contendra lo que tenga mi_lista
		mayor = mi_lista.get(0);
		
		// ciclo for que cuenta cada uno de los elementos en el array
		for(int i = 0; i < mi_lista.size(); i++)
		{
			// condicion if que compara mi_lista con lo que tenga i contra el valor de la variable mayor
		if (mi_lista.get(i) > mayor);
		// mayor tendra el valor de mi_lista con i como parametro
		mayor = mi_lista.get(i);
		}
		// se devuelve el mayor del arreglo
		return mayor;
		
	}
	
	
	//Devuelve true si 'mi_lista' contiene 'str' de lo contrario devuelve false
	static boolean existe(ArrayList<String> mi_lista, String str)
	{
		//este contador pasara por todos los strings del arreglo
		for(int i = 0; i < mi_lista.size(); i++)
		{
			//si hay un string que sea igual a "str" entonces devolvera true
		if (mi_lista.get(i) == "str")
			return true;
		}
		// si no se cumple la condicion devolvera false
		return false;
	}
	
	
	public static void main(String[] args)
	{ 
	}

}
