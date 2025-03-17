package com.example.ProjetoUm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetoum.R
import androidx.compose.ui.*
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
                var text1 by remember { mutableStateOf("") }
                var text2 by remember { mutableStateOf("") }
                var text3 by remember { mutableStateOf("") }
                var text4 by remember { mutableStateOf("") }

                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            width = 3.dp,
                            color = colorResource(R.color.purple_700),
                            shape = RoundedCornerShape(5.dp)
                        ),
                    value = text1,
                    onValueChange = { newText ->
                        text1 = newText
                    },
                    label = { Text("Nome") }
                )

                Spacer(modifier = Modifier.height(30.dp))

                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            width = 3.dp,
                            color = colorResource(R.color.purple_700),
                            shape = RoundedCornerShape(5.dp)
                        ),
                    value = text2,
                    onValueChange = { newText ->
                        text2 = newText
                    },
                    label = { Text("Telefone") }
                )

                Spacer(modifier = Modifier.height(30.dp))

                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            width = 3.dp,
                            color = colorResource(R.color.purple_700),
                            shape = RoundedCornerShape(5.dp)
                        ),
                    value = text3,
                    onValueChange = { newText ->
                        text3 = newText
                    },
                    label = { Text("Curso") }
                )

                Spacer(modifier = Modifier.height(30.dp))

                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            width = 3.dp,
                            color = colorResource(R.color.purple_700),
                            shape = RoundedCornerShape(5.dp)
                        ),
                    value = text4,
                    onValueChange = { newText ->
                        text4 = newText
                    },
                    label = { Text("Série") }
                )

                Button(
                    onClick = { /*TODO*/ },
                    Modifier
                        .padding(top = 20.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(text = "Enviar")
                }
            }
        }
    }
