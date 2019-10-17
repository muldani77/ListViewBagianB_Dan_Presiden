package com.example.listviewb

import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewb.adapter.ListBahasakuAdapter

import com.example.listviewb.model.Bahasaku
import com.example.listviewb.model.DataBahasaku
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Array


class MainActivity : AppCompatActivity() {
    private lateinit var rvBahasaku: RecyclerView
    private var list: ArrayList<Bahasaku> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBahasaku = findViewById(R.id.bahasaku)
        rvBahasaku.setHasFixedSize(true)
        list.addAll(DataBahasaku.listBahasaku)
        showBahasakuList()
    }

    private fun showBahasakuList() {
        rvBahasaku.layoutManager = LinearLayoutManager(this)
        rvBahasaku.adapter = ListBahasakuAdapter(this, list)
        {
            Toast.makeText(this, it.detail, Toast.LENGTH_SHORT).show();
        }
    }

}
