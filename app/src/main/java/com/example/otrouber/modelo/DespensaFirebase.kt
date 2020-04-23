package com.example.otrouber.modelo

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class DespensaFirebase {

    private lateinit var database: DatabaseReference

    constructor(){
        database = FirebaseDatabase.getInstance().reference
    }

    fun cargaFirebaseDummy(){
        val items: List<item> = mutableListOf(
        item("", "Leche", 15),
        item("", "Pan", 1),
        item("", "Pasta", 15),
        item("", "Arroz", 3),
        item("", "Frijol", 5)
        )

        items.forEach{
            val key = database.child("despensa").push().key
            it.id = key
            database.child("despensa").child(key!!).setValue(it)
        }
    }

    //Completa los siguientes métodos
    // y crea una pequeña interfaz en la app
    // para probar cada método.
    // Todas las salidas se ven en consola
    // Pueden usar: https://firebase.google.com/docs/database/android/start


    fun cargaUnItem(item: item){
        val key = database.child("despensa").push().key
        item.id = key
        database.child("despensa").child(key!!).setValue(item)
    }


    fun borraUnItem( item: item){
        val key = database.child("despensa").push().key
        item.id = key
        database.child("despensa").child(key!!).setValue(null)
    }

    fun borraTodo( ){

    }

    fun modificaUnItem( item: item){

    }

    fun obtenTodos( ){

    }
}

