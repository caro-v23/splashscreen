package com.example.maggie

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
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

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cardDemo()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cardDemo() {

    val mContext= LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
//TopApp Bar
        TopAppBar(title = {
            Text(
                text = "Homepage",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Magenta),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext,ImageActivity::class.java)) }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack, contentDescription = ""
                    )

                }

            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Share, contentDescription = ""
                    )

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Settings, contentDescription = ""
                    )

                }

            }

        )

        Text(
            text = "Dashboard", fontSize = 30.sp, fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 100.dp)
        )
        Text(
            text = "Types of Dogs",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold,
        )
//Row 1
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_2), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Siberian husky",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_1), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "German shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Bulldog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //Row 2
        Text(
            text = "Genres of Music",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold,
        )
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_4), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Pop Music",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_5), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Jazz Music",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_6), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Rock Music",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //Row 3
        Text(
            text = "Best Swahili Dishes",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold,
        )
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_7), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Wali wa mnazi & Maharagwe",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_8), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Ugali & Nyama Choma",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_9), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Chicken Birian & Mahamri",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //Row 4
        Text(
            text = "Artists",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold,
        )
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_12), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Ariana Grande",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_11), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Beyonce",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_10), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Ed Sheeran",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //Row 5
        Text(
            text = "chefs", fontSize = 20.sp, color = Color.Magenta, fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 100.dp)
        )
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.img_13), contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    Text(
                        text = "Culinary School Of Chefs",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack, contentDescription = ""
                        )
                        Image(
                            painter = painterResource(id = R.drawable.img_14),
                            contentDescription = "",
                            modifier = Modifier.size(150.dp)
                        )
                        Text(
                            text = "HeyChef",
                            fontSize = 20.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))
                //Third card

                Card(modifier = Modifier.size(200.dp)) {
                    Column {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack, contentDescription = ""
                            )
                            Image(
                                painter = painterResource(id = R.drawable.img_15),
                                contentDescription = "",
                                modifier = Modifier.size(150.dp)
                            )
                            Text(
                                text = "Commercial cookery training",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                }
                Spacer(modifier = Modifier.height(20.dp))


                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack, contentDescription = ""
                    )


                }


            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun cardDemoPreview(){
    cardDemo()
}


