package com.example.appcadastroaluno.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.appcadastroaluno.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNomeAluno = findViewById<TextInputEditText>(R.id.edt_nome_aluno)
        val btnProximo = findViewById<Button>(R.id.btn_proximo)

        btnProximo.setOnClickListener {
            val nome = edtNomeAluno.text.toString()

            if (nome.isNotEmpty()) {
                val intent = Intent(this, DetalhesAlunoActivity::class.java)
                intent.putExtra("nomeAluno", nome)
                startActivity(intent)
            } else {
                AlertDialog.Builder(this)
                    .setTitle("Atenção")
                    .setMessage("Por favor, digite o nome do aluno.")
                    .setPositiveButton("OK", null)
                    .show()
            }
        }
    }
}