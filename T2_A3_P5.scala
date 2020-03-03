/*
	Escriba un programa que permita crear dos listas de palabras y que, a continuación, 
	escriba las siguientes listas (en las que no debe haber repeticiones):
		Lista de palabras que aparecen en las dos listas.
		Lista de palabras que aparecen en la primera lista, pero no en la segunda.
		Lista de palabras que aparecen en la segunda lista, pero no en la primera.
		Lista de palabras que aparecen en ambas listas.
		Nota: Para evitar las repeticiones, el programa deberá empezar eliminando 
		los elementos repetidos en cada lista.
*/
import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String]): Unit ={
		var lista1 = llenarLista(10)
		var lista2 = llenarLista(15)
		println(lista1.length)
		println(lista2.length)
		lista1 = limpiarRepetidos(lista1)
		lista2 = limpiarRepetidos(lista2)
		println(lista1.length)
		println(lista2.length)
		println(lista1)
		println(lista2)

		println("Interseccion de las listas: ")
		println(interseccionListas(lista1,lista2))
		println("Diferencia de la lista1 a la lista2: ")
		println(diferenciaListas(lista1,lista2))
		println("Diferencia de la lista2 a la lista1: ")
		println(diferenciaListas(lista2,lista1))
		println("Union de las listas: ")
		println(unionListas(lista1,lista2))
	}
	def unionListas(lista1:List[String],lista2:List[String]): List[String] = {
		lista1.union(lista2).distinct
	}
	def interseccionListas(lista1:List[String],lista2:List[String]): List[String] = {
		lista1.intersect(lista2)
	}
	def diferenciaListas(lista1:List[String],lista2:List[String]): List[String] = {
		lista1.diff(lista2)
	}
	def limpiarRepetidos(palabras:List[String]): List[String] = {
		palabras.distinct
	}
	def llenarLista(tam:Int): List[String] = {
		var lista = List[String]()
		for(i<-0 until tam)
			lista = lista :+ obtenerPalabraAleatoria
		lista
	}
	def obtenerPalabraAleatoria(): String = {
		val palabrasDisponibles = List(		
			"rosolio","evasion","offshoot","pedatilobed","tomentous","Tishiya","Suzan","fodderless","meningorachidian","discontinuous",
			"rootedly","throat","Armadillididae","biotomy","Kinosternidae","dialystaminous","dichroscope","phthalid","procommunal","kibitz",
			//"Jute","fraudlessness","vasotomy","unworldliness","rheometric","isoallyl","spondylolisthetic","benzothiazole","kaikawaka","cogent",
			// "brachyprosopic","pteridological","pardnomastic","endosporous","relatedness","laurin","Alebion","overpolitic","ocote","presurrender",
			// "sulfuran","sundial","ontogenist","ultraconservatism","terribleness","patten","hectoringly","heraldize","calepin","unhealthiness",
			// "castanean","doughman","viscerally","spermatophyte","sthenochire","inclinable","Adinida","occasionless","shown","pastiche",
			// "wheal","benzotriazole","pes","unperjured","intensiveness","Proparia","proagrarian","purr","sartage","Mormyrus",
			// "frithles","cryptocarp","Samsien","orchidist","Sphingurus","uprose","softly","siphonogam","monadology","untrimmed",
			// "unfeeding","theoretician","unanalyzable","foremasthand","prelogical","symphonist","unimmergible","precipitancy","hazing","distillable",
			// "barodynamic","jacketless","holistically","influenza","Waf","emmensite","shabbily","Marsilia","canoe","carver",
			// "tetrsyllabical","investitive","slobbery","undertenure","Nepeta","laicization","garrote","Olympus","safari","solferino",
			// "homochronous","insaturable","lustrousness","rugosa","celestitude","reforestation","saltate","devolatilize","seasider","pattable",
			// "pliothermic","firebird","rigwiddy","clarifier","Unalachtigo","supercilium","steng","noncondonation","immutual","fanfaronading",
			// "unqualify","greenbone","ventail","frithstool","Ulua","forespencer","unformulable","Della","pileous","intermorainic",
			// "Laterigradae","pook","sexangular","necrophilistic","norcamphane","unindividuated","Artocarpaceae","osphyomelitis","K","unkennel",
			// "tormina","duchesslike","clinocephalus","understrike","inviter","bewilderment","esthesio","sorefalcon","seastroke","disorientation",
			// "tetrahydric","cathartical","biunivocal","dehydrofreezing","epithesis","monopole","clearskins","didepside","Guillermo","Protopterus",
			// "Palamedeidae","refound","solvsbergite","surgeproof","Romany","Dasypeltis","unrelinquishable","Sequanian","cookout","temeritous",
			// "reliquidate","psycholepsy","Cochranea","gendarme","Argynnis","epiotic","diathermometer","floccosely","metapeptone","omoplate",
			// "Ladino","kiley","sourock","arbitrational","dentality","corvetto","nihilitic","sclerose","traveloguer","volubility",
			// "scripturism","merosomal","unaccrued","sublot","reastiness","tobaccolike","silviculturally","embellishment","unemendable","Pomona",
			// "fuggy","intervolute","dacryagogue","disyoke","medicament","symmetrophobia","Gastrotricha","naphtholate","anticoagulant","spearmanship",
			// "Minahassa","tokonoma","hygiantic","nonadherence","crutch","bottomed","collarbird","causativeness","widdle","perisarcal",
			// "slipway","prinker","unriddled","Donatist","Safavi","acrobatholithic","bullated","farmhouse","spoilsport","withypot",
			// "minglement","nab","splenalgic","Argante","unvinous","Chironomidae","topology","resorufin","combativeness","Knickerbocker",
			// "shrinker","proextravagance","Sikkimese","sulphinyl","saltspoon","thornlike","hoggerel","siderism","tributary","drivage",
			// "Hopkinsian","subtectal","alarming","iliopsoatic","Constance","infelt","ramentum","unbodiliness","quitclaim","pseudogenerous",
			// "woodcraftiness","scopularian","forestall","curability","unpasteurized","rectocystotomy","cogency","plasmodiocarpous","rageful","glossologist",
			// "alcoholimeter","rumgumption","fei","nectarous","estate","holobaptist","psalmodist","genal","Morisco","proctoplasty",
			// "prenatally","criterional","Maranhao","grandfatherless","hippish","rathole","colymbion","venerator","calendry","foxberry",
			// "micrurgical","cos","bikhaconitine","derogatory","gasolineless","hatchetlike","Egyptian","satyress","renculus","providance",
			// "nulliplex","uniloculate","nonconvergent","unbloom","terton","adumbrative","proathletic","glare","extranidal","battlewise",
			// "anemia","anosmia","popomastic","affluxion","gametange","underagitation","speedster","irresolubleness","occupationally","longear",
			// "laparotomize","hesperitin","protervity","antiemperor","strengthful","tilbury","puchero","unright","Anticlea","pufflet",
			// "delicense","postotic","antisociality","Monostomatidae","returban","clausula","unofficerlike","oceanways","pilgrimage","reedmaking",
			// "Chrysochloris","doveflower","knottiness","soldan","zootaxy","arsenetted","cerotype","unreducibleness","chieftainship","scrabe",
			// "Cocculus","osteodermia","photosynthometer","flustrine","bottlehead","relaxative","ovatocordate","cosplendor","lissoflagellate","monotriglyphic",
			// "nonsacramental","pharmacography","lutianoid","Ashir","poind","upgird","afterpart","overconquer","somnambulancy","countersink",
			// "azeotropy","rushingly","nighly","uncompassion","semipetrified","phlegmatism","Negress","parabomb","spean","stockholding",
			// "temser","gonakie","overinstruction","fledge","hydrocharitaceous","paleophysiography","Euglenoidina","antibacchic","hemal","prothetically",
			// "affluently","goldfinny","typographic","Abranchiata","Rotal","predoubtful","strum","aurotellurite","toetoe","kashruth",
			// "bepraise","forereading","palatoplegia","impremeditate","Chitimachan","unsavored","arteriogenesis","dowiness","longitude","frit",
			// "polishment","thwittle","transcending","unpayableness","Bouvardia","syndesmography","aerophone","bureaucratic","adoulie","mirliton",
			// "dochmiasis","quadrifoliolate","cleverly","transfusible","Waregga","platemaker","porcelanite","omnipotence","tristisonous","assentator",
			// "archigenesis","electrolysis","subglacially","metrosteresis","inflectionally","dynamiting","presharpen","parsoned","straining","oxalaldehyde",
			// "antimerism","superoanterior","tiburon","punnet","awn","slackage","montanite","macropterous","archispore","unspit",
			// "athwartwise","pneumoenteritis","duit","propayment","pseudoprincely","whimstone","hisingerite","unwittily","immortalize","watchmaking",
			// "nonpedigree","periosteous","vicious","reinsane","mulishness","Entomophaga","cardiorespiratory","luxury","alphitomancy","cremnophobia",
			// "tongsman","hursinghar","gutturize","tundish","anthracia","duodenitis","unwarped","doctrinarily","reconstitution","thrombogen",
			// "lampad","forgivably","bridgemaster","alternating","monodynamic","misworshiper","squamiferous","footlock","satinwood","demurrant",
		)
		val r = scala.util.Random
		palabrasDisponibles(r.nextInt(palabrasDisponibles.length))
	}
}