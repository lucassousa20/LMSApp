package br.com.lucassousa.lmsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*


class MainActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        imagem_login.setImageResource(R.drawable.img_login)

        botao_login.setOnClickListener{
            Toast.makeText(this, "Clicou no botão de login", Toast.LENGTH_SHORT).show()

            val nome_usuario = campo_usuario.text.toString()

            val intent = Intent(this, TelaInicialActivity::class.java)
            val params = Bundle()

            params.putString("name", nome_usuario)
            intent.putExtras(params)
            startActivity(intent)
        }
    }
}