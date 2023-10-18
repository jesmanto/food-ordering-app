package com.jtech.foodorderingapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jtech.foodorderingapp.ui.theme.FoodOrderingAppTheme

@Composable
fun BottomSheet() {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Classic pepperoni", style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.weight(1F))
            Image(
                painter = painterResource(id = R.drawable.close_24px),
                contentDescription = "close button", contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
        SectionHeader(category = "Choose size", tag = "required")
    }
}

@Composable
fun ExtrasComposable(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(selected = true, onClick = { /*TODO*/ })
        Text(
            text = "Small - 6”",
            modifier.weight(1F),
            style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight(400), fontSize = 14.sp
            )
        )
        Text(
            text = "$8", style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight(400), fontSize = 14.sp
            )
        )
    }
}

@Composable
fun AddOnItem(modifier: Modifier = Modifier) {
    var checkedState by rememberSaveable {
        mutableStateOf(true)
    }
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checkedState,
            onCheckedChange = { checkedState = it },
        )
        Text(
            text = "Small - 6”",
            modifier.weight(1F),
            style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight(400), fontSize = 14.sp
            )
        )
        Text(
            text = "$8", style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight(400), fontSize = 14.sp
            )
        )
    }
}

@Composable
fun RequiredTag(tag: String) {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.tertiaryContainer,
                shape = RoundedCornerShape(100.dp)
            )
            .background(
                MaterialTheme.colorScheme.tertiaryContainer,
                shape = RoundedCornerShape(100.dp)
            )
            .padding(horizontal = 8.dp, vertical = 6.dp)
    ) {
        Text(
            text = tag.uppercase(),
            color = MaterialTheme.colorScheme.tertiary,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge.copy(
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}

@Composable
fun SectionHeader(category: String, tag: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = category, style = MaterialTheme.typography.titleLarge.copy(
                fontSize = 16.sp
            )
        )
        Spacer(modifier = Modifier.weight(1F))
        RequiredTag(tag = tag)
    }
}

@Preview(showBackground = true)
@Composable
fun ExtraCompPrev() = FoodOrderingAppTheme {
    ExtrasComposable()
}

@Preview(showBackground = true)
@Composable
fun AddOnCompPrev() = FoodOrderingAppTheme {
    AddOnItem()
}

@Preview
@Composable
fun TagPreview() = FoodOrderingAppTheme {
    RequiredTag("required")
}

@Preview(showBackground = true)
@Composable
fun BottomSheetPreview() = FoodOrderingAppTheme {
    BottomSheet()
}

@Preview
@Composable
fun SectionHeaderPrev() = FoodOrderingAppTheme {
    SectionHeader(category = "Choose size", tag = "Required")
}