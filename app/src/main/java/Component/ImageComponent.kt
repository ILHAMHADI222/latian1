package Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plugin.ilhamshop.R

@Composable
fun ImageComponent (img :Int, modifier: Modifier){
    Image(
        painter = painterResource(id = img),
        contentDescription = "image",
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(10.dp))

    )

}
@Preview
@Composable
fun PreviewImage(){
    androidx.compose.material.Surface (modifier = Modifier.fillMaxSize()){
        ImageComponent(R.drawable.vans,
            modifier = Modifier)

    }
}

