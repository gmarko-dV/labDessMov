package com.example.bienvenidosalcurso

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bienvenidosalcurso.ui.theme.BienvenidosAlCursoTheme

// 1. Ejemplo de Text
@Composable
fun TextExample() {
    Text(text = "Este es un texto simple", style = MaterialTheme.typography.bodyLarge)
}

@Preview(showBackground = true)
@Composable
fun PreviewTextExample() {
    BienvenidosAlCursoTheme { TextExample() }
}

// 2. Ejemplo de TextField
@Composable
fun TextFieldExample() {
    var text by remember { mutableStateOf("") }
    TextField(value = text, onValueChange = { text = it }, label = { Text("Nombre") })
}

@Preview(showBackground = true)
@Composable
fun PreviewTextFieldExample() {
    BienvenidosAlCursoTheme { TextFieldExample() }
}

// 3. Ejemplo de Button
@Composable
fun ButtonExample() {
    Button(onClick = { /* Acción */ }, shape = RoundedCornerShape(8.dp)) {
        Text("Aceptar")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonExample() {
    BienvenidosAlCursoTheme { ButtonExample() }
}

// 4. Ejemplo de Row
@Composable
fun RowExample() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        Text("Izquierda")
        Text("Centro")
        Text("Derecha")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRowExample() {
    BienvenidosAlCursoTheme { RowExample() }
}

// 5. Ejemplo de Column
@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Item 1")
        Text("Item 2")
        Text("Item 3")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewColumnExample() {
    BienvenidosAlCursoTheme { ColumnExample() }
}

// 6. Ejemplo de Card
@Composable
fun CardExample() {
    Card(
        modifier = Modifier.padding(16.dp).fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Text("Esto es una tarjeta con sombra", modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardExample() {
    BienvenidosAlCursoTheme { CardExample() }
}

// 7. Ejemplo de Checkbox
@Composable
fun CheckboxExample() {
    var checked by remember { mutableStateOf(false) }
    Checkbox(checked = checked, onCheckedChange = { checked = it })
}

@Preview(showBackground = true)
@Composable
fun PreviewCheckboxExample() {
    BienvenidosAlCursoTheme { CheckboxExample() }
}
