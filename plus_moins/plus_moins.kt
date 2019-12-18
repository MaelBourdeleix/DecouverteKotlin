fun main(args:Array<String>){
    println("Entrer une valeur")
    val value = readLine()
    println("Deviner le nombre")

    do{
    var number = readLine()
        if("$value" == "$number"){
            println("Vous avez trouvé")
        }else{
        if ("$value" > "$number"){
        println("Plus")
    } else {
        println("Moins")
    }
      }
        }
        while("$value" != "$number")

}





