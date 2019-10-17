package com.example.listviewb.model

import com.example.listviewb.R

object DataBahasaku {
    private val nama_bahasaku = arrayOf(
        "Ruby",
        "Ralis",
        "Phyton",
        "Java Script",
        "PHP"
    )
    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Ruby on Ralis is a server-side web application development framework written in Ruby language",
        "Phyton is interpreted scripting and object-oriented programming language",
        "Java Script is an object-based scripting language",
        "PHP is an interpreted language, i.e., there is no need for compilation"
    )
    private val bahasakuPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.ralis,
        R.drawable.phyton,
        R.drawable.javascript,
        R.drawable.php
    )
    val listBahasaku: ArrayList<Bahasaku>
        get(){
            val list = arrayListOf<Bahasaku>()
            for (position in nama_bahasaku.indices){
                val bahasaku = Bahasaku()
                bahasaku.name = nama_bahasaku[position]
                //bahasaku.detail = detail[position]
                bahasaku.poster = bahasakuPoster[position]
                list.add(bahasaku)
            }
            return list
        }

}