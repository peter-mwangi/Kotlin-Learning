class Account{
    var acc_no: Int = 0
    var accName: String = ""
    var amount: Double = 0.0

    fun insert(acc: Int, aName: String, aAmount: Double){

        acc_no = acc
        accName = aName
        amount = aAmount

        println("Account Number: $acc_no Account name: $accName Available Amount: $amount")

    }

    fun deposit(depAmt: Int) {
        amount += depAmt
        println("You deposited: $depAmt")
    }
    fun withdraw(witAmt: Int){
        amount -=witAmt
        println("You withdrew: $witAmt")
    }
    fun checkBalance(){
        println("Your available balance is $amount")
    }
}
fun main(){
    Account()
     var accInfo = Account()
    accInfo.insert(34226285, "Peter Mwangi", 25000.0)
    accInfo.deposit(5000)
    accInfo.withdraw(10000)
    accInfo.checkBalance()
}