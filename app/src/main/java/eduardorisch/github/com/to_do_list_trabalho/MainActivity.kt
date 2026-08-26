package eduardorisch.github.com.to_do_list_trabalho

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import eduardorisch.github.com.to_do_list_trabalho.navigation.AppNavigation

import eduardorisch.github.com.to_do_list_trabalho.ui.theme.TodolistTrabalhoTheme
import eduardorisch.github.com.to_do_list_trabalho.viewmodel.TarefaViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodolistTrabalhoTheme {
                val viewModel: TarefaViewModel = viewModel(
                    factory = TarefaViewModel.factory(applicationContext)
                )
                AppNavigation(viewModel = viewModel)
            }
        }
    }
}