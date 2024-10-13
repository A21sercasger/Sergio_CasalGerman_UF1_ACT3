package com.example.sergio_casalgerman_uf1_act3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.sergio_casalgerman_uf1_act3.ui.theme.Sergio_CasalGerman_UF1_ACT3Theme
import com.example.sergio_casalgerman_uf1_act3.ui.theme.Sergio_CasalGerman_UF1_ACT3Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sergio_CasalGerman_UF1_ACT3Theme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Text(
            text = stringResource(id = R.string.hola),
            color = colorResource(id = R.color.hola)
        )
        Text(
            text = stringResource(id = R.string.mon),
            color = colorResource(id = R.color.mon)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Sergio_CasalGerman_UF1_ACT3Theme() {
        Greeting()
    }
}