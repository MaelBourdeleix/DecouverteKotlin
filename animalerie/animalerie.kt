
interface Animal{
    fun parler()
    fun quiSuisJe()
}

class chien: Animal{
    override fun parler(text:String){
        println("Whaouf !")
    }
    override fun quiSuisJe(text:String){
        println("Je suis un chien !")
    }

}

class chat: Animal{
    override fun parler(text:String){
           println("Miaou Miaou !")
    }
    override fun quiSuisJe(text:String){
             println("Je suis un chat !")
    }

}

class perroquet: Animal{
    override fun parler(text:String){
        println("Miaou Miaou !")
    }
    override fun quiSuisJe(text:String){
        println("Je suis un perroquet !")
    }
}

class Animalerie{
    var list = mutableListOf<Animal>()
}


fun main(args:Array<String>){

    val animalerie = Animalerie()

    for (Animal in animalerie.list){
        Animal.quiSuisJe()
        Animal.parler()
    }



}