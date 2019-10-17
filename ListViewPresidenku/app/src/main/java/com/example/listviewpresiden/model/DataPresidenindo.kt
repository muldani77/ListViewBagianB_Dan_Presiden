package com.example.listviewpresiden.model

import com.example.listviewpresiden.R
import kotlinx.android.synthetic.main.daftar_presiden.view.*

object DataPresidenindo {
    private val nama_presidenindo = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "BJ. Habibie",
        "Abdurrahman Wahid",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val detail = arrayOf(
        "Ir. Soekarno adalah presiden pertama RI, dan wakilnya adalah Moh.Hatta",
        "Soeharto adalah presiden kedua RI yang menjabat selama lebih dari 30 tahun",
        "BJ. Habibie adalah presiden ketiga RI yang menggantikan Soeharto",
        "Abdurrahman Wahid atau biasa dikenal dengan Gusdur adalah presiden keempat RI",
        "Megawati adalah presiden kelima RI dan merupakan presiden wanita pertama di Indonesia",
        "Susilo Bambang Yudhoyono adalah presiden RI keenam",
        "Joko Widodo atau biasa dikenal Jokowi adalah presiden RI ketujuh"
    )

    private val presidenindoPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listPresidenindo:ArrayList<Presidenindo>
    get() {
        val list = arrayListOf<Presidenindo>()
        for (position in nama_presidenindo.indices){
            val presidenindo = Presidenindo()
            presidenindo.name = nama_presidenindo[position]
            presidenindo.detail = detail[position]
            presidenindo.poster = presidenindoPoster[position]
            list.add(presidenindo)
        }
        return list
    }
}
