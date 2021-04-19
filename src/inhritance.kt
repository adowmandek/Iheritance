open class People(val name:String,var age:Int){
    fun talk (words:String){
        println(words)
    }
    open fun sleep (){
        println("zzzzz")
    }

}


class Person (name:String,age:Int):People(name,age){
    fun works(){
        println("I work at Sendy")
    }

}
class Doctor (name: String,age: Int):People(name,age){
 fun treat(){
     println("I inject people")
 }
}
class Nurse(name:String,age: Int):People(name,age){
    fun workdays(){
        println("I work everyday")
    }

    override fun sleep() {
        super.sleep()
        println("Grrrrrrrrrr")
    }

}
fun main() {
    var myPerson=Person("Akoko Obanda",20)
    println(myPerson.name)
    myPerson.works()
    myPerson.talk("I miss Gigiri environmnet")
    myPerson.sleep()
    var myDoctor=Doctor("Tabibu Mponyaji",43)
    println(myDoctor.age)
    myDoctor.treat()
    myDoctor.sleep()
    var myNurse=Nurse("Zillah",240)
    println(myNurse.name)
    myNurse.talk("I work in Canada")
    myNurse.workdays()
    myNurse.sleep()

}