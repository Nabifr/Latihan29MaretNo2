package com.android.latihan2recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.latihan2recycleview.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listNewsData = arrayListOf(
            ListNews("Cara Membuat Gado-Gado", "12-12-2023", "Food", R.drawable.img_gado ),
            ListNews("Sanksi FIFA untuk Indonesia", "12-12-2023", "Food", R.drawable.img_sanksi ),
            ListNews("Israel Ancam keamanan di Bali", "12-12-2023", "Food", R.drawable.img_secure ),
            ListNews("Indonesia jadi Negara Maju", "12-12-2023", "Food", R.drawable.img_maju ),
            ListNews("Erick Thohir Lelah", "12-12-2023", "Food", R.drawable.img_thohir ),
            ListNews("Jadwal Konser Blegpink", "12-12-2023", "Food", R.drawable.img_bleg ),
            ListNews("Cara Agar cepat tidur", "12-12-2023", "Food", R.drawable.img_sleep ),
            ListNews("Jadwal Imsak Underworld", "12-12-2023", "Food", R.drawable.img_under ),
            ListNews("Cara memasang Ram", "12-12-2023", "Food", R.drawable.img_2 ),
            ListNews("Sisa umur Matahari", "12-12-2023", "Food", R.drawable.img_3 )

        )

        val adapterNews = NewsAdapter(listNewsData)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val gl = GridLayout(this)
        binding.rvNews.layoutManager = lm
        binding.rvNews.adapter = adapterNews
    }
}