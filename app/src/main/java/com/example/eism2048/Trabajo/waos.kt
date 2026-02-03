package com.example.eism2048.Trabajo

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
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable



fun Main() {
    //Color variables
    val colorN =Color(0xFFFDFDFD)
    val RegColor= Color(0xFF766654)

    //Working area
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF8F6EE))) {
        Box() {
            //titlebar
            Box(Modifier.fillMaxWidth().height(200.dp).background(Color(0xFFF8F6EE))) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = null,
                    tint = Color(0xFF766654),
                    modifier = Modifier.size(40.dp).align(Alignment.TopStart)
                )
                Text(
                    text = "2048",
                    modifier = Modifier.align(Alignment.TopCenter),
                    textAlign = TextAlign.Center,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold ,
                    color = Color(0xFF766654)
                )
                Icon(
                    imageVector = Icons.Filled.Refresh,
                    contentDescription = null, tint = Color(0xFF766654),
                    modifier = Modifier.size(40.dp).align(Alignment.TopEnd)
                )
            }
            Spacer(modifier = Modifier.height(30.dp))
            //Scoremarkers
            Box(modifier = Modifier.padding(top = 20.dp).fillMaxWidth().height(100.dp).padding(8.dp)) {

                Box(
                    modifier = Modifier
                        .width(160.dp).background(Color(0xFFE8E5D9)).align(Alignment.BottomStart)
                        .padding(5.dp)
                ) {
                    Text(
                        "SCORE",
                        fontSize = 20.sp,
                        color = Color(0xFF766654),
                        modifier = Modifier.align(Alignment.TopStart),
                        textAlign = TextAlign.Right
                    )
                    Text(
                        "1692",
                        fontSize = 20.sp,
                        color = Color(0xFF766654),
                        modifier = Modifier.align(Alignment.TopEnd),
                        textAlign = TextAlign.Left
                    )
                }
                //VerticalDivider(modifier = Modifier.height(30.dp))
                Box(
                    modifier = Modifier
                        .width(160.dp).background(Color(0xFFF8F6EE))
                        .border(3.dp, Color(0xFFE8E5D9))
                        .align(Alignment.BottomEnd).padding(5.dp)
                ) {
                    Text(
                        "BEST",
                        fontSize = 20.sp,
                        color = Color(0xFF766654),
                        modifier = Modifier.align(Alignment.TopStart),
                        textAlign = TextAlign.Right
                    )
                    Text(
                        "7000",
                        fontSize = 20.sp,
                        color = Color(0xFF766654),
                        modifier = Modifier.align(Alignment.TopEnd),
                        textAlign = TextAlign.Left
                    )
                }
            }

        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        //Square
        Box(
            modifier = Modifier.padding(20.dp).background(Color(0xFF907E6E)).size(350.dp)
                .align(Alignment.Center),
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row() { Text("2") }
                Row() { Text("2") }
                Row() { Text("2") }
                Row() { Text("2") }
            }


        }
        //Buttons
        Box(modifier = Modifier.padding(30.dp).align(Alignment.BottomCenter)) {
            Box(
                modifier = Modifier.padding(5.dp).background(Color(0xFFE1DDCD))
            ) {
                Box(//left button
                    modifier = Modifier.padding(5.dp).background(Color(0xFFB9AB99))
                ) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowLeft,
                        contentDescription = null,
                        tint = Color(0xFFFDFCFC),
                        modifier = Modifier.size(30.dp).align(Alignment.TopCenter)
                    )
                    Text(
                        "_ _",
                        modifier = Modifier.align(Alignment.Center),
                        textAlign = TextAlign.Center,
                        fontSize = 40.sp,
                        color = Color(                            0xFFA59888                        )
                    )
                }

            }
        }

    }
}