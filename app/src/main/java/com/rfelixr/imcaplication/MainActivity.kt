package com.rfelixr.imcaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("CicloDeVida","Entrei no CREATE - Criando a tela.")
    }

    override fun onStart() {
        super.onStart()
        Log.w("CicloDeVida","Entrei no START - Tela visível.")
    }

    override fun onResume() {
        super.onResume()
        Log.w("CicloDeVida","Entrei no RESUME - Pode interagir com a tela visível.")
    }

    override fun onPause() {
        super.onPause()
        Log.w("CicloDeVida","Entrei no PAUSE - Tela perdeu o foco. Não pode mais interagir.")
    }

    override fun onStop() {
        super.onStop()
        Log.w("CicloDeVida","Entrei no STOP - Tela não visível, mas ainda existe.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("CicloDeVida","Entrei no RESTART - Tela está retomando o foco.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("CicloDeVida","Entrei no DESTROY - Tela destruída.")
    }
}