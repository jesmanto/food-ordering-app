package com.jtech.foodorderingapp

import android.content.Context
import android.widget.Toast
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
import com.jtech.foodorderingapp.DummyData.foodList
import com.jtech.foodorderingapp.DummyData.pizzaList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(context: Context) {
    Scaffold(
        modifier = Modifier,
        topBar = { TopScreen() }
    ) { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            Box(modifier = Modifier.padding(horizontal = 20.dp, vertical = 14.dp)) {
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(items = pizzaList) { pizza ->
                        ProductItemCard(product = pizza, onAddClicked = {
                            Toast.makeText(context, "Add button clicked", Toast.LENGTH_LONG).show()
                        })
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
    ) {
        Toolbar()
        Spacer(modifier = modifier.height(16.dp))
        AddressCard()
        Spacer(modifier = modifier.height(20.dp))
        LazyRow {
            items(items = foodList) { food ->
                FoodItemCard(modifier = Modifier, food = food, {})
            }
        }
    }
}
