package com.example.maggie

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maggie.ui.theme.MaggieTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Splash()
            val mContext = LocalContext.current
            val coroutiScope = rememberCoroutineScope()
            coroutiScope.launch(){
                delay(3000)
                mContext.startActivity(Intent(mContext,HomapageActivity::class.java))
                finish()
            }

        }
    }
}

@Composable
fun Splash (){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(painter = painterResource(id = R.drawable.splash), contentDescription = "",
            modifier = Modifier.size(400.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Legrande Hotel",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta)

//        //CircularProgress indicator
//        CircularProgressIndicator(
//            modifier = Modifier.size(50.dp),
//            color = Color.Black,
//            strokeWidth = 5.dp)


        //linear progress indicator
        LinearProgressIndicator(
            modifier=Modifier.padding(20.dp)
                .height(10.dp),
            color = Color.Magenta)




    }

}


@Preview(showBackground = true)
@Composable
fun SplashPreview(){
    Splash()
}
