package kz.sdu190103159.notesappcss_216.scrnss

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.compose.rememberNavController
import kz.sdu190103159.notesappcss_216.navigation.NavRoute
import kz.sdu190103159.notesappcss_216.ui.theme.NotesAppCSS216Theme

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate(NavRoute.AddScreen.route)
                })
            {
                Icon(imageVector = Icons.Filled.Add , contentDescription = "Add Icons" , tint = Color.Gray)
            }
        }
    ){
        Column(){
            NoteItem(title = "Zhuzha" , subtitle = "Zhuzha molodec" , navController = navController)
            NoteItem(title = "Zhuzha 0" , subtitle = "Zhuzha molodec 0" , navController = navController)
            NoteItem(title = "Zhuzha -1" , subtitle = "Zhuzha molodec -1 " , navController = navController)
            NoteItem(title = "Zhuzha 1" , subtitle = "Zhuzha molodec 1" , navController = navController)
        }

    }
}

@Composable
fun NoteItem(title: String , subtitle: String , navController: NavHostController){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp , horizontal = 20.dp)
            .clickable{
                navController.navigate(NavRoute.NoteScreen.route)
            },
        elevation = 6.dp
    ){
        Column(modifier = Modifier.padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = subtitle)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun prevMainScreen(){
    NotesAppCSS216Theme {
        StartScreen(navController = rememberNavController())
    }
}