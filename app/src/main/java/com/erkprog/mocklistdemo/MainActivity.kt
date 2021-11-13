package com.erkprog.mocklistdemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erkprog.mocklistdemo.components.ClientItem
import com.erkprog.mocklistdemo.ui.theme.DemoListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoListTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    var selectedClientId by remember { mutableStateOf<String>("") }
    val data = getSampleClients()
    val context = LocalContext.current

    Column(Modifier.fillMaxSize()) {
        data.forEach { client ->
            val selected = selectedClientId == client.id
            ClientItem(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                selected = selected,
                onClick = {
                    selectedClientId = it.id
                    Toast.makeText(
                        context,
                        it.name,
                        Toast.LENGTH_LONG
                    ).show()
                },
                client = client
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    DemoListTheme {
        MainScreen()
    }
}