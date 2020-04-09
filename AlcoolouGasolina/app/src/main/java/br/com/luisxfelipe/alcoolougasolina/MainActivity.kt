package br.com.luisxfelipe.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(v:View){

        var precoAlcool:Double? = et_precoAlcool.text.toString().toDoubleOrNull()
        var precoGasolina:Double? = et_precoGasolina.text.toString().toDoubleOrNull()

        var resultado:Double?

        if ((precoAlcool != null) && (precoGasolina != null)){
            resultado = precoAlcool / precoGasolina

            if (resultado > 0.7){
                tv_resultado.setText("Gasolina")
            } else{
                tv_resultado.setText("Álcool")
            }
        }

        if (precoAlcool == null) {
            tv_resultado.setText("Digite o preço do Álcool")
        }

        if (precoGasolina == null) {
            tv_resultado.setText("Digite o preço da Gasolina")
        }
    }
}
