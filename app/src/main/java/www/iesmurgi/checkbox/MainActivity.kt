package www.iesmurgi.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun metodoClick () {
        val textoDia:EditText
        textoDia = findViewById<EditText>(R.id.texto)
        //textoDia.setText("PULSADO DIA: ")
    }
}