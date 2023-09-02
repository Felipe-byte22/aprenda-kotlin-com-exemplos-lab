enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String) {
    override fun toString(): String {
        return "$nome"
    }
}

class Curso(var nome: String, var duracao: String, var nivelCurso: Nivel) {
    override fun toString(): String {
        return "$nome, $duracao, $nivelCurso"
    }
}

data class Bootcamp(val nome: String, val cursos: List<Curso>) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario, cursos: Curso) {
        inscritos.add(usuario)
        println("$usuario foi matriculado no Bootcamp $nome | Curso: $cursos")
    }
}

fun main() {
    // Criando os usuários
    val usuario1 = Usuario("Felipe")
    val usuario2 = Usuario("Ana")
    val usuario3 = Usuario("Renan")
    
    // Criando os cursos do Bootcamp
    val curso1 = Curso("Versionamento de Código com Git e GitHub", "Duração: 2 horas", Nivel.BASICO)
    val curso2 = Curso("Tratamento de Exceções em Kotlin", "Duração: 2 horas", Nivel.INTERMEDIARIO)
    val curso3 = Curso("Ciclo de Vida Android ViewModel, LiveData e Coroutines", "Duração: 4 horas", Nivel.AVANCADO)
    
    // Criando o Bootcamp
    val bootcamp = Bootcamp("Mobile Android com Kotlin", listOf(curso1, curso2, curso3))
    
    // Matriculando os usuários no Bootcamp
    bootcamp.matricular(usuario1, curso1)
    bootcamp.matricular(usuario2, curso2)
    bootcamp.matricular(usuario3, curso3)
    
}