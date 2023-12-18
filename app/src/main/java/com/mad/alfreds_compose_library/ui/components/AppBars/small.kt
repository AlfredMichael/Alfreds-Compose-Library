package com.mad.alfreds_compose_library.ui.components.AppBars

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mad.alfreds_compose_library.ui.theme.AlfredscomposelibraryTheme

// Opt-in to use experimental Material 3 API
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallFullScreen(){
    // Scaffold is a layout structure where you can place a top app bar,
    // drawers, and other UI elements. We're creating a scaffold with a top app bar.
    Scaffold(
        // The top bar is set to the MyAppBar() composable function that we've defined below.
        topBar = { MyAppBar() }
    ) {paddingValues ->
        // Inside the scaffold, we have a column that scrolls vertically.
        Column(modifier = Modifier
            .padding(paddingValues)
            .verticalScroll(rememberScrollState())) {
            // You can add more composables inside this column.
            // Can also add another column here and set the padding

        }

    }
}


// This composable represents a small top app bar.
@Composable
fun Small(){
    // We call the MyAppBar() composable function to display the top app bar.
    MyAppBar()
}


// Opt-in to use experimental Material 3 API
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAppBar() {
    // TopAppBar is a composable that represents a top app bar.
    TopAppBar(
        // The title of the top app bar is set to "My App".
        title = { Text("My App") },

        // The navigation icon is set to a menu icon.
        navigationIcon = {
            IconButton(onClick = { /* Handle navigation icon click */ }) {
                Icon(Icons.Filled.Menu, contentDescription = "Navigation Icon")
            }
        },

        // The action icon is set to a favorite icon.
        actions = {
            IconButton(onClick = { /* Handle action icon click */ }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Action Icon")
            }
        }
    )
}

// This is a preview of the SmallFullScreen composable in light theme.
@Preview(showBackground = true)
@Composable
fun SmallFullScreenPreview() {
    AlfredscomposelibraryTheme {
        SmallFullScreen()
    }
}

// This is a preview of the Small composable in light theme.
@Preview(showBackground = true)
@Composable
fun SmallPreview() {
    AlfredscomposelibraryTheme {
        Small()
    }
}


// This is a preview of the Small composable in dark theme.
@Preview
@Composable
fun SmallDarkPreview() {
    AlfredscomposelibraryTheme(darkTheme = true) {
        Small()
    }
}