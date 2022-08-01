object interest{

    def calculateInterest(amount : Double): Double = {
        
        if((amount > 0) && (amount <= 20000.00)){
            amount * 0.02
        }
        else if(amount <= 200000){
            amount * 0.04
        }
        else if(amount <= 2000000){
            amount * 0.035
        }
        else{
            amount * 0.065
        }
    }

    def main(args:Array[String]): Unit = {

        var p = calculateInterest(3000000.00)
        printf("\nInterest for the year : Rs.%.2f\n\n",p )
    }

}