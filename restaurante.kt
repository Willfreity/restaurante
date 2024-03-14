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
class Cardapio(
        var cafe_Manha:String,
        var almoco : String,
        var cafe_tarde: String,
        var porcoes: String,
        var jantar: String
)
 fun main() {

     val endereco = Endereco(
         city = "Pitangui",
         state = "Minas Gerais",
         street = "Rua 01",
         number = "1110",
         neighborhood = "centro",
         zip_Code = " 356680.000",
         country = "Brazil"
     )
     val restaurante = Restaurante(
         name = "COmida Mineira",
         endereco = endereco.toString(),
         rating = "5",
         intinerary = listOf("day:every day,Start_Hours:06:00,Final_Hours: 18:00").toString()
     )
     val cardapio = Cardapio(
        cafe_Manha = "Ovo frito,pao frances,pao de forma,presunto e muçarela,dois tipos de fruta,leite,suco e cafe",
        almoco = "feijao,arroz,macarrao,farofa,abobrinha ,cará,salpicão,alfaca,tomate,cenoura,ovos de codorna,abacaxi,manga ",
        cafe_tarde = "pao na chapa,pao com pernil,pao de queijo com linguiça",
        porcoes = "mandioca com carne de panela, batata frita com bacone cheddar, contra file com mandioca ,churrasco completo com mandioca e ovos de codorna e salada",
        jantar = "mexidão com costelinha e verdura"
         )

      //convertendo e imprimindo em Json
     val gson = Gson()
     val json = gson.toJson(endereco)
     val restau = gson.toJson(restaurante)
     val cardap = gson.toJson(cardapio)
     println(json)
     println(restau)
     println(cardap)
 }



