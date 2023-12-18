package com.mad.alfreds_compose_library.ui.components.AppBars

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
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
fun LargeFullScreen(){
    // Scaffold is a layout structure where you can place a top app bar,
    // drawers, and other UI elements. We're creating a scaffold with a top app bar.
    Scaffold(
        // The top bar is set to the LargeAppBar() composable function that we've defined below
        topBar = { LargeAppBar() }
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

// This composable represents a large top app bar.
@Composable
fun Large(){
    // We call the LargeAppBar() composable function to display the top app bar.
    LargeAppBar()
}

// Opt-in to use experimental Material 3 API
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LargeAppBar() {
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

        // The action icon is set to a favorite, search, notifications and account icon.
        actions = {
            IconButton(onClick = { /* Handle action icon click */ }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Action Icon")
            }
            IconButton(onClick = { /* Handle action icon click */ }) {
                Icon(Icons.Filled.Search, contentDescription = "Action Icon")
            }
            IconButton(onClick = { /* Handle action icon click */ }) {
                Icon(Icons.Filled.Notifications, contentDescription = "Action Icon")
            }
            IconButton(onClick = { /* Handle action icon click */ }) {
                Icon(Icons.Filled.AccountCircle, contentDescription = "Action Icon")
            }
        }
    )
}


// This is a preview of the LargeFullScreen composable in light theme.
@Preview(showBackground = true)
@Composable
fun LargeFullScreenPreview() {
    AlfredscomposelibraryTheme {
        LargeFullScreen()
    }
}



// This is a preview of the Large composable in light theme.
@Preview(showBackground = true)
@Composable
fun LargePreview() {
    AlfredscomposelibraryTheme {
        Large()
    }
}


// This is a preview of the Large composable in dark theme.
@Preview
@Composable
fun LargeDarkPreview() {
    AlfredscomposelibraryTheme(darkTheme = true) {
        Large()
    }
}