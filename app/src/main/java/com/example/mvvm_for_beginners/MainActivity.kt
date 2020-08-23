package com.example.mvvm_for_beginners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvm_for_beginners.adapter.UserListAdapter
import com.example.mvvm_for_beginners.model.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        viewModel.getMutableLiveData().observe(this, Observer {
            rv_main.setHasFixedSize(true)
            rv_main.layoutManager = LinearLayoutManager(this)
            rv_main.adapter = UserListAdapter(it)
        })
    }
}