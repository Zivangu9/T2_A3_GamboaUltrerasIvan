/*
	Escriba un programa que permita crear una lista de palabras y que, a continuación, 
	pida una palabra y diga cuántas veces aparece esa palabra en la lista.
*/
import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String]): Unit ={
		val palabras = llenarLista
		//println(palabras)
		println("Se encontraron "+buscarPalabra(palabras,leerPalabra)+" palabras iguales en la lista") 
	}
	def leerPalabra(): String = {
		readLine("Ingresa la palabra a buscar: ")
	}
	def buscarPalabra(palabras:List[String],palabra:String): Int = {
		var cont = 0
		for(p<-palabras)
			if(p==palabra)
				cont += 1
		cont
	}
	def llenarLista(): List[String] = {
		List(
			"Gregorianizer","nitroalizarin","chicness","Diascia","decreaseless","Herpetomonas","Ulotrichaceae","overcunning","determinateness","chondrosarcomatous",
			"sociolegal","nammad","empyrean","semivitrification","coseism","swayed","psychophysiologically","cyanemia","obitual","capitellate",
			"fairstead","penumbra","thoughtlessness","Venedotian","Zauschneria","unexchanged","cadenza","vomitwort","Baduhenna","hydronephrosis",
			"inmixture","euonymous","antioxidant","unrevealingly","fruitcake","vigilation","Diervilla","schoolteacherly","colporrhexis","longheadedly",
			"marengo","undilatory","seer","glusid","filose","glossokinesthetic","overblithe","hypophysectomize","pseudofeminine","intersessional",
			"detector","Titianic","metafluidal","pteroylglutamic","subjectivity","albiflorous","displayed","Anogra","hearth","turnscrew",
			"sacculus","kora","tuberculosectorial","kinematically","epulo","obsignate","vandalroot","orthopod","hesitancy","blind",
			"cerebrasthenic","foghorn","capocchia","nonpreformed","routously","Tamashek","cymbocephalous","venerative","conima","faulter",
			"deathful","singled","befeather","palaeobotanic","Cadmopone","carefree","Melanippus","epicotyledonary","passival","Thad",
			"mitochondria","tetradecane","bedtime","overdiscouragement","prodigality","puzzleheaded","chic","tume","opisthographic","unequivalve",
			"vaccinization","frog","arteriogenesis","overnicety","electrovalency","unilamellar","Anisodactyli","interinhibitive","honied","Khaldian",
			"relief","plagionite","reamer","pacable","pattu","elapoid","creambush","commissionship","husbandless","unplated",
			"counterbewitch","begirdle","nutritionally","aplanatic","Chicomecoatl","feuille","misopedism","septan","chastely","Brahmanism",
			"keeperless","metaphor","Guaharibo","nonhunting","veratrize","biocoenose","calculated","pseudodipteros","semicrustaceous","fantasque",
			"ironstone","phrenitis","jaguar","pelorize","kryptic","breathe","unkist","nonenunciation","expatiatory","Logris",
			"importunate","tucket","vociferize","neuroglic","monatomic","eudiaphoresis","tenderfootish","disilicide","enantiomorphic","spinel",
			"alimenter","scrubbird","slopingly","miscegenator","Orycteropodidae","lierre","counterwork","Euphorbiaceae","unforegone","needlessly",
			"legality","asmoke","Guadagnini","unbedashed","grottoed","Odontopteris","homeokinesis","report","epimorphosis","myriarchy",
			"electromobile","unsulliedness","fabliau","unblundering","raggily","holdership","prerespiration","absentation","hyetography","tar",
			"viceroyship","mediopontine","iberite","hypotonia","entocele","lullingly","lathhouse","sendee","unmeetly","unminister"
		)
	}
}