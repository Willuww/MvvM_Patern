package mx.edu.uttt.mvvm_patern.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.edu.uttt.mvvm_patern.viewModels.LoteriaViewModel

@Composable
fun LoteriaView(viewModel: LoteriaViewModel){
    //extraemos el valor del MvvM
    val lottoNumbers = viewModel.lottoNumbers.value
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        if(lottoNumbers.isEmpty())
        {
            Text(text = "Loteria", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        }
        else {
            LotteryNumbers(numbers = lottoNumbers)
        }
        ///establecemos el boton que genera los numeros aleatorios
        Button(onClick = { viewModel.generateLottoNumbers() }) {
            Text(text = "Generar", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun LotteryNumbers(numbers: List<Int>){
    LazyRow (contentPadding = PaddingValues(
        horizontal = 16.dp,
        vertical = 8.dp
    )){

    }
}