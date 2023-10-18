package com.jtech.foodorderingapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jtech.foodorderingapp.ui.theme.FoodOrderingAppTheme

@Composable
fun FoodItemCard(modifier: Modifier = Modifier, food: Food, onItemClicked: ()->Unit) {

    Column(
        modifier = if (food.selected) modifier
            .shadow(
                shape = RoundedCornerShape(12.dp),
                elevation = 14.dp,
                spotColor = MaterialTheme.colorScheme.outline,
                ambientColor = MaterialTheme.colorScheme.outline
            )
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(12.dp)
            )
            .background(
                color = MaterialTheme.colorScheme.secondary,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(8.dp)
        else modifier
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.pizza),
            contentDescription = "",
            modifier = Modifier.size(64.dp),
            contentScale = ContentScale.FillBounds
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = food.title, style = if (!food.selected) MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight.Bold, fontFamily = FontFamily(Font(R.font.mulish)), fontSize = 14.sp
            ) else MaterialTheme.typography.titleLarge.copy(fontSize = 14.sp)
        )
    }
}

@Preview
@Composable
fun FoodItemPreview() = FoodOrderingAppTheme {
    FoodItemCard(
        modifier = Modifier,
        Food("Pizza", true),{}
    )
}