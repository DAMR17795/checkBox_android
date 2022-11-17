package www.iesmurgi.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var texto = findViewById<TextView>(R.id.texto)
        val checkBox = findViewById<CheckBox>(R.id.lunes)
        val checkBox1 = findViewById<CheckBox>(R.id.martes)
        val checkBox2 = findViewById<CheckBox>(R.id.miercoles)
        val checkBox3 = findViewById<CheckBox>(R.id.jueves)
        val checkBox4 = findViewById<CheckBox>(R.id.viernes)
        val checkBox5 = findViewById<CheckBox>(R.id.sabado)
        val checkBox6 = findViewById<CheckBox>(R.id.domingo)

        }
    fun metodoClick (view: View) {
        if (view is CheckBox) {
            val checked=view.isChecked
            var texto = findViewById<TextView>(R.id.texto)
            var horas =0
            when (view.getId()) {
                R.id.lunes ->
                    if (checked) {
                        texto.setText("PULSADO: LUNES, tenemos 2 horas de PMDM")
                        horas+=2
                    } else {
                        texto.setText("PULSADO: NINGUNO")
                    }
                R.id.martes ->
                    if (checked) {
                        texto.setText("PULSADO: MARTES, tenemos 2 horas de PMDM")
                        horas+=2
                    } else {
                        texto.setText("PULSADO: NINGUNO")
                    }
                R.id.miercoles ->
                    if (checked) {
                        texto.setText("PULSADO: MIÉRCOLES")
                    } else {
                        texto.setText("PULSADO: NINGUNO")
                    }
                R.id.jueves ->
                    if (checked) {
                        texto.setText("PULSADO: JUEVES, tenemos 3 horas de PMDM")
                        horas+=2
                    } else {
                        texto.setText("PULSADO: NINGUNO")
                    }
                R.id.viernes ->
                    if (checked) {
                        texto.setText("PULSADO: VIERNES")
                    } else {
                        texto.setText("PULSADO: NINGUNO")
                    }
                R.id.sabado ->
                    if (checked) {
                        texto.setText("PULSADO: SABADO")
                    } else {
                        texto.setText("PULSADO: NINGUNO")
                    }
                R.id.domingo ->
                    if (checked) {
                        texto.setText("PULSADO: DOMINGO")
                    } else {
                        texto.setText("PULSADO: NINGUNO")
                    }
            }
        }
    }



}