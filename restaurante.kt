import com.google.gson.Gson

class Restaurante(
     var name: String,
     var endereco: String,
     var rating: String,
     var intinerary:String
 )
 class Endereco (
         var city: String,
         var state:String,
         var street: String,
         var number: String,
         var neighborhood: String,
         var zip_Code: String,
         var country: String
     )
 fun main(){

   val endereco = Endereco (
         city= "Pitangui",
         state= "Minas Gerais",
         street="Rua 01",
         number="1110",
         neighborhood="centro",
         zip_Code=" 356680.000",
         country="Brazil"
    )
    val restaurante = Restaurante(
        name = "COmida Mineira",
        endereco = endereco.toString(),
        rating = "5",
        intinerary= listOf("day:every day,Start_Hours:06:00,Final_Hours: 18:00" ).toString()
    )
     //convertendo e imprimindo em Json
     val gson = Gson()
     val json = gson.toJson(endereco)
     val restau = gson.toJson(restaurante)
     println(json)
    println(restau)
 }


