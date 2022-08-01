object transform{

    def toUpper(name : String) = {
        name.toUpperCase()
    }

    def toLower(name : String) = {
        name.toLowerCase()
    }

    def formatNames(name : String)(newFunc: String => String): String = {
        newFunc(name)
    }


    def main(args:Array[String]): Unit = {

        var name1 = "Benny"
        var name2 = "Niroshan"
        var name3 = "Saman"
        var name4 = "Kumara"

        var result1 = toUpper(name1) // var result1 = formatNames(name1)(toUpper(_))
        var result2 = formatNames(name2.substring(0,2))(toUpper(_)) + formatNames(name2.substring(2))(toLower(_))
        var result3 = toLower(name3) // var result3 = formatNames(name3)(toLower(_))
        var result4 = formatNames(name4.substring(0,1))(toUpper(_)) + formatNames(name4.substring(1,5))(toLower(_)) + formatNames(name4.substring(5))(toUpper(_))

        print(s"\n$result1 \n$result2 \n$result3 \n$result4\n\n")
        
    }

}