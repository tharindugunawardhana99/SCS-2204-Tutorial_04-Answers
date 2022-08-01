object patternMatching{

    def matching(x : Int): String = x match{
        case x if (x == 0) => "Zero"
        case x if (x < 0) => "Negative"
        case x if (x % 2 == 0) => "Even"
        case x if (x % 2 != 0) => "Odd"
    }



    def main(args:Array[String]): Unit = {

        print("Enter the number : ")
        var num = scala.io.StdIn.readInt()
        println("\nInput number is " + matching(num) + "\n")
        
    }

}