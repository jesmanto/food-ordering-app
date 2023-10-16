package com.jtech.foodorderingapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jtech.foodorderingapp.AddressCard
import com.jtech.foodorderingapp.DummyData.foodList
import com.jtech.foodorderingapp.DummyData.pizzaList
import com.jtech.foodorderingapp.FoodItemCard
import com.jtech.foodorderingapp.ProductItemCard
import com.jtech.foodorderingapp.Toolbar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold (
        modifier = Modifier,
        topBar = { TopScreen() }
    ) {contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            Box (modifier = Modifier.padding(horizontal = 20.dp, vertical = 14.dp)) {
                LazyColumn(
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    items(items = pizzaList) { pizza ->
                        ProductItemCard(product = pizza)
                    }
                }
            }
        }
    }
}

@Composable
fun TopScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(color = MaterialTheme.colorScheme.tertiary)
            .padding(24.dp)
    ){
        Toolbar()
        Spacer(modifier = modifier.height(16.dp))
        AddressCard()
        Spacer(modifier = modifier.height(20.dp))
        LazyRow{
            items(items = foodList) {food ->
                FoodItemCard(modifier = Modifier, food = food)
            }
        }
    }
}
