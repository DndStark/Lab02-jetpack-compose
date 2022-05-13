package com.example.lab02
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lab02.ui.theme.Lab02Theme

private val objes: List<MyObject> = listOf()

private val amazonas: List<MyObject> = listOf(
    MyObject("Amazonas", "1"),
    MyObject("Amazonas", "2"),
)

private val ancash: List<MyObject> = listOf(
    MyObject("Ancash", "1"),
    MyObject("Ancash", "2"),
)

private val apurimac: List<MyObject> = listOf(
    MyObject("Apurimac", "1"),
    MyObject("Apurimac", "2"),
)
private val arequipa: List<MyObject> = listOf(
    MyObject("Arequipa", "1"),
    MyObject("Arequipa", "2"),
    MyObject("Arequipa", "3"),
    MyObject("Arequipa", "4"),
    MyObject("Arequipa", "5"),
)
private val ayacucho: List<MyObject> = listOf(
    MyObject("Ayacucho", "1"),
    MyObject("Ayacucho", "2"),
)
private val cusco: List<MyObject> = listOf(
    MyObject("Cusco", "1"),
    MyObject("Cusco", "2"),
)
private val limacallao: List<MyObject> = listOf(
    MyObject("LimaCallao", "1"),
    MyObject("LimaCallao", "2"),
    MyObject("LimaCallao", "3"),
    MyObject("LimaCallao", "4"),
)
private val moquegua: List<MyObject> = listOf(
    MyObject("Moquegua", "1"),
    MyObject("Moquegua", "2"),
)
private val tacna: List<MyObject> = listOf(
    MyObject("Tacna", "1"),
    MyObject("Tacna", "2"),
)

@Composable
fun SecondScreen(navController: NavController, ciudad: String?){
    Scaffold {
        Lab02Theme {
            Column {
                Button(onClick = {
                    navController.popBackStack()
                }) {
                    Text(text = "Atrás")
                }
                when (ciudad){
                    "Amazonas" -> MyObjects(objs = amazonas, ciudad)
                    "Ancash" -> MyObjects(objs = ancash, ciudad)
                    "Apurimac" -> MyObjects(objs = apurimac, ciudad)
                    "Arequipa" -> MyObjects(objs = arequipa, ciudad)
                    "Ayacucho" -> MyObjects(objs = ayacucho, ciudad)
                    "Cusco" -> MyObjects(objs = cusco, ciudad)
                    "LimaCallao" -> MyObjects(objs = limacallao, ciudad)
                    "Moquegua" -> MyObjects(objs = moquegua, ciudad)
                    "Tacna" -> MyObjects(objs = tacna, ciudad)
                }
            }
        }
    }
}
data class MyObject(val title: String, val body: String)

@Composable
fun MyObjects(objs: List<MyObject>, ciudad: String?){
    LazyColumn{
        items(objs){obj -> MyComponents(obj = obj, ciudad)
        }
    }
}

@Composable
fun MyComponents(obj: MyObject, argumentos: String?){
    Row(modifier = Modifier
        .background(MaterialTheme.colors.background)
        .padding(8.dp)) {
        MyImage(obj.title, obj.body)
        Mytexts(obj, argumentos)
    }
}

@Composable
fun MyImage(ciudad: String, platillo: String){
    var painterr: Painter = painterResource(id = R.drawable.amazona_cuy_chachapoyano)
    when (ciudad){
        "Amazonas" ->
            when (platillo){
                "1" -> painterr = painterResource(id = R.drawable.amazona_cuy_chachapoyano)
                "2" -> painterr = painterResource(id = R.drawable.amazonas_juane_de_yuca)
            }
        "Ancash" ->
            when (platillo){
                "1" -> painterr = painterResource(id = R.drawable.ancash_escabeche_de_pescado)
                "2" -> painterr = painterResource(id = R.drawable.ancash_llunca_cashqui)
            }
        "Apurimac" ->
            when (platillo){
                "1" -> painterr = painterResource(id = R.drawable.apurimac_estofado_de_gallina)
                "2" -> painterr = painterResource(id = R.drawable.apurimac_tallarines_hechos_en_casa)
            }
        "Arequipa" ->
            when (platillo){
                "1" -> painterr = painterResource(id = R.drawable.aqp_adobo_aqp)
                "2" -> painterr = painterResource(id = R.drawable.aqp_rocoto_relleno)
                "3" -> painterr = painterResource(id = R.drawable.aqp_ocopa_aqp)
                "4" -> painterr = painterResource(id = R.drawable.aqp_chupe_de_camarones)
                "5" -> painterr = painterResource(id = R.drawable.aqp_pastel_de_papa)
            }
        "Ayacucho" ->
            when (platillo){
                "1" -> painterr = painterResource(id = R.drawable.ayacucho_mondogo_aya)
                "2" -> painterr = painterResource(id = R.drawable.ayacucho_puca_picante)
            }
        "Cusco" ->
            when (platillo){
                "1" -> painterr = painterResource(id = R.drawable.cuzco_caldo_de_cabeza)
                "2" -> painterr = painterResource(id = R.drawable.cuzco_chicharron_cuz)
            }
        "LimaCallao" ->
            when (platillo){
                "1" -> painterr = painterResource(id = R.drawable.lima_aji_de_gallina)
                "2" -> painterr = painterResource(id = R.drawable.lima_huevo_a_la_rusa)
                "3" -> painterr = painterResource(id = R.drawable.lima_lomo_saltado)
                "4" -> painterr = painterResource(id = R.drawable.lima_pollo_a_la_brasa)
            }
        "Moquegua" ->
            when (platillo){
                "1" -> painterr = painterResource(id = R.drawable.moque_moque_de_camarones)
                "2" -> painterr = painterResource(id = R.drawable.moque_picante_de_cuy)
            }
        "Tacna" ->
            when (platillo){
                "1" -> painterr = painterResource(id = R.drawable.tacna_adobo_tac)
                "2" -> painterr = painterResource(id = R.drawable.tacna_picante_a_la_tac)
            }

    }
    Image(painter = painterr,
        contentDescription = "TestImage",
        modifier = Modifier
            .size(75.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colors.primary))

}

@Composable
fun Mytexts(obj: MyObject, ciudad: String?){
    Column(modifier = Modifier.padding(8.dp)) {
        MyText(obj.title + ciudad,
            MaterialTheme.colors.primaryVariant,
            MaterialTheme.typography.subtitle1)
        Spacer(modifier = Modifier.height(2.dp))
        MyText(obj.body,
            MaterialTheme.colors.secondaryVariant,
            MaterialTheme.typography.subtitle1)
    }
}

@Composable
fun MyText(text: String, color: Color, style: TextStyle){
    Text(text, color =  color, style = style)
}