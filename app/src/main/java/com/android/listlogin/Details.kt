package com.android.listlogin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.listlogin.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {
    private var binding: ActivityDetailsBinding? = null
    private var logo = 0
    private var name: String? = null
    private var detail: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAs, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAs)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAs)

        setUpFactDetail()
    }

    private fun setUpFactDetail() {
        binding?.detailTv?.text = detail
        binding?.logoTv?.setImageResource(logo)
        title = name

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}