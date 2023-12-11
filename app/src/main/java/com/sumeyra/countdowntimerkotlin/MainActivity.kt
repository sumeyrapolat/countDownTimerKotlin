package com.sumeyra.countdowntimerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.sumeyra.countdowntimerkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)

        // counDowntşmer abstract bir class

        object: CountDownTimer(10000,1000){
            override fun onTick(millisUntilFinished: Long) {
                binding.textView.text= "Left: ${millisUntilFinished/1000}"
            }

            override fun onFinish() {
                binding.textView.text ="Left: 0"
            }

        }.start()

    }
}