package com.example.eism2048.Trabajo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import com.example.eism2048.R
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable



fun Gameover() {
    //Color variables
    val colorN =Color(0xFFFDFDFD)

    //Working area
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF8F6EE))) {
        Box() {
            //titlebar
            Box(Modifier.fillMaxWidth().padding(5.dp).height(200.dp).background(Color(0xFFF8F6EE))) {
                Text(
                    text = "GAME OVER",
                    modifier = Modifier.align(Alignment.TopCenter),
                    textAlign = TextAlign.Center,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold ,
                    color = Color(0xFF766654)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Row( modifier = Modifier
                    .background(Color(0xFFF8F6EE))
                    .align(Alignment.Center).padding(5.dp)
                ) {
                    Text(
                        "7000 points scored in 476 moves.",
                        fontSize = 15.sp,
                        color = Color(0xFF766654),
                        //modifier = Modifier.align(Alignment.Center),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "2 powerups used:",
                        //modifier = Modifier.align(Alignment.TopCenter),
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold ,
                        color = Color(0xFF766654)
                    )
                }

            }

            Box(modifier = Modifier.size(150.dp).padding(top=55.dp).align(Alignment.BottomCenter)) {
                Box(
                    modifier = Modifier.padding(5.dp)
                        )
                 {
                    Column() {
                    Row() {
                        Box(//left button
                            modifier = Modifier.padding(5.dp).background(Color(0xFFB9AB99))
                        ) {
                            Icon(
                                imageVector = Icons.Filled.KeyboardArrowLeft,
                                contentDescription = null,
                                tint = Color(0xFFFDFCFC),
                                modifier = Modifier.size(30.dp).align(Alignment.TopCenter)
                            )
                        }
                        Text(
                            " 3",
                            modifier = Modifier
                                .background(colorN).padding(top=25.dp),
                            textAlign = TextAlign.End,
                            fontSize = 20.sp,
                            color = Color(0xFFA59888))

                        Spacer(modifier = Modifier.height(30.dp).width(25.dp))
                        Box(//mid button
                            modifier = Modifier.padding(5.dp).background(Color(0xFFB9AB99))
                        ) {
                            Icon(
                                imageVector = Icons.Filled.AccountBox,
                                contentDescription = null,
                                tint = Color(0xFFFDFCFC),
                                modifier = Modifier.size(30.dp).align(Alignment.TopCenter)
                            )

                        }
                        Text(
                            " 2",
                            modifier = Modifier
                                .background(colorN).padding(top=25.dp),
                            textAlign = TextAlign.End,
                            fontSize = 20.sp,
                            color = Color(0xFFA59888))
                    }
                }}
            }

        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        //Square
        Box(
            modifier = Modifier.padding(20.dp).background(Color(0xFF907E6E)).size(350.dp)
                .align(Alignment.Center),
        ) {
            Image(painter= painterResource(R.drawable.game),
                contentDescription= "game",
                contentScale = ContentScale.FillBounds,
                modifier= Modifier.size(500.dp).align(Alignment.Center)
            )


        }

        //Buttons


    }
    Box(modifier = Modifier.padding(all = 25.dp).fillMaxSize().padding(top = 650.dp)
    ) {

        Box(
            modifier = Modifier
                .width(160.dp).background(Color(0xFF988979)).align(Alignment.TopStart)
                .padding(bottom = 4.dp)
        ) {
            Text(
                "Play Again",
                fontSize = 20.sp,
                color = colorN,
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Box(
            modifier = Modifier
                .width(160.dp).background(Color(0xFFF8F6EE))
                .border(3.dp, Color(0xFFC7BEB1))
                .align(Alignment.TopEnd).padding(bottom=4.dp)
        ) {
            Text(
                "Undo",
                fontSize = 20.sp,
                color = Color(0xFFC7BEB1),
                modifier = Modifier.align(Alignment.Center))
        }
        Text("You're ou of undos!",modifier=Modifier.align(Alignment.Center),color = Color(0xFFC7BEB1),fontSize = 20.sp)
    }
}