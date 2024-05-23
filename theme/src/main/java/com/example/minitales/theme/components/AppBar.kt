package com.example.minitales.theme.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.compose.MiniTalesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Appbar(title: String, navIcon: ImageVector? = null, onNav: () -> Unit = {}) {

    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        ), title = {
            Text(text = title)
        }, navigationIcon = {
            navIcon?.let {
                IconButton(onClick = { onNav() }) {
                    Icon(imageVector = navIcon, contentDescription = "Nav Icon")
                }
            }
        }
    )
}

@Composable
@MiniTalesPreview
private fun AppBarPreview() {
    MiniTalesTheme {
        Surface {
            Appbar(title = "Mini Tales", navIcon = Icons.Filled.ArrowBack)
        }
    }
}