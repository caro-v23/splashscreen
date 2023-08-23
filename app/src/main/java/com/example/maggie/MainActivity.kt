package com.example.maggie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maggie.ui.theme.MaggieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            demo()

        }
    }
}

@Composable
fun demo(){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)){
        Text(text = "Hello Maggie", color = Color.Red,
            fontSize = 30.sp, fontFamily = FontFamily.Cursive, textDecoration = TextDecoration.Underline)
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Welcome to Android", color = Color.Blue, fontSize = 20.sp ,fontFamily = FontFamily.Monospace)
        Text(text = "Kotlin")
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "Jetpack compose", color = Color.Magenta , fontSize = 20.sp , fontFamily = FontFamily.Default)
        Divider()
        Spacer(modifier = Modifier.height(30.dp))
        Row {
            Text(text = "Text 1",
                fontSize = 30.sp)
            Spacer(modifier = Modifier.width(50.dp))
            Text(text = "Text 2",
                fontSize = 30.sp)
        }
        Row {
            Text(text = "eMobilis",
                fontSize = 30.sp)
            Spacer(modifier = Modifier.width(50.dp))
            Text(text = "Technology",
                fontSize = 30.sp)
        }
        Box {
            Text(text = "Yes",
                fontSize = 30.sp)
            Text(text = "No",
                fontSize = 30.sp)
        }
        Button(onClick = { /*TODO*/ }, shape = RectangleShape, colors = ButtonDefaults.buttonColors(
            Color.Red)) {
            Text(text = "Click Me")
        }
        Button(onClick = { /*TODO*/ }) {
            Image(painter = painterResource(id = R.drawable.img_3), contentDescription ="icon")
            Text(text = "Add to cart", modifier = Modifier.padding(start = 10.dp))
        }
        //Bordered button
        Button(onClick = { /*TODO*/ },
            shape = CutCornerShape(5.dp),
            border = BorderStroke(3.dp, Color.Magenta),
            colors = ButtonDefaults.outlinedButtonColors()
        ) {
          Text(text = "Bordered button")
        }
    }


}



@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    demo()
}
