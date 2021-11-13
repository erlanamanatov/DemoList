package com.erkprog.mocklistdemo.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erkprog.mocklistdemo.Client
import com.erkprog.mocklistdemo.getSampleClients
import com.erkprog.mocklistdemo.ui.theme.DemoListTheme

@Composable
fun ClientItem(
    modifier: Modifier = Modifier,
    selected: Boolean,
    onClick: (Client) -> Unit,
    client: Client
) {

    Column(
        modifier = modifier
            .clickable {
                onClick(client)
            }
            .border(
                width = if (selected) 2.dp else 1.dp,
                color = if (selected) Color.Red else Color.LightGray,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(8.dp)
    ) {
        Row(
            Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = client.name,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(4.dp))
                IconButton(onClick = {}) {
                    Icon(Icons.Default.Edit, contentDescription = "")
                }
            }
            RadioButton(
                selected = selected, onClick = {},
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.Red
                )
            )

        }
        Spacer(Modifier.height(4.dp))
        Row() {
            Icon(
                Icons.Filled.Phone,
                contentDescription = "",
                tint = Color.Red
            )
            Spacer(Modifier.width(4.dp))
            Text(text = client.phone)
        }
        Spacer(Modifier.height(6.dp))
        Row() {
            Icon(
                Icons.Filled.Email,
                contentDescription = "",
                tint = Color.Red
            )
            Spacer(Modifier.width(4.dp))
            Text(text = client.email)
        }
        Spacer(Modifier.height(6.dp))
        Row() {
            Icon(
                Icons.Filled.LocationOn,
                contentDescription = "",
                tint = Color.Red
            )
            Spacer(Modifier.width(4.dp))
            Text(text = "${client.streetAddress1}, ${client.state} ${client.zipCode}")
        }
    }
}

@Preview(widthDp = 450)
@Composable
fun ClientSelectedPreview() {
    DemoListTheme() {
        androidx.compose.material.Surface() {
            val client = getSampleClients().first()
            ClientItem(
                selected = true, onClick = { /*TODO*/ }, client = client,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(widthDp = 450)
@Composable
fun ClientNotSelectedPreview() {
    DemoListTheme() {
        val client = getSampleClients().first()
        androidx.compose.material.Surface() {
            ClientItem(
                selected = false,
                onClick = {},
                client = client,
                modifier = Modifier.padding(16.dp)
            )

        }

    }
}
