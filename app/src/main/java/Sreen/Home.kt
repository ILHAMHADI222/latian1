package Sreen

import Component.ImageComponent
import Component.TextComponent
import android.view.Surface
import androidx.compose.foundation.layout.*

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plugin.ilhamshop.R




@Composable
fun Home(){
    Column {


      ImageComponent(img = R.drawable.vans, modifier = Modifier)



        Column(

            modifier = Modifier
                .padding(9.dp)
        ) {


            Spacer(modifier = Modifier.height(122.dp))
            TextComponent(
                text = stringResource(id = R.string.title) ,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                fontSize = 26.sp)

            Row{

                Spacer(modifier = Modifier.width(10.dp))
                TextComponent(text = stringResource(id = R.string.Descriptiom) ,
                    color = Color.Black ,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp)

            }

            Spacer(modifier = Modifier.width(12.dp))
           TextComponent(text = stringResource(id = R.string.Price) ,
               color = Color.Black ,
               fontWeight = FontWeight.Bold,
               fontSize = 40.sp)
        }
        
    }

    
    
}
@Preview
@Composable
fun  HonePreview(){
    Surface(
        modifier = Modifier.fillMaxSize()
    ){
        Home()
    }
}
