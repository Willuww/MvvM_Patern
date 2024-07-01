package mx.edu.uttt.mvvm_patern.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

//clase que se encarga de heredar de viewmodel nativo de kotlin
class ContadorViewModel : ViewModel() {
    // Declaramos una variable del tipo provada para que nadier pueda ,odificar el valor, de forma externa
    private  val _contador = mutableStateOf(0)

    //Se declara esta variable copia para poder modificada, la variable _contador es la variable que
    //se va a manipular dentro de la clase ContadorVierModel
    val contador: State<Int> = _contador

    //La variable contador solo sera para leer dentro de un composable, separado la logica e intencion
    //de las variables
    fun Add(){
        _contador.value = _contador.value + 1
    }

    //Podemos declarar una variable del tipo contador y modifica desde afuera de la aplicacion
    var conta = mutableStateOf(0)

}