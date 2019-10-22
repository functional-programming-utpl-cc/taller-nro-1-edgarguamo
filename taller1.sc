// Autor: Edgar Guamo
val countries = List("Ecuador", "Venezuela", "Colombia", "Perú", "Chile", "Argentina", "Uruguay", "Paraguay", "Brazil")

// 1.Elabore una función lambda que filter aquellos países (countries) que empiezan por letra C)


val countriesC= countries.filter(_.startsWith("C"))

// 2. Elabore una función lambda que filter aquellos paises (countries) cuyos nombres contiene la letra E

val countriesE = countries.filter(_.startsWith("E"))

// 3. Elabore una función lambda que filter aquellos países (countries0 cuyos nombres inician la E o I

val texto = ((x: String) => x.startsWith("E") || x.contains("I"))
val countriesEi= countries.filter(texto)

// 4. Elabore una función lambda que filter países (countries) cuyos nombres tengan una longitud mayor a 5

val cont = ((x: String) => x.length > 5)
val countries5 =countries.filter(cont)

// 5. Cree una función lambda que filter aquellos números que no son abundantes

val numbers = List(10, 11, 12, 18, 20, 50, 60, 80, 81, 96)
val condition = ((x: Int) => (1 until x).toList.filter(x % _ == 0).sum < x)
val numbAbun = numbers.filter(condition)
