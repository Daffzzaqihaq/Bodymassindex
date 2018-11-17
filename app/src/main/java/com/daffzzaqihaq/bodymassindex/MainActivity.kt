package com.daffzzaqihaq.bodymassindex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.daffzzaqihaq.bodymassindex.R.id.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 1 Membuat Respon Ketika diklik
        btnHitung.setOnClickListener {
            var beratBadan = edtBeratBadan.text.toString()
            var tinggiBadan = edtTinggiBadan.text.toString()
            val kurus = 0.0
            val batasKurus = 18.4
            val normal = 18.5
            val batasNormal = 24.9
            val gemuk = 25.0
            val batasGemuk = 29.9

            //TODO 2 Membuat Kondisi
            if (beratBadan.toDoubleOrNull()!=null && tinggiBadan.toDoubleOrNull()!=null){
                var process = beratBadan.toDouble() / (tinggiBadan.toDouble() * tinggiBadan.toDouble())
                 when (process){
                     in kurus..batasKurus ->{
                         txtHasil.text = "Kamu Kurus $process "
                     }
                     in normal..batasNormal ->{
                         txtHasil.text = "Berat Badan Kamu Normal $process "

                     }
                     in gemuk..batasGemuk ->{
                         txtHasil.text = "Kamu Gemuk $process "
                     }
                     else -> {
                         txtHasil.text = "Kamu Obeditas $process"
                     }
                 }


            }else{
                //TODO 3 Menampilkan pop up apabila kondisi null
                Toast.makeText(this, "Harap Masukan Datanya", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
