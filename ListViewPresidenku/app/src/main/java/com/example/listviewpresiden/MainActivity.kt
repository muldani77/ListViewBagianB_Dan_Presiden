package com.example.listviewpresiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewpresiden.adapter.ListPresidenindoAdapter
import com.example.listviewpresiden.model.DataPresidenindo
import com.example.listviewpresiden.model.Presidenindo

class MainActivity : AppCompatActivity() {
    private  lateinit var rvPresidenindo: RecyclerView
    private var list: ArrayList<Presidenindo> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresidenindo = findViewById(R.id.rv_presidenindo)
        rvPresidenindo.setHasFixedSize (true)
        list.addAll (DataPresidenindo.listPresidenindo)
        showPresidenList()
    }

    private fun showPresidenList(){
        rvPresidenindo.layoutManager = LinearLayoutManager (this)
        rvPresidenindo.adapter = ListPresidenindoAdapter (this, list) {
            Toast.makeText(this, it.detail,Toast.LENGTH_SHORT).show();
        }
    }
}
