package com.jtech.foodorderingapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jtech.foodorderingapp.ui.theme.FoodOrderingAppTheme

@Composable
fun Toolbar(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.hamburger_icon),
            contentDescription = "drawer_icon"
        )
        Spacer(modifier = Modifier.width(12.dp))
        Image(
            painter = painterResource(id = R.drawable.pizza_logo),
            contentDescription = "logo",
        )
        Spacer(
            modifier = Modifier
                .width(12.dp)
                .weight(1.0f)
        )
        Text(
            text = "DELIVERY",
            modifier = modifier
                .offset(),
            style = MaterialTheme.typography.bodyMedium.copy(
                fontFamily = FontFamily(Font(R.font.mulish)),
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold
            )
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_dropdown),
            contentDescription = "",
            modifier.offset(),
            tint = MaterialTheme.colorScheme.primary
        )
    }
}

@Composable
fun AddressCard() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colorScheme.secondary,
                shape = RoundedCornerShape(size = 4.dp)
            )
            .padding(8.dp)
    ) {
        Text(text = "29 Hola street, California, USA")
        Spacer(
            modifier = Modifier
                .width(IntrinsicSize.Min)
                .weight(1.0f)
        )
        Icon(
            imageVector = Icons.Filled.LocationOn,
            contentDescription = "location",
            tint = MaterialTheme.colorScheme.primary
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ToolbarPreview() = FoodOrderingAppTheme {
    Toolbar()
}

@Preview
@Composable
fun AddressPreview() = FoodOrderingAppTheme {
    AddressCard()
}