/*
	Escriba un programa que permita crear una lista de palabras y que, 
	a continuación, pida una palabra y elimine esa palabra de la lista.
*/
import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String]): Unit ={
		var palabras = llenarLista
		// println(palabras.length)
		palabras = eliminarpalabra(palabras,leerPalabra)
		// println(palabras.length)
	}
	def leerPalabra(): String = {
		readLine("Ingresa la palabra a eliminar: ")
	}
	def eliminarpalabra(palabras:List[String],palabra:String): List[String] = {
		palabras.filter(_!=palabra)
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