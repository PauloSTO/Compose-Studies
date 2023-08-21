package com.example.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.sampledata.sampleProductsBeverage
import com.example.aluvery.sampledata.sampleProductsDesert
import com.example.aluvery.sampledata.sampleProductsPromo
import com.example.aluvery.ui.components.ProductsSection

@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        ProductsSection("Promoções", sampleProductsPromo)
        ProductsSection("Doces", sampleProductsDesert)
        ProductsSection("Bebidas", sampleProductsBeverage)
        Spacer(Modifier)
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}