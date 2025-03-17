package com.example.ProjetoUm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetoum.R
import com.example.projetoum.ui.theme.ProjetoUmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetoUmTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    ProdutoItem()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
    fun ProdutoItem() {
        Column(
            Modifier
            .fillMaxSize()
        ) {
            Box(
                Modifier
                    .background(brush = Brush.horizontalGradient(listOf(Color.Red, Color.Yellow, Color.Cyan, Color.Magenta)))
                    .height(100.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.medieval_kitty),
                    contentDescription = "Descrição da imagem",
                    Modifier
                        .offset(y = (50).dp)
                        .clip(shape = CircleShape)
                        .align(Alignment.Center)
                )
            }

            Spacer(modifier = Modifier.height(50.dp))

            Column(Modifier.padding(16.dp)) {
            Text(
                text = "gato medieval com espada encantada",
                fontSize = 18.sp,
                fontWeight = FontWeight(700),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = "gato medieval com espada encantada",
                Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )
            }
            Spacer(modifier = Modifier.height(20.dp))

            Column(
                Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                var text by remember { mutableStateOf("") }

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White),
                    value = text,
                    onValueChange = { newText ->
                        text = newText
                    },
                    label = { Text("Nome") }
                )

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White),
                    value = text,
                    onValueChange = { newText ->
                        text = newText
                    },
                    label = { Text("Email") }
                )

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White),
                    value = text,
                    onValueChange = { newText ->
                        text = newText
                    },
                    label = { Text("Senha") }
                )

                Button(
                    onClick = { /*TODO*/ },
                    Modifier
                        .padding(top = 20.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(text = "Cadastrar")
                }
            }
        }
    }