package com.jtech.foodorderingapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jtech.foodorderingapp.ui.theme.FoodOrderingAppTheme

@Composable
fun ProductItemCard(modifier: Modifier = Modifier, product: Pizza) {
    val linear = Brush.linearGradient(
        listOf(
            MaterialTheme.colorScheme.secondary,
            MaterialTheme.colorScheme.tertiary
        )
    )
    Row(
        modifier
            .padding(6.dp)
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .clip(RoundedCornerShape(13.dp))
            .border(width = 1.dp, color = Color.Transparent, shape = RoundedCornerShape(13.dp))
            .background(linear)
    ) {
        Image(
            modifier = Modifier.fillMaxHeight(),
            painter = painterResource(id = R.drawable.half_pizza),
            contentDescription = "half pizza",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .height(IntrinsicSize.Min)
        ) {
            Column(
                modifier = Modifier
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                Text(
                    text = product.name ?: "No data",
                    fontFamily = FontFamily(Font(R.font.mulish)),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    overflow = TextOverflow.Ellipsis, maxLines = 1
                )
                Text(
                    text = product.description ?: "No data",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.mulish))
                    ),
                    maxLines = 2, overflow = TextOverflow.Ellipsis
                )
            }
            Row(modifier = Modifier.padding(start = 12.dp)) {
                Text(
                    text = "$${product.price}",
                    style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                    modifier = Modifier.weight(weight = 1f)
                )
                Text(text = "+ ADD",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        color = Color.White
                    ),
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(topStart = 13.dp, bottomEnd = 13.dp))
                        .background(color = MaterialTheme.colorScheme.primary)
                        .padding(horizontal = 20.dp, vertical = 5.dp)
                        .clickable { TODO() }
                )

            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun FoodCardPreview() = FoodOrderingAppTheme {
    ProductItemCard(
        modifier = Modifier,
        Pizza("Margarita", "Medium", "Medium | Cheese , onion, and tomato pure", 1.0)
    )
}