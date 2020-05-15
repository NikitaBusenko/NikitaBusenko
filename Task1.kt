fun main() {
    val tester = User(7, Vacancy())
    println(tester.getId())
    println(tester.getVacancy())

}

class User(private val id: Long, private val vacancy: Vacancy) {
    fun getVacancy(): String {
        return vacancy.getVacancy()
    }

    fun getId(): Long {
        return id
    }
}

class Vacancy {
    fun getVacancy(): String {
        return "Developer"
    }
}
