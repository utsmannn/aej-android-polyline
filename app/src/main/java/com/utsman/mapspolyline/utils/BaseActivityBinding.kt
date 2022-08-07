package com.utsman.mapspolyline.utils

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivityBinding<B: ViewBinding> : AppCompatActivity() {
    protected lateinit var binding: B

    abstract fun inflateBinding(): B

    abstract fun onCreateBinding(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateBinding()
        setContentView(binding.root)
        onCreateBinding(savedInstanceState)
    }
}