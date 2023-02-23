package com.juraj.fluid

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.juraj.fluid.ui.theme.FluidBottomNavigationTheme

@Composable
fun MainScreen() {
    Column(Modifier.fillMaxSize()) {

    }
}


@Composable
@Preview(device = "id:pixel_4a", showBackground = true, backgroundColor = 0xFF3A2F6E)
private fun MainScreenPreview() {
    FluidBottomNavigationTheme {
        MainScreen()
    }
}
