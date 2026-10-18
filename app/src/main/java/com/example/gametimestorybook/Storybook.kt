package com.example.gametimestorybook

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.uikit.R
import com.example.uikit.composable.BottomBar
import com.example.uikit.composable.Card
import com.example.uikit.composable.Pagination
import com.example.uikit.composable.PickerMode
import com.example.uikit.composable.Timer
import com.example.uikit.composable.buttons.PrimaryButton
import com.example.uikit.composable.buttons.TertiaryButton
import com.example.uikit.composable.inputs.Checkbox
import com.example.uikit.composable.inputs.Input
import com.example.uikit.composable.inputs.Select

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun showStorybook() {
    val checkbox = remember { mutableStateOf(false) }
    val fullName = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp),
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars)
            .padding(horizontal = 30.dp)
            .verticalScroll(rememberScrollState())
    ) {
        PrimaryButton(
            onCLick = { },
            text = "Let’s Combat!"
        )
        TertiaryButton(
            onCLick = { }
        )
        Checkbox(
            value = checkbox.value,
            onValueChange = { checkbox.value = !checkbox.value }
        )
        Input(
            value = fullName.value,
            onValueChange = { fullName.value = it },
            placeholder = "Full Name",
            isPassword = false,
            modifier = Modifier
                .padding(horizontal = 20.dp)
        )
        Input(
            value = password.value,
            onValueChange = { password.value = it },
            placeholder = "Password",
            isPassword = true,
            modifier = Modifier
                .padding(horizontal = 20.dp)
        )
        Select(
            title = "FROM",
            mode = PickerMode.DATE,
            datePickerState = rememberDatePickerState(),
            placeholder = "MON, NOV 4,2019"
        )
        Select(
            title = "",
            mode = PickerMode.TIME,
            timePickerState = rememberTimePickerState(),
            placeholder = "12:30 AM"
        )
        BottomBar(
            currentScreen = 0,
            onStatisticsClick = { },
            onDiscoverClick = { },
            onChatClick = { },
            onProfileClick = { },
            onLandingClick = { }
        )
        Card(
            title = "Schedule",
            text = "Easily schedule event/games\n" +
                    "then find like minded players for\n" +
                    "battle. You up for it?",
            onCLick = { },
            image = R.drawable.image
        )
        Pagination(1)
        Pagination(2)
        Pagination(3)
        Timer(
            initialMinutes = 10,
            initialSeconds = 0,
            onFinished = { }
        )
    }
}