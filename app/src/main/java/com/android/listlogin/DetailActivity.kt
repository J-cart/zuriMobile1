package com.android.listlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.listlogin.databinding.ActivityDetailBinding
import layout.DummyData

class DetailActivity : AppCompatActivity() {

    var binding: ActivityDetailBinding? = null
    var adapter: FactAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFacts()
    }

    private fun setUpFacts(){
        adapter = FactAdapter(this, DummyData.funFacts)
        binding?.factListView?.adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}