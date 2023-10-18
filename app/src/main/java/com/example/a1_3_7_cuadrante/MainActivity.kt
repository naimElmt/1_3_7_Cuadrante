package com.example.a1_3_7_cuadrante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a1_3_7_cuadrante.ui.theme._1_3_7_CuadranteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _1_3_7_CuadranteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cuadrante()
                }
            }
        }
    }
}

@Composable
fun Cuadrante() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Carta_info(
                titulo = stringResource(R.string.primerTitulo),
                descripcion = stringResource(R.string.primeraDescrip),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Carta_info(
                titulo = stringResource(R.string.segundoTitulo),
                descripcion = stringResource(R.string.segundaDescrip),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Carta_info(
                titulo = stringResource(R.string.tercerTitulo),
                descripcion = stringResource(R.string.terceraDescrip),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Carta_info(
                titulo = stringResource(R.string.cuartoTitulo),
                descripcion = stringResource(R.string.cuartaDescrip),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}
@Composable
private fun Carta_info(
    titulo: String,
    descripcion: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize().background(backgroundColor).padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = titulo, modifier = Modifier.padding(bottom = 16.dp), fontWeight = FontWeight.Bold)
        Text(text = descripcion, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    _1_3_7_CuadranteTheme {
        Cuadrante()
    }
}