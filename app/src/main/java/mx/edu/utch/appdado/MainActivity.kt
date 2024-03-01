package mx.edu.utch.appdado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var dato: EditText
    private lateinit var imagenes: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dato = findViewById(R.id.num)
        imagenes = findViewById(R.id.imageView)
    }

    private fun convertir(): String {
        val numero = (1..6).random()
        return when (numero) {
            1 -> "Uno"
            2 -> "Dos"
            3 -> "Tres"
            4 -> "Cuatro"
            5 -> "Cinco"
            6 -> "Seis"
            else -> "Cero"
        }
    }

    fun lanzarDado(view: View) {
        val resultado = convertir()
        dato.setText(resultado)

        when (resultado) {
            "Uno" -> imagenes.setImageResource(R.drawable.dado_1)
            "Dos" -> imagenes.setImageResource(R.drawable.dado_2)
            "Tres" -> imagenes.setImageResource(R.drawable.dado_3)
            "Cuatro" -> imagenes.setImageResource(R.drawable.dado_4)
            "Cinco" -> imagenes.setImageResource(R.drawable.dado_5)
            "Seis" -> imagenes.setImageResource(R.drawable.dado_6)
        }
    }
}
