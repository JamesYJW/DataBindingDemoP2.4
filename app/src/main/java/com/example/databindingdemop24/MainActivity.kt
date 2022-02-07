package com.example.databindingdemop24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemop24.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var s: Student = Student("S123","John")

        binding.myData = s
        //binding.txtID.text = s.studentID
        //binding.txtName.text = s.studentName

        binding.btnUpdate.setOnClickListener(){
            s.studentName = "Alex"

            binding.apply {
                //feresh everything
                invalidateAll()
            }
            //binding.txtName.text = s.studentName
        }
        //var tv :TextView = findingviewbyid(R.id.tvName)
    }
}