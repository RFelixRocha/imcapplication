package com.rfelixr.imcaplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        input_altura.doAfterTextChanged { text ->
//            Toast.makeText(this,text.toString(),Toast.LENGTH_SHORT).show()
        }
        input_peso.doOnTextChanged { text, start, before, count ->
//            text_view_imc.text = text
        }

        btn_calcular.setOnClickListener{
            calcularImc(input_peso.text.toString(),input_altura.text.toString())
        }
    }

    private fun calcularImc(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura =  altura.toFloatOrNull()

        if (peso != null && altura != null){
            val imc = peso / (altura * altura)

            text_view_imc.text  = "Seu IMC é: %.2f".format(imc)
        }
    }
}