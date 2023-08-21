package com.example.aluvery.sampledata

import com.example.aluvery.R
import com.example.aluvery.model.Product
import java.math.BigDecimal

val sampleProductsPromo = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("12.99"),
        image = R.drawable.burger
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("19.99"),
        image = R.drawable.pizza
    ),
    Product(
        name = "Batata frita",
        price = BigDecimal("7.99"),
        image = R.drawable.fries
    )
)

val sampleProductsDesert = listOf(
    Product(
        name = "Chocolate",
        price = BigDecimal("5.99"),
        image = R.drawable.chocolate
    ),
    Product(
        name = "Sorvete",
        price = BigDecimal("7.99"),
        image = R.drawable.ice_cream
    )
)

val sampleProductsBeverage = listOf(
    Product(
        name = "Cerveja",
        price = BigDecimal("5.99"),
        image = R.drawable.beer
    ),
    Product(
        name = "Refrigerante",
        price = BigDecimal("4.99"),
        image = R.drawable.soda
    ),
    Product(
        name = "Suco",
        price = BigDecimal("4.99"),
        image = R.drawable.juice
    ),
    Product(
        name = "Água",
        price = BigDecimal("2.99"),
        image = R.drawable.water
    )
)