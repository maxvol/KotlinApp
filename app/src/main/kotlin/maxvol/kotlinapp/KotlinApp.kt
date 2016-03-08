package maxvol.kotlinapp

import java.util.*

/**
 * Created by maxim on 08-03-16.
 */
class KotlinApp {

}

data class Cats(var data: Data? = null)

data class Data(var images: ArrayList<Image>? = null)

data class Image(var url: String? = "", var id: String? = "", var source_url: String? = "")
