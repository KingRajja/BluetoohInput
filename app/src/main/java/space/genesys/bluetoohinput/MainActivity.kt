package space.genesys.bluetoohinput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var okBtn: Button = findViewById(R.id.okButton)
        var lftBtn: Button = findViewById(R.id.leftButton)
        var rgtBtn: Button = findViewById(R.id.rightButton)
        var upBtn: Button = findViewById(R.id.upButton)
        var dwnBtn: Button = findViewById(R.id.downButton)
        var bckBtn: Button = findViewById(R.id.backButton)
        var homeBtn: Button = findViewById(R.id.homeButton)
        okBtn.setOnClickListener{ testView.setText("Нажалась кнопка ОК") }
        lftBtn.setOnClickListener{ testView.setText("Нажалась кнопка LEFT") }
        rgtBtn.setOnClickListener{ testView.setText("Нажалась кнопка RIGHT") }
        upBtn.setOnClickListener{ testView.setText("Нажалась кнопка UP") }
        dwnBtn.setOnClickListener{ testView.setText("Нажалась кнопка DOWN") }
        bckBtn.setOnClickListener{ testView.setText("Нажалась кнопка BACK") }
        homeBtn.setOnClickListener{ this.finish() }
    }

}
