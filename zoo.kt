data class Taxonomia(
    val reino: String,
    val filo: String,
    val classe: String,
    val ordem: String,
    val familia: String,
    val genero: String,
    val especie: String
)


data class Animal(
    val apelido: String,
    val origem: String,
    val dieta: String,
    val tipoGaiola: String,
    val localizacao: String,
    val taxonomia: Taxonomia
)


class Zoologico {
    private val animais = mutableListOf<Animal>()

    
    fun cadastrarAnimal(
        apelido: String,
        origem: String,
        dieta: String,
        tipoGaiola: String,
        localizacao: String,
        reino: String,
        filo: String,
        classe: String,
        ordem: String,
        familia: String,
        genero: String,
        especie: String
    ) {
        val taxonomia = Taxonomia(reino, filo, classe, ordem, familia, genero, especie)
        val animal = Animal(apelido, origem, dieta, tipoGaiola, localizacao, taxonomia)
        animais.add(animal)
        println("Animal cadastrado com sucesso!")
    }

    
    fun listarAnimais() {
        if (animais.isEmpty()) {
            println("Nenhum animal cadastrado.")
        } else {
            println("Lista de Animais no Zoológico:")
            for ((index, animal) in animais.withIndex()) {
                println("Animal ${index + 1}:")
                println("Apelido: ${animal.apelido}")
                println("Origem: ${animal.origem}")
                println("Dieta: ${animal.dieta}")
                println("Tipo de Gaiola: ${animal.tipoGaiola}")
                println("Localização: ${animal.localizacao}")
                println("Taxonomia: Reino=${animal.taxonomia.reino}, Filo=${animal.taxonomia.filo}, Classe=${animal.taxonomia.classe}, Ordem=${animal.taxonomia.ordem}, Família=${animal.taxonomia.familia}, Gênero=${animal.taxonomia.genero}, Espécie=${animal.taxonomia.especie}")
                println()
            }
        }
    }
}


fun main() {
    val zoologico = Zoologico()
    while (true) {
        println("=== Sistema de Controle do Zoológico ===")
        println("1. Cadastrar Animal")
        println("2. Listar Animais")
        println("3. Sair")
        print("Escolha uma opção: ")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Apelido do animal: ")
                val apelido = readLine() ?: ""
                print("Origem do animal: ")
                val origem = readLine() ?: ""
                print("Dieta do animal: ")
                val dieta = readLine() ?: ""
                print("Tipo de Gaiola: ")
                val tipoGaiola = readLine() ?: ""
                print("Localização no zoológico: ")
                val localizacao = readLine() ?: ""
                
                print("Reino: ")
                val reino = readLine() ?: ""
                print("Filo: ")
                val filo = readLine() ?: ""
                print("Classe: ")
                val classe = readLine() ?: ""
                print("Ordem: ")
                val ordem = readLine() ?: ""
                print("Família: ")
                val familia = readLine() ?: ""
                print("Gênero: ")
                val genero = readLine() ?: ""
                print("Espécie: ")
                val especie = readLine() ?: ""
                
                zoologico.cadastrarAnimal(apelido, origem, dieta, tipoGaiola, localizacao, reino, filo, classe, ordem, familia, genero, especie)
            }
            2 -> zoologico.listarAnimais()
            3 -> {
                println("Saindo do sistema...")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}