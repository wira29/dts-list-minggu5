package com.example.dts_list_minggu5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bundle = intent.extras
        val data : Array<String> = intent.getStringArrayExtra("detail") as Array<String>

        val title = findViewById<TextView>(R.id.d_title)
        val ibukota = findViewById<TextView>(R.id.d_ibukota)
        val desc = findViewById<TextView>(R.id.d_desc)

        title.text = data[0]
        ibukota.text = data[1]
        desc.text = data[2]
    }
}