/*
	Dada una lista de números enteros, escribir una función que:
		a) Devuelva una lista con todos los que sean primos.
		b) Devuelva la sumatoria y el promedio de los valores.
		c) Devuelva una lista con el factorial de cada uno de esos números.
*/
import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String]): Unit ={
		var lista = llenarLista(5,100)
		//lista = limpiarRepetidos(lista)
		println(lista)
		println("Numero Primos: ")
		println(obtenerNumPrim(lista))
		println("Sumatoria: ")
		println(obtenerSumatoria(lista))
		println("Promedio: ")
		println(obtenerPromedio(lista))
	}
	def obtenerNumPrim(numeros:List[Int]): List[Int] = {
		numeros.filter(esPrimo(_))
	}
	def esPrimo(num:Int): Boolean = {
		var contador = 2;
		var primo=true;
		while ((primo) && (contador!=num)){
		  if (num % contador == 0)
		    primo = false;
		  contador += 1;
		}
		primo
	}
	def obtenerSumatoria(numeros:List[Int]): Double = {
		var s = 0.0
		numeros.foreach(s+=_)
		s
	}
	def obtenerPromedio(numeros:List[Int]): Double = {
		obtenerSumatoria(numeros)/numeros.length
	}
	def llenarLista(tam:Int,max:Int): List[Int] = {
		var lista = List[Int]()
		for(i<-0 until tam)
			lista = lista :+ obtenerNumeroAleatoria(max)
		lista
	}
	def obtenerNumeroAleatoria(max:Int): Int = {
		val r = scala.util.Random
		r.nextInt(max)
	}
}