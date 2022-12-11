package kz.sdu190103159.notesappcss_216.scrnss

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kz.sdu190103159.notesappcss_216.navigation.NavRoute
import kz.sdu190103159.notesappcss_216.ui.theme.NotesAppCSS216Theme

@Composable
fun StartScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier.fillMaxSize() ,
            horizontalAlignment = Alignment.CenterHorizontally ,
            verticalArrangement = Arrangement.Center )
        {
        Text(text = "First")
        Button(
            onClick = {
                navController.navigate(route = NavRoute.MainScreen.route)
            },
            modifier = Modifier
                .width(125.dp)
                .padding(vertical = 10.dp)
        ){
            Text(text = "No")
        }
            Button(
                onClick = {
                    navController.navigate(route = NavRoute.MainScreen.route)
                },
                modifier = Modifier
                    .width(125.dp)
                    .padding(vertical = 10.dp)
            ){
                Text(text = "Yes")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun prevStartScreen(){
    NotesAppCSS216Theme {
        StartScreen(navController = rememberNavController())
    }
}