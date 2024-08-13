package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

@Composable
fun MainScreen(
    stateFlow: MutableStateFlow<MainState>,
    interactions: MainInteractions
) {
    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = spacedBy(16.dp)
        ) {
            Button(onClick = { /* TODO */ }) {
                Text(text = stringResource(id = R.string.cta_button))
            }
        }
    }
}

@Composable
private fun ListItem(
    leftText: String,
    rightText: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = leftText)
        Text(text = rightText)
    }
}

@Composable
private fun Loader() {
    CircularProgressIndicator(color = Color.White)
}

@Composable
private fun PopupDialog(
    onCanceled: () -> Unit,
    onConfirmed: () -> Unit
) {
    AlertDialog(
        title = {
            Text(text = stringResource(id = R.string.alert_dialog_title))
        },
        text = {
            Text(text = stringResource(id = R.string.alert_dialog_body))
        },
        onDismissRequest = { /* TODO */ },
        confirmButton = { 
            Button(onClick = { /* TODO */ } ) {
                Text(text = stringResource(id = R.string.alert_dialog_positive_button))
            }
        },
        dismissButton = {
            Button(onClick = { /* TODO */ }) {
                Text(text = stringResource(id = R.string.alert_dialog_negative_button))
            }
        }
    )
}
