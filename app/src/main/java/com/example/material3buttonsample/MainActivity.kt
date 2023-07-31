package com.example.material3buttonsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.material3buttonsample.ui.theme.Material3ButtonSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3ButtonSampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        /**
                         * 1. Filled Button
                         * Most prominent button type for very important actions.
                         * Do not use them too often in one screen!
                         */
                        Button(
                            onClick = { }
                        ) {
                            Text(text = "Subscribe")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        /**
                         * 2. Elevated button.
                         * Less prominent. Good for second actions on a screen.
                         * Icons can be added to nearly every button.
                         * Always use 18 dp as size and 8 dp width space between icon and text.
                         */
                        ElevatedButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "Add to card",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "Add to card")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        /**
                         * 3. Filled Tonal Button
                         * Also very good for seconad actions that don`t have a big impact.
                         */
                        FilledTonalButton(onClick = {}) {
                            Text(text = "Open in browser")
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        /**
                         * 4. Outlined button.
                         * Even less prominent as filled tonal button.
                         * Good for options that users should not use even it`s provided :)
                         */
                        OutlinedButton(onClick = {}) {
                            Text(text = "Back")
                        }
                        Spacer(Modifier.height(8.dp))
                        /**
                         * 5. Text Button
                         * Use if there is sth clickable which the user can open but it is not
                         * important that the user does it.
                         * Good for very less important actions.
                         */
                        TextButton(onClick = {}) {
                            Text(text = "Learn more")
                        }
                    }
                }
            }
        }
    }
}