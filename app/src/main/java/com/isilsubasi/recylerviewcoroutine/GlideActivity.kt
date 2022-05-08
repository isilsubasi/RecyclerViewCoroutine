package com.isilsubasi.recylerviewcoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isilsubasi.recylerviewcoroutine.databinding.ActivityGlideBinding
import com.isilsubasi.recylerviewcoroutine.databinding.ActivityMainBinding

class GlideActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGlideBinding
    var resimUrl="https://www.medipol.edu.tr/medium/GalleryImage-Image-991-2x.vsf"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlideBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            imgResim.resimCek(resimUrl)

            btnGizle.setOnClickListener {
                imgResim.kaybet()
            }

        }




    }
}