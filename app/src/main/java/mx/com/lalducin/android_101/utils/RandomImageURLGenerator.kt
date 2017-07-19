package mx.com.lalducin.android_101.utils

import java.util.Random

class RandomImageURLGenerator {

    companion object {

        private val images = listOf(
                "https://www.fosterswiss.com/wp-content/uploads/2017/03/luxemburgo.jpg",
                "https://media.globalchampionsleague.com/cache/750x429/assets/07_monaco_2017.jpg",
                "http://www.nationalgeographic.com/content/dam/travel/2017-digital/amsterdam-bar-hopping/canal-amsterdam-the-netherlands.jpg",
                "https://es.parisinfo.com/var/otcp/sites/images/node_43/node_51/node_233/visuel-carrousel-dossier-ou-sortir-le-soir-a-paris-740x380-c-dr/16967596-1-fre-FR/Visuel-carrousel-dossier-Ou-sortir-le-soir-a-Paris-740x380-C-DR.jpg",
                "https://www.daad.mx/files/2016/10/Palacio-de-bellas-artes-mexico-city_Copyright-iStockphoto_iStock_000023575203_Large_624.jpg",
                "http://static.egypt.travel/2016/07/Welcome-slide1-1.jpg",
                "https://www.caracteristicas.co/wp-content/uploads/2016/04/cordillera-de-los-andes-e1460745058958.jpg",
                "https://images.bestday.com/_lib/HTML/Destinos/hoteles-en-puerto-vallarta.jpg"
        )

        fun generate(): String {
            val max = images.size
            val randomIndex = Random().nextInt(max)
            return images[randomIndex]
        }

    }

}
