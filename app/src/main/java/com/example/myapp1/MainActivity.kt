package com.example.myapp1

import android.animation.Animator
import android.animation.AnimatorInflater
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val animator : Animator = AnimatorInflater.loadAnimator(this,R.animator.animator_stop)
        animator.setTarget(image_puma)
        animator.start()


        btn_Start.setOnClickListener {
            animator.resume()
        }

        btn_Stop.setOnClickListener {
            animator.pause()
        }
    }

}