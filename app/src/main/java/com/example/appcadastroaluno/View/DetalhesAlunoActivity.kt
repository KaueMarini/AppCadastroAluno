package com.example.appcadastroaluno.View

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.appcadastroaluno.R
import kotlin.random.Random

class DetalhesAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_aluno)

        val txvNomeAluno = findViewById<TextView>(R.id.txv_nome_aluno)
        val txvMatricula = findViewById<TextView>(R.id.txv_matricula)
        val btnGerarMatricula = findViewById<Button>(R.id.btn_gerar_matricula)
        val nome = intent.getStringExtra("nomeAluno")
        txvNomeAluno.text = nome

        btnGerarMatricula.setOnClickListener {
            val numeroMatricula = Random.nextInt(100000, 999999)
            txvMatricula.text = numeroMatricula.toString()
        }
    }
}