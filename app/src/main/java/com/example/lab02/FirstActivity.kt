package com.example.lab02
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lab02.navegation.AppScreens

private val objes: List<String> = listOf(
    "Amazonas",
    "Ancash",
    "Apurimac",
    "Arequipa",
    "Ayacucho",
    "Cusco",
    "LimaCallao",
    "Moquegua",
    "Tacna"
)
@Composable
fun FirstScreen(navController: NavController){
    Scaffold {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Elija una ciudad")
        LazyColumn(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,){
                items(objes){obj -> Buttons(navController= navController, ciudad = obj)
            }
        }

    }
}

@Composable
fun Buttons(navController: NavController, ciudad: String){
    Button(onClick = {
        navController.navigate(route = AppScreens.SecondScreen.route +"/"+ ciudad)
    },
        modifier = Modifier.padding(10.dp)) {
        Text(text = ciudad)
    }
}



