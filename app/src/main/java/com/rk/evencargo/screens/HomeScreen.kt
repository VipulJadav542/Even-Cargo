package com.rk.evencargo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rk.evencargo.viewmodel.AuthViewModel

@Composable
fun HomeScreen(authViewModel: AuthViewModel = viewModel()) {
    val user = authViewModel.getCurrentUser()

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
            .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "Welcome, ${user?.email}",
            textAlign = TextAlign.Center,
            color = Color.DarkGray,
            modifier = Modifier.size(100.dp))
    }
}