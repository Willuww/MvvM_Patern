package mx.edu.uttt.mvvm_patern.viewModels

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel

class LoteriaViewModel: ViewModel() {
    private val _lottoNumbers = mutableStateOf(emptyList<Int>())
    val lottoNumbers: State<List<Int>> = _lottoNumbers

    fun generateLottoNumbers(){
        ///generamos numeros random
        ///este es un for (1..60), del 1 al 60 toma 6 numeros random y ordenalos
        _lottoNumbers.value = (1..60).shuffled().take(6).sorted()
    }
}