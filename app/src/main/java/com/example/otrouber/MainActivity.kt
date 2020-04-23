package com.example.otrouber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.otrouber.modelo.DespensaFirebase
import com.example.otrouber.modelo.item
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private val despensaFirebase: DespensaFirebase = DespensaFirebase()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //despensaFirebase.cargaFirebaseDummy()
    }

    fun agregaItem(view:View){
        despensaFirebase.cargaUnItem(item("", "Almendras", 15))
    }


    fun borrarItem(view: View){
        despensaFirebase.borraUnItem(item("", "Almendras", 15))
    }

    fun borrarTodo(view: View){

    }

    fun modificarItem(view: View){

    }

    fun obtenerItem(view: View){

    }

    override fun onResume() {
        super.onResume()

    }
}
