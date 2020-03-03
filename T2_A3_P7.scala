/*
	Escribe una función llamada “obtenerPalindromas" que busque todas las palabras 
	palíndromas de una lista. Ejemplo de palabras inversas: radar, oro, rajar, 
	rallar, salas, somos, etc...
*/
import scala.io.StdIn._
object Prueba{	
	def main(args: Array[String]): Unit ={
		var lista = llenarLista(30)
		//lista = limpiarRepetidos(lista)
		println("Palabras palindromas de la lista: ")
		println(obtenerPalindromas(lista))
	}
	def obtenerPalindromas(palabras:List[String]): List[String] = {
		palabras.filter(x => (x==x.reverse))
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
			"Jute","fraudlessness","vasotomy","unworldliness","rheometric","isoallyl","spondylolisthetic","benzothiazole","kaikawaka","cogent",
			"radar", "oro", "rajar", "rallar", "salas", "somos","arenera","oso",
			"brachyprosopic","pteridological","pardnomastic","endosporous","relatedness","laurin","Alebion","overpolitic","ocote","presurrender",
			"sulfuran","sundial","ontogenist","ultraconservatism","terribleness","patten","hectoringly","heraldize","calepin","unhealthiness",
			"castanean","doughman","viscerally","spermatophyte","sthenochire","inclinable","Adinida","occasionless","shown","pastiche",
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