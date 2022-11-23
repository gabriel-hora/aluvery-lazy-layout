package br.com.alura.aluvery.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(
    searchText: String,
    onSearchChange: (String) -> Unit
) {
    OutlinedTextField(
        value = searchText,
        onValueChange = { newValue ->
            onSearchChange(newValue)
        },
        Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(50),
        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = "ícone de busca")
        },
        label = {
            Text("Produto")
        },
        placeholder = {
            Text("O que você procura?")
        }
    )
}