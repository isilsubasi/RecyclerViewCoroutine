package com.isilsubasi.recylerviewcoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.isilsubasi.recylerviewcoroutine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var ogrenciAdapter: OgrenciAdapter

    val ogrenciListesi = arrayListOf(
        "Muhammet ÇAĞATAY",
        "Nisa Çağatay",
        "Işıl Subaşi",
        "Sevgi Subaşi"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()


    }

    fun init() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycleView()
        initAddButton()
    }


    fun initAddButton() {
        binding.apply {
            btnEkle.setOnClickListener {

                ogrenciListesi.add(edtIsim.text.toString())
                ogrenciAdapter.notifyDataSetChanged()
            }
        }


    }


    fun initRecycleView() {


        binding.apply {

            ogrenciAdapter = OgrenciAdapter(ogrenciListesi, object : ItemClickListener {

                override fun onDelete(position: Int) {

                    ogrenciListesi.removeAt(position)
                    ogrenciAdapter.notifyDataSetChanged()
                }

                override fun onItemClick(position: Int) {

                    Toast.makeText(
                        applicationContext,
                        ogrenciListesi.get(position),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })

            rcvOgrenciler.adapter = ogrenciAdapter
            rcvOgrenciler.layoutManager =
                LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)


        }
    }


}