package kz.sdu190103159.notesappcss_216.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kz.sdu190103159.notesappcss_216.scrnss.Start
import kz.sdu190103159.notesappcss_216.scrnss.Main
import kz.sdu190103159.notesappcss_216.scrnss.Note
import kz.sdu190103159.notesappcss_216.scrnss.Add

sealed class NavRoute(val route:String ){
    object Start: NavRoute("start_screen")
    object Main: NavRoute("main_screen")
    object Add: NavRoute("add_screen")
    object Note: NavRoute("note_screen")
}
@Composable
fun NoteNavHst() {
    val navController = rememberNavController()

    NavHost(navController = navController , startDestination = NavRoute.Start.route ) {
        composable(NavRoute.Start.route) {
            Start(navController = navController)
        }
        composable(NavRoute.Main.route) {
            Main(navController = navController)
        }
        composable(NavRoute.Add.route) {
            Add(navController = navController)
        }
        composable(NavRoute.Note.route) {
            Note(navController = navController)
        }
    }
}