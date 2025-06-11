package com.example.birdcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.birdcompose.R
import com.example.birdcompose.R as BirdcomposeR

@Composable
fun photoScreen(birdName:String,imageId:Int){
    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = imageId ), contentDescription = "A photo of a $birdName",
        modifier = Modifier.fillMaxWidth().fillMaxHeight(0.65f),
            contentScale = ContentScale.Crop


        )
    }
}
@Preview(showBackground = true)
@Composable
fun photoScreenPreview(){
    photoScreen(birdName = "Owl",R.drawable.owl)
}