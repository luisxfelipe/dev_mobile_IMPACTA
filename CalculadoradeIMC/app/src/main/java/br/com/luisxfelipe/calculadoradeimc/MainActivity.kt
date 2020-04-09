package br.com.luisxfelipe.calculadoradeimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(v:View){

        var peso:Double? = et_peso.text.toString().toDoubleOrNull()
        var altura:Double? = et_altura.text.toString().toDoubleOrNull()

        var resultado:Double?

        if ((peso != null) && (altura != null)){

            resultado = peso / (altura.pow(2))

            if (resultado < 18.5){
                tv_resultado.setText("Abaixo do peso")
            }

            if ((resultado >= 18.5) && (resultado <= 24.9)) {
                tv_resultado.setText("Peso normal")
            }

            if ((resultado >= 25) && (resultado <= 29.9)) {
                tv_resultado.setText("Sobre peso")
            }

            if ((resultado >= 30) && (resultado <= 34.9)) {
                tv_resultado.setText("Obesidade grau 1")
            }

            if ((resultado >= 35) && (resultado <= 39.9)) {
                tv_resultado.setText("Obesidade grau 2")
            }

            if (resultado >= 40){
                tv_resultado.setText("Obesidade grau 3")
            }



        }

        if (peso == null) {
            tv_resultado.setText("Digite seu peso")
        }

        if (altura == null) {
            tv_resultado.setText("Digite sua altura")
        }
    }
}
